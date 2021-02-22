package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {
    private Map<String,Integer> owlsPerCounty = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;

        while ((line = reader.readLine()) != null) {
            String tmp[] = line.split("=");

                owlsPerCounty.put(tmp[0], Integer.parseInt(tmp[1]));


        }
    }

    public int getNumberOfOwls(String county) {
        if (owlsPerCounty.containsKey(county)) {
            return owlsPerCounty.get(county);
        }
    throw new IllegalArgumentException("County does not exists");
    }
}
