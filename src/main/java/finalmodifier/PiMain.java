package finalmodifier;
import static finalmodifier.CircleCalculator.PI;
import static finalmodifier.CircleCalculator.PI;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(PI);

        CircleCalculator circleCalculator=new CircleCalculator();
        System.out.println(circleCalculator.calculatePerimeter(10));
        System.out.println(circleCalculator.calculateArea(10));

        CylinderCalculator cylinderCalculator=new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(10,10));
        System.out.println(cylinderCalculator.calculateSurfaceArea(10,10));

    }
}
