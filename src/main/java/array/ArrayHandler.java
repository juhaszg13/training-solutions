package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayHandler {
    public boolean contains(int[] source, int itemToFind){
        for(int item:source)
        {

            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind){
        for(int i=0;i<source.length;i++)
        {

            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler=new ArrayHandler();
        final int[] testArray=new int[]{4,5,6,7,8};

        System.out.println("contains");
        System.out.println(arrayHandler.contains(testArray,6));
        System.out.println(arrayHandler.contains(testArray,9));
        System.out.println("find");
        System.out.println(arrayHandler.find(testArray,5));
        System.out.println(arrayHandler.find(testArray,10));
    }
}
