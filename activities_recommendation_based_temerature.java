//In this application, I created a system that suggests activities that can be done according to the air temperature entered...

import java.util.Scanner;

public class activities_recommendation_based_temerature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature <= 5) {
            System.out.println(" Today you can go to the Snow-Board ");
        } else if (temperature > 5 && temperature <= 15) {
            System.out.println(" Today you can go to the Hot Coffee/Chocolate Cafe ");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println(" Today you can go to the Barbecue in the woods ");
        } else {
            System.out.println(" Today you can go to the Beach ");
        }
    }

}
