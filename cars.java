import java.util.Scanner;

public class cars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println ( " Welcome to the cars program ");
        System.out.println (" 1. BMW \n 2.Rolls Royce \n 3.Audi \n 4.Lamborghini");
        int choosen = input.nextInt();

        switch (choosen) {
            case 1:
                System.out.println ( " M5-E60, I7, M4 Cabrio, I8, M3 E46 ");
                break;
            case 2:
                System.out.println(" Cullinan, Ghost, Spectre, Dawn, Phantom ");
                break;
            case 3:
                System.out.println(" A6 , RS6 Quattro , RS7 Sportback, A3, Q8 ");
                break;
            case 4:
                System.out.println(" Revuelto, Avendator, Huracan, Urus, Sesto Elemento");
                break;
            default:
                System.out.println( " Undefinde Choosen " );
        }

    }
}