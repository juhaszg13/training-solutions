package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        String line;
        int items;
        try {
            while ((line = reader.readLine()) != null) {
                items=Integer.parseInt(line);
                for(int i=0;i<items;i++){
                sb.append("*");
                }
            sb.append("\n");
            }
            }catch(IOException ioe){
                throw new IllegalStateException("Cannot open file", ioe);
            }
       return sb.toString();
        }


    public static void main(String[] args) {
       Histogram histogram=new Histogram();
        BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("histogram.txt")));
       System.out.println(histogram.createHistogram(reader));
    }
}