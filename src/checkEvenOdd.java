import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer value: ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.print(n + " is Even");
        } else {
            System.out.print(n + " is odd");
        }
    }
}
