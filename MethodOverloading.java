// creating a same function of different arguments 

import java.util.Scanner;
public class MethodOverloading{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the first number : ");
    int a = in.nextInt();
    System.out.println("Enter the second number : ");
    int b = in.nextInt();
    int sum = twoNums(a ,b);
    System.out.println("Sum of two numbers is  : "+sum);
    
  }
  
  static int twoNums(int a ,int b){
    int sum = a + b;
    return sum;
  }
  
  static int threeNums(int a,int b, int c){
    int sum = a + b + c;
    return sum;
  }
  
  static double twoNums(double a, double b){
    double sum = a + b;
    return sum;
  }

}
