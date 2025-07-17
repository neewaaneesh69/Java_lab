package lab9;
import java.util.*;
public class SumMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of row & col:");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] matrix1 = new int [row] [col];
        int[][] matrix2 = new int [row] [col];
        int[][] sum = new int [row] [col];

        System.out.println("Enter first matrix elements:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            System.out.print("Enter["+(i+1)+(j+1)+"]:");
            matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            System.out.print("Enter["+(i+1)+(j+1)+"]:");
            matrix2[i][j] = input.nextInt();
            }
        }
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrix1 & matrix2 :");
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j]+"\t");
            }
             System.out.println();
        }
        input.close();
    }
}
