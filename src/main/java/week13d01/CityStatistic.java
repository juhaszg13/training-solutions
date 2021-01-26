package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityStatistic {
    public String findLongestCityName(Path path) {
        String result;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            skipHeader(br);
            result = maxLengthCity(br);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot open file", ioe);
        }
        return result;
    }

    private void skipHeader(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
    }

    private String maxLengthCity(BufferedReader br) throws IOException {
        int lineNumber=1;
        String line;
        String maxLength = "";
        while ((line = br.readLine()) != null) {
            lineNumber++;
            String city = splitLine(line,  lineNumber);

            if (city.length() > maxLength.length()) {
                maxLength = city;
            }

        }
        return maxLength;
    }

    private String splitLine(String line, int lineNumber) throws IOException {
        String[] tmp = line.split(";");
        if (tmp.length > 1) {
            return tmp[1].trim();
        }
        throw new IOException("Wrong line " + line+ "in line "+lineNumber);
    }

    public static void main(String[] args) {
        System.out.println(new CityStatistic().findLongestCityName(Path.of(
                "src/main/resources/week13d01/iranyitoszamok-varosok-2021.txt")));
    }
}
