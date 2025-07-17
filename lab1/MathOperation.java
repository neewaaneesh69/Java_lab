package lab1;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first positive number: " );
    int num1 = input.nextInt(); 
    System.out.print("Enter Second Positive number: " );
    int num2 = input.nextInt();
     
    int sum = num1 + num2;
    int product = num1 * num2;
    int remainder = num1 % num2;
    int quoitent = num1/num2;
    double average = sum/2.0;

    System.out.println("sum is:"+sum);
    System.out.println("product is:"+product);
    System.out.println("quoitent is:"+quoitent);
    System.out.println("remainder is:"+remainder);
    System.out.println("average"+average);





    input.close();
    }
}
