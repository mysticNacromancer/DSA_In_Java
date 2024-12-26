// Creating a nested switch statement to represent the emp id and emp department
// nested switch - switch statement into another switch 

import java.util.Scanner;

public class NestedSwitch{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Employee ID: ");
    int empId = in.nextInt();
    System.out.println("Enter the department");
    String dept = in.next();

    switch (empId){
      case 101:
        System.out.println("Employee ID: 101");
        switch (dept){
          case "Hr","hr":
            System.out.println("Department : Human Resources");
          break;
          case "It","it":
            System.out.println("Department : Information Technology");
          break;
          default :
            System.out.println("Department : Unknown");
        }
        break;
        
      case 102:
        System.out.println("Employee ID: 102");
        switch (dept){
          case "Finance","finance":
            System.out.println("Department : Finance");
          break;
          case "Admin","admin":
            System.out.println("Department : Administration");
          break;
          default :
            System.out.println("Department : Unknown");
        }
        break;
      
      default : 
         System.out.println("Unknown Employee Id");
    }
  }
}
