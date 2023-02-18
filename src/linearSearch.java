import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int ans = search(array, target);
        System.out.print("Target found at index:"+ans);
    }
    static int search(int[]arr, int target) {
        if(arr.length==0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target) {
                return i;
            }
        }
        return -1;
    }

}
