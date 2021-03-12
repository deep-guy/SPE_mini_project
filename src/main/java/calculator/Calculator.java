
import java.util.*;

public class Calculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("");

        while(true) {
            System.out.println("(1) Square Root");
            System.out.println("(2) Factorial");
            System.out.println("(3) Natural log");
            System.out.println("(4) Power Function");
            System.out.println("(5) Exit");

            System.out.print("Enter your choice : ");
            int option = 0;
            try{
                option = in.nextInt();
            } catch(InputMismatchException error){
                System.out.println("Invalid input. Calculator is shutting down.");
                return;
            }
            if(option < 1 || option > 5)
                System.out.print("Entered input is invalid");
            else if(option == 5)
                break;
            else
            {
                double op1 = 0;
                double op2 = 0;
                System.out.print("Enter operand: ");
                try{
                    op1 = in.nextDouble();
                } catch(InputMismatchException error){
                    System.out.println("Invalid input. Calculator is shutting down.");
                    return;
                }
                if(option == 1)
                {
                    if(op1 < 0){
                        System.out.println("Invalid input for Square root. Cannot be a negative number");
                    }
                    else{
                        double result = squareRoot(op1);
                        System.out.println("Square root of " + op1 + " = " + result);
                        System.out.println("");
                    }
                }


                else if(option == 2)
                {
                    if(op1 < 0){
                        System.out.println("Invalid input for factorial. Cannot be a negative number");
                        System.out.println("");
                    }
                    else{
                        System.out.println("Decimal Inputs have been typecast to integer");
                        int fact = (int)op1;
                        int result = Factorial(fact);
                        System.out.println("Factorial of " + fact + " = " + result);
                        System.out.println("");
                    }
                    
                }
                else if(option == 3)
                {
                    double result = natlog(op1);
                    System.out.println("Natural log of " + op1 + " = " + result);
                    System.out.println("");
                }
                else if(option == 4)
                {
                    System.out.print("Enter power: ");
                    try{
                        op2 = in.nextDouble();
                    } catch(InputMismatchException error){
                        System.out.println("Invalid input. Calculator is shutting down.");
                        return;
                    }

                    double result = power(op1,op2);
                    System.out.println(op1 + " to the power " + op2 + " = " + result);
                    System.out.println("");
                }
            }

        }
    }

    public static double squareRoot(double a){
        return Math.sqrt(a);
    }

    public static int Factorial(int a){
        if(a == 0)
            return 1;
        else
            return a*Factorial(a-1);
    }

    public static double natlog(double a){
        return Math.log(a);
    }

    public static double power(double a, double b){
        return Math.pow(a,b);
    }
}