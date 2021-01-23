package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class CoronaVirusFinderTest {

    @Test
    void findCoronaVirus() {
      InputStream is=  CoronaVirusFinder.class.getResourceAsStream("index.html");
      CoronaVirusFinder cvf=new CoronaVirusFinder();
      int n=cvf.findCoronaVirus2(new BufferedReader(new InputStreamReader(is)),"koronavírus");
      assertEquals(4,n);
    }
    @Test
    void findCoronaVirusWithStringReader() {
        BufferedReader bufferedReader=new BufferedReader(new StringReader("alma\nkorte\nmegy\nalma\nalma\n"));
        CoronaVirusFinder cvf=new CoronaVirusFinder();
        int n=cvf.findCoronaVirus2(bufferedReader,"alma");
        assertEquals(3,n);
    }
}