import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int original_num = number;
        int reverse = 0;
        while(number > 0) {
            int last_digit= number % 10;
            reverse = (reverse * 10) + last_digit;
            number/= 10;
        }
        System.out.print("Reverse of "+ original_num + " is: " + reverse);
    }
}
