import java.util.Scanner;

public class maxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Maximum value in this array is : "+max(array));
    }
    static int max(int[]arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue= arr[i];
            }
        }
        return maxValue;
    }

}
