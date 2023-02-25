import java.util.Arrays;
import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter " + rows1*cols1 + " elements: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows of second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter " + rows2*cols2 + " elements: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if(cols1 != rows2){
            System.out.print("Error: Matrix multiplication not possible!");
            return;
        }
        System.out.println("Resultant matrix:");
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i <rows1 ; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < rows2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for(int[] a : result) {
            System.out.println(Arrays.toString(a));
        }
    }
}