import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2=scanner.nextDouble();

        double sum = num1+num2;
        System.out.println("Summary of theese numbers = " + sum) ;
        double subtract = num1-num2;
        System.out.println("Substraction of theese numbers = " +subtract);
        double multiplic = num1*num2;
        System.out.println("Multiplication of theese numbers = " + multiplic);
        double division = num1/num2;
        System.out.println("Division of theese numbers = " +division);


    }
}
