package week13d02;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightDatas {
    private InputStream fileName;
    private List<String> flights = new ArrayList<>();

    public FlightDatas(InputStream fileName) {
        this.fileName = fileName;
        readFromFile();
    }

    private List<String> readFromFile() {
        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileName))) {
            while ((line = br.readLine()) != null) {
                flights.add(line);
            }
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
        return flights;
    }

    public String  arrivalOrDepartureIsMore() {
        String result="";
        int numberOfDepartureFlight = 0;
        int numberOfArrivalFlights = 0;
        String[] tmp;
        for (String flight : flights) {
            tmp = flight.split(" ");
            if (tmp[1].equals("Arrival")) {
                numberOfArrivalFlights++;
            }
            if (tmp[1].equals(("Departure"))) {
                numberOfDepartureFlight++;
            }

            result=arrivalOrDepartureIsMore(numberOfDepartureFlight, numberOfArrivalFlights);
        }
        return result;
        }

    public String arrivalOrDepartureIsMore(int numberOfArrivalFlights,int numberOfDepartureFlight){
        if(numberOfArrivalFlights>numberOfDepartureFlight){
            return "Arrival flights is more";
        }
        if(numberOfDepartureFlight>numberOfArrivalFlights){
            return "Departure flights is more";
        }else{
            return "Number of departures and arrivals are equal";
        }
    }


    public String flightByFlightNumber(String flightNumber) {
        for (String flight : flights) {
            String[] tmp = flight.split(" ");
            if (tmp[0].trim().equals(flightNumber)) {
                return flight;
            }
        }
        throw new IllegalArgumentException("Wrong flight number");
    }

    public List<String> flightsByCityAndArrOrDep(String arrOrDep, String city) {
        List<String> selectedFlights = new ArrayList<>();
        for (String flight : flights) {
            String[] tmp = flight.split(" ");
            if (tmp[2].trim().equals(city) && tmp[1].trim().equals(arrOrDep)) {
                selectedFlights.add(flight);
            }
        }
        return selectedFlights;
    }

    public String earliestFlight() {

        List<String> departureFlights = new ArrayList<>(createDepartureFlights());
        if (departureFlights.size() == 0) {
            throw new IllegalStateException("Empty List");
        }

        String earliestFlight = departureFlights.get(0);
        if (departureFlights.size() == 1) {
            earliestFlight = departureFlights.get(0);
        }

        if (departureFlights.size() > 1) {
            LocalTime earliestTime = LocalTime.MAX;
            for (int i = 1; departureFlights.size() > i; i++) {

                String[] tmp = departureFlights.get(i).split(" ");
                String str = tmp[3];
                str = String.format("%02d:%02d", Integer.parseInt(str.split(":")[0].trim()),
                        Integer.parseInt(str.split(":")[1].trim()));
                try {
                    LocalTime time = LocalTime.parse(str, DateTimeFormatter.ofPattern("HH:mm"));
                    if (time.isBefore(earliestTime)) {
                        earliestTime = time;
                        earliestFlight = departureFlights.get(i);
                    }

                } catch (IllegalStateException ise) {
                    throw new IllegalArgumentException("Wrong time format", ise);
                }
            }
        }
        return earliestFlight;
    }

    private List<String> createDepartureFlights() {
        List<String> departureFlights = new ArrayList<>();
        for (String flight : flights) {
            String[] tmp = flight.split(" ");
            if (tmp[1].trim().equals("Departure")) {
                departureFlights.add(flight);
            }
        }
        return departureFlights;
    }


    public static void main(String[] args) {
        FlightDatas flightDatas = new FlightDatas(FlightDatas.class.getResourceAsStream("/week13d02/cities.txt"));
        System.out.println(flightDatas.flights.toString());
        System.out.println(flightDatas.arrivalOrDepartureIsMore());
        System.out.println(flightDatas.flightByFlightNumber("PI9286"));
        System.out.println(flightDatas.flightsByCityAndArrOrDep("Departure", "Oslo").toString());
        System.out.println(flightDatas.earliestFlight());
    }
}
