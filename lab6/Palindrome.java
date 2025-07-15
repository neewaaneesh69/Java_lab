package lab6;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = input.nextInt();
        int original = num;
        int reverse = 0;
       
        while (num != 0) {//121
            int sum = num % 10;//121%10=1
            reverse = reverse * 10 + sum;//0*10+1=1
            num = num / 10;//121/10=1
            
        } if(reverse == original ){
        System.out.println( original +"is palindrome.");
        } else {
            System.out.println( original +"is not palindrome.");
        }

        input.close();

    }
    
}
