import java.util.Scanner;
public class maxValueOfArrayInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++) {
          array[i] = sc.nextInt();
        }
        System.out.print("Enter 1st index: ");
        int index1 = sc.nextInt();
        System.out.print("Enter 2nd index: ");
        int index2 = sc.nextInt();
        System.out.print("Maximum value between index"+ index1+" and "+index2+" is: "+maxInRange(array, index1,index2));
    }

    static int maxInRange(int[]arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end ; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
