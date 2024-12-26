// Creating switch statements to describe the Weekdays and Weekends 
import java.util.Scanner;
public class SwitchWeeks {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String day= in.next();

        switch (day) {
            case "Sunday","sunday":
            System.out.println("Weekend");
            break;

            case "Monday","monday":
            System.out.println("Weekday");
            break;

            case "Tuesday","tuesday":
            System.out.println("Weekday");
            break;

            case "Wednesday","wednesday":
            System.out.println("Weekday");
            break;
            
            case "Thursday","thursday":
            System.out.println("Weekday");
            break;
            
            case "Friday","friday":
            System.out.println("Weekday");
            break;
            
            case "Saturday","saturday":
            System.out.println("Weekend");
            break;
        }

    }
   
}
