// creating a function that returns the sum of two numbers 

import java.util.Scanner;
public class SumOfNums {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a = in.nextInt();
        System.out.println("Enter the second num: ");
        int b = in.nextInt();

        int result = addnum(a , b);
        System.out.println("the sum of two numbers is: "+ result);
    }
    static int addnum(int a , int b){
        int sum;
        sum = a + b;
        return sum;
    }   
}
