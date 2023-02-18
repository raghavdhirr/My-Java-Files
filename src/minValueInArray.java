import java.util.Scanner;

public class minValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Minimum value is: "+ min_value(arr));
    }
    static int min_value(int[]arr) {
        if(arr.length==0) {
            return -1;
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
