import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.print("Enter index 1: ");
        int position1 = sc.nextInt();
        System.out.print("Enter index 2: ");
        int position2 = sc.nextInt();
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        swap(array,position1,position2);
        System.out.print("After swapping, array becomes: "+ Arrays.toString(array));
    }
    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
