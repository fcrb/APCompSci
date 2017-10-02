import java.util.Scanner;
/**
 * computes average miles per gallon
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GallonsOfGas
{ 
    public static void main(String [] args){
        cls();
        Scanner keyboard = new Scanner(System.in); 
        prn("How much gas did you use in gallons?");
        double gallons = keyboard.nextDouble();
        prn("What's the price per gallon?");
        double price = keyboard.nextDouble();
        prn("Odometer reading before the trip in miles?");
        int beforeOdom = keyboard.nextInt();
        prn("Odometer reading after the trip in miles?");
        int afterOdom = keyboard.nextInt();
        System.out.format("%.2f mpg\n", (afterOdom - beforeOdom) / gallons);
        System.out.format("$%.2f spent", gallons * price);
    }

    static void prn(String q) {
        System.out.println(q);
    }

    static void cls() {
        for(int i = 0; i < 50; ++i) {
            System.out.println("");
        }
    }
}