import java.util.Scanner;
/**
 * 
 * 
 * @author Freya
 * @version 9-27-17
 */
public class CircleCircumscribed
{
   public static void main(String [] args){
               Scanner keyboard = new Scanner(System.in); 
               prn("What is the length of a?");
               int a = keyboard.nextInt();
               prn("What is the length of b?");
               int b = keyboard.nextInt();
               double c = Math.sqrt(a * a + b * b);
               prn("Circumference is " + (c * Math.PI));
    }
        static void prn(String q) {
        System.out.println(q);
    }
}