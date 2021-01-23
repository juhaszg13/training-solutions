package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFinder {
    public int findCoronaVirus(Path path) {
        int sum = 0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("koronavírus")) {
                    sum++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
        return sum;
    }

    public int findCoronaVirus2(BufferedReader bf, String word) {
        int sum = 0;
        try {
            String line;
            while ((line = bf.readLine()) != null) {
                if (line.contains(word)) {
                    sum++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
        catch(NullPointerException npe){
            throw new IllegalStateException("Cannot open file",npe);
        }


        return sum;
    }

    public static void main(String[] args) {
        CoronaVirusFinder cvf = new CoronaVirusFinder();
        System.out.println(cvf.findCoronaVirus(Path.of("index.html")));
        try {
            System.out.println(cvf.findCoronaVirus2(Files.newBufferedReader(Path.of("index.html")), "koronavírus"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
    }
}
