// creating a funtion that takes variable length of arguments 

import java.util.Scanner;
public class VariableArgument{
  public static void main (String[] args ){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the total numbers that you want to add");
    int count = in.nextInt();
    int[] arr = new int[count];
    System.out.println("Enter the numbers that you want to add");
    for (int i = 0; i < count; i++){
      arr[i] = in.nextInt();
    }
    System.out.println("The sum of the numbers is : "+sumNums(arr) );
  }
  static int sumNums(int... numbers){
    int sum = 0;
    for (int i = 0; i < numbers.length; i++){  
      sum = sum + numbers[i];
    }
    return sum;
  }
}
  
