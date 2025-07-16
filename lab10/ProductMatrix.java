            package lab10;

            import java.util.Scanner;

            public class ProductMatrix {
                public static void main(String[] args){
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter matrix1:");
                    int row1 = input.nextInt();
                    int col1 = input.nextInt();

                    System.out.print("Enter matrix2:");
                    int row2 = input.nextInt();
                    int col2 = input.nextInt();
                    if(col1 != row2){
                        System.out.println("Matrix Multiplication not possible!");
                    }else{
                        int[][] matrix1 = new int [row1] [col1];
                        int[][] matrix2 = new int [row2] [col2];
                        int[][] product = new int [row1] [col2];
                    

                        System.out.println("Enter first matrix elements:");
                        for(int i=0; i<row1; i++){
                        for(int j=0; j<col1; j++){
                        System.out.print("Enter["+(i+1)+(j+1)+"]:");
                        matrix1[i][j] = input.nextInt();
                        }
                        }
                        System.out.println("Enter second matrix elements:");
                        for(int i=0; i<row2; i++){
                        for(int j=0; j<col2; j++){
                        System.out.print("Enter["+(i+1)+(j+1)+"]:");
                        matrix2[i][j] = input.nextInt();
                        }
                        }
                
                        //product
                        for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col2; j++) {
                            for(int k=0; k< col1; k++){
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                            }
                        }
                    }

                        System.out.println("Product of matrix1 & matrix2 :");
                        for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col2; j++) {
                            System.out.print(product[i][j]+"\t");
                        }
                        System.out.println();
                    }

                    }
                    input.close();
                }
            }
