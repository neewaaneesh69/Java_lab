package lab3;

import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter length:");
        int length = input.nextInt();
        System.out.println("enter breadth:");
        int breadth = input.nextInt();

        int area = length * breadth;
        System.out.println("The area of rectangle is:"+area);
        input.close();
    }
}

