package lab7;
import java.util.*;

public class Sum {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5};
        int sum = 0;
       for (int num : array) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nSum of elements of the array: " + sum);
    }
}
