/*
This is a mathematical calculation application. In this application, we will touch on the Pythagorean theorem, which is one of the most important parts of the subject of triangles,
which is one of the branches of geometry.
According to this rule, the sum of the squares of the catheters is equal to the square of the hypotenuse. In our application, we will find the hypotenuse of the triangle whose catheters are given.
*/


import java.util.Scanner;


public class calculating_hypotenuse_of_triangle {
    public static void main(String[] args) {
        System.out.println("Please enter the lengths of the triangle's quadrants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quadrant 'a' : ");
        int a = scanner.nextInt();

        System.out.println("Enter the quadrant 'b' : ");
        int b = scanner.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse =" +c);
    }
}
