package week12d05;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDownLoader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.training360.com");
            InputStream content=url.openStream();
            CoronaVirusFinder coronaVirusFinder=new CoronaVirusFinder();
            int n=coronaVirusFinder.findCoronaVirus2(new BufferedReader(new InputStreamReader(content)),
                  "informatikai");
            System.out.println(n);
        }
        catch(MalformedURLException malformedURLException){
            System.out.println("Rossz az url!");
        }
        catch(IOException ioe){
            System.out.println("Nem tudom megnyitni");
        }
    }
}
