import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of sides");

        double numberOfSide = sc.nextDouble();

        System.out.println("Enter Number of Length");

        double numberOfLength = sc.nextDouble();

        System.out.println("Total Area of polygon is : " + areaOfPolygonal(numberOfSide, numberOfLength));


    }


    public static double areaOfPolygonal(double numberOfSide, double numberOfLength){
        double pi = Math.PI;
        double areaPolygon = (numberOfSide * Math.pow(numberOfLength, 2))/(4*Math.tan(pi/numberOfSide));
        return areaPolygon; 
    }
}