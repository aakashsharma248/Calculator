
package calculator;
import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
       //char c=sc.nextLine().charAt(0);  (way to take char input from user)
     System.out.println("Print the first no.");
     int a=sc.nextInt();
     System.out.println("Print the second no.");
     int b=sc.nextInt();
     System.out.println("print the operation");
     sc.nextLine();
     char operation=sc.nextLine().charAt(0);
     switch(operation)
     {
         case'+':
             System.out.println(a+b);
             break;
         case'-':
             System.out.println(a-b);
             break;
         case'*':
                System.out.println(a*b);
                 break;                
          case'/':
          {
              try
              {
              System.out.println(a/b);
              break;
              }
              catch(Exception e)
              {
                  System.out.println("case of divide by zero is not allowed");
              }
              break;
          }
              default:
              System.out.println("invalid input");
     }
//     System.out.println(result);
             
     }
     
    }
    

