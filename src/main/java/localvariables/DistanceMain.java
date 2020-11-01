package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        double distance1=2000.16;
        boolean exact1=true;
        Distance distance=new Distance(distance1,exact1);
        System.out.println("Distance: "+distance.getDistanceInKm());
        System.out.println(distance.isExact());
        int a=(int)distance.getDistanceInKm();
        System.out.println("Distance: "+a);
    }
}
