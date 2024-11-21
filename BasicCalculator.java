// Create a basic calculator and perform the operations until user press X 

import java.util.Scanner;
public class BasicCalculator {
  public static void main (String[] args){
    
    Scanner in = new Scanner(System.in);
    char op; 
    do {
    System.out.println();
    System.out.println("Enter the operator (+, -, *, /, %, X to exit): ");
    System.out.println("Enter the Operator");
    op = in.next().charAt(0);
      
    if (op == 'X' || op == 'x'){
    System.out.println("GoodByee!!");
    break;
    };

    
    System.out.println("Enter the First Number");
    int num1 = in.nextInt();

    System.out.println("Enter the Second Number");
    int num2 = in.nextInt();

    int result;

    if (op == '+'){
      result = num1 + num2;
      System.out.println("The Addition of two numbers is = "+result); 
    }
      
    if (op == '-'){
      result = num1 - num2;
      System.out.println("The Substraction of two numbers is = "+result); 
    }
      
    if (op == '*'){
      result = num1 * num2;
      System.out.println("The Multiplication of two numbers is = "+result); 
    }
      
    if (op == '/'){
      if(num2!=0){
      result = num1 / num2;
      System.out.println("The Division of two numbers is = "+result); 
      }else {
        System.out.println("Division by 0 not allowed");
       }
    }
      
    if (op == '%'){
      result = num1 % num2;
      System.out.println("The Modulo of two numbers is = "+result); 
    }
           
    }while(true);

  }
}
