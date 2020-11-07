package arrayofarrays;

public class ArrayOfArraysMain {
    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                if (j < 10) {
                    System.out.print("  ");
                } else if (j < 100) {
                    System.out.print(" ");
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] multiplicationTable(int size) {
        int[][] tomb = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tomb[i][j] = (i + 1) * (j + 1);
            }

        }
        return tomb;
    }

    public int[][] triangularMatrix(int size) {
        int[][] tomb = new int[size][];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = new int[i + 1];

            for (int j = 0; j < (i + 1); j++) {
                tomb[i][j] = i;
            }
        }
        return tomb;
    }

    public int[][] getValues(){
        int[][] monthsAndDays=new int[12][];
        int[] days=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<monthsAndDays.length;i++) {
        monthsAndDays[i]=new int[days[i]];
        }
            return monthsAndDays;
        }


    public static void maiwn(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        System.out.println("Multiplication table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(3));


        System.out.println("Triangularmatrix table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(3));

        System.out.println("Values per days");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
    }
}