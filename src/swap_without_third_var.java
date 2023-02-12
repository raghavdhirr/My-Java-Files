import java.util.Scanner;

public class swap_without_third_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After swapping, 1st number becomes: " + a + " and 2nd number becomes: " + b);

    }
}
