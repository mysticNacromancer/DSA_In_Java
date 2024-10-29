Q4) find the occurences of the digit in a number 

import java.util.Scanner;
public class OccurencesOfDigit{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = in.nextInt();
    int count = 0;
    System.out.println("Enter the digit to count the occurences: ");
    int n = in.nextInt();
    while (num > 0){
      int rem = num % 10;
      num = num / 10;
      if (rem == n) {
        count++;
      }
    }
    System.out.println("The Occurence of the digit inside the number is: "+ count);
  }
}
