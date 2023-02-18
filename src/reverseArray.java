import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.print("Reverse of array is: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
       int start = 0;
       int end = arr.length-1;
       while(start < end) {
           //swap
           swap(arr, start, end);
           start++;
           end--;
        }
    }
    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
}
