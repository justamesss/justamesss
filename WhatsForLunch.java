import java.util.Scanner;
public class WhatsForLunch {

    public static void main(String[] args) {

        //creating scanner object

        Scanner key = new Scanner(System.in);

        //collecting values

        System.out.println("Enter entree");

        String entree = key.next();

        System.out.println("Enter side");

        String side = key.next();

        System.out.println("Enter Drink");

        String drink = key.next();

        //print values

        System.out.println("Entree: "+entree);

        System.out.println("Side: "+side);

        System.out.println("Drink: "+drink);

    }
}