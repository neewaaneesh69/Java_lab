package lab3;

import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter length:");
        int length = input.nextInt();
        System.out.print("enter breadth:");
        int breadth = input.nextInt();

        int area = length * breadth;
        System.out.print("The area of rectangle is:"+area);
        input.close();
    }
}

