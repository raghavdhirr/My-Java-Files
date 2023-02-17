import java.util.Arrays;
import java.util.Scanner;

public class inputIn2Darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int [][] matrix = new int [rows][cols];
        System.out.println("Enter elements of " + rows + "*" + cols +" matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        //Print the 2D array--
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
