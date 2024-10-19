/*We will make an application that calculates
Body Mass Index based on the height and weight values entered by the user.*/
import java.util.Scanner;


public class body_mass_index {
    public static void main(String[] args) {

    System.out.println(" Please enter your height in meters: ");
    Scanner scanner = new Scanner(System.in);
    double height = scanner.nextDouble();

    System.out.println(" Please enter your weight in kilograms: ");
    double weight = scanner.nextDouble();

    double mass = height / (weight*weight);

        System.out.println(" Your Body Mass İndex is : " +mass);
    }
}
