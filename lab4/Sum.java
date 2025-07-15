package lab4;
import java.util.*;

public class Sum {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = input.nextInt();//121
        int sum = 0;
        while (num != 0) {//0
            sum += num%10;//0+121%10=1
            num /= 10; 
        }
        System.out.println("Sum of the Digits:" +sum);
        input.close();

    }
}