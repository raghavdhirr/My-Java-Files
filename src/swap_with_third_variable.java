import java.util.Scanner;

public class swap_with_third_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("After swapping, 1st number becomes: "+ num1 +" and 2nd number becomes: " + num2);
    }
}
