// creating the function to greet the user 
import java.util.Scanner;
public class GreetFunction {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the person: ");
        String name = in.next();
        String result = greet(name);
        System.out.println(result);
    }
    static String greet(String naam){
        return "Hey, " +naam+" have a nice day";
    }    
}
