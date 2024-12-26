// Reverse the entered number by the user 

import java.util.Scanner;

public class ReverseEnteredNumber {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter The Number To Reverse : ");
    int num = in.nextInt();
    int res = 0;
    while(num > 0){
      int rem = num % 10;
      res = res * 10 + rem;
      num = num / 10;
    }
     System.out.println("Reverse of the entered number is : " + res);
  }
}
