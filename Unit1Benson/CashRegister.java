import java.util.Scanner;
/**
 * Computes how much change is due from an amount of money
 * 
 * @author Freya 
 * @version 9-25-17
 */
public class CashRegister
{
        public static void main(String args[]) //memorize this line
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Total amount due:");
            int amountDue = keyboard.nextInt();
            System.out.println("Total amount paid:");
            int amountPaid = keyboard.nextInt();
            int centsDue = amountPaid - amountDue;
            System.out.println("Your change is:");
            int dollarsDue = centsDue / 100;
            centsDue -= dollarsDue * 100;
            int quartersDue = centsDue / 25;
            centsDue -= quartersDue * 25;
            int dimesDue = centsDue / 10;
            centsDue -= dimesDue * 10;
            int nickelsDue = centsDue / 5;
            centsDue -= nickelsDue * 5;
            int penniesDue = centsDue;
            System.out.println(dollarsDue + " " + "dollars");
            System.out.println(quartersDue + " " + "quarters");
            System.out.println(dimesDue + " " + "dimes");
            System.out.println(nickelsDue + " " + "nickels");
            System.out.println(penniesDue + " " +"pennies");
        }
    }
        
          
    