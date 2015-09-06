import java.util.Scanner;

/**
 * Created by Dinesh on 9/5/2015.
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {

        // Constant
        final double KILOGRAM_PER_POUND = 0.453593 ;
        final double METERS_PER_INCH = 0.0254 ;

        // Creating a Scanner
        Scanner input = new Scanner(System.in);

        // Enter the weight in Pound
        System.out.println("Enter the weight Pound");
        double weight = input.nextDouble();

        // Enter the height
        System.out.println("Enter the height in Inch");
        double height = input.nextDouble();

        double weightInKilogram = weight * KILOGRAM_PER_POUND ;
        double heightInMeter = height * METERS_PER_INCH ;

        double bmi = weightInKilogram / (heightInMeter * heightInMeter ) ;

        System.out.println(bmi);

    }
}
