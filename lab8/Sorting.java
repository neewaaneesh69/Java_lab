package lab8;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
        System.out.println("Enter the Size of an array:");
        int size = input.nextInt();
        int[] array = new int [size];
        
        System.out.println("enter "+size+" elements:");
        for(int i=0; i<array.length; i++){
            array[i]= input.nextInt();
        }
         for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.print("Sorted array: ");
             for (int num : array) {
               System.out.print(num + " ");
             }

        input.close();
    }
}
