package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfTheWeek=new String[] {"Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap"};
        System.out.println(daysOfTheWeek[1]);
        System.out.println("A tömb hossza: "+daysOfTheWeek.length);

        int[] kettoHatvanyai=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Kettó "+i+". hatványa:"+Math.pow(2,i));
        }
    boolean[] trueAndFalse=new boolean[6];
      for(int i=0;i<6;i++){
          if(i%2==0){
              trueAndFalse[i]=false;
          }
          else{
              trueAndFalse[i]=true;
          }
          System.out.println("Az "+(i+1)+" . elem: "+trueAndFalse[i] );
      }
    }

}
