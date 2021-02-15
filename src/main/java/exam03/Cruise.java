package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
      /*  if(boat.getMaxPassengers()>){
            throw new IllegalArgumentException();
        }
       else
       */

        passengers.add(passenger);

    }

    /*
        public double getPriceForPassenger(Passenger passenger){

            return passenger.;
        }

     */
    public Passenger findPassengerByName(Passenger name) {
        for (Passenger p : passengers) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }

    public List<Passenger> getPassengerNamesOrdered() {
        return Collections.sort(passengers);
    }

    public double sumAllBookingsCharged() {
        double sum = 0;
        for (Passenger p : passengers) {

        }
        return sum;
    }
    /*
    public Map<CruiseClass,Integer> countPassengerByClass() {

    }
*/
    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
