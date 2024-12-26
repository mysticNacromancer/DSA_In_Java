// Creating a switch case that decribe the fruits color 
import java.util.Scanner;
public class SwitchCase {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruit from the following that you want description of (Apple,Banana,Chiku,Santra) :");
        String fruit = in.next();

        switch (fruit) {
            case "Apple","apple":
            System.out.println("Apple is red");
            break;

            case "Banana","banana":
            System.out.println("banana is yellow");
            break;

            case "Chiku","chiku":
            System.out.println("Chiku is brown");
            break;

            case "Santra","santra":
            System.out.println("santra is orange");
            break;
            
        }
    }
}
