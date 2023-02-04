import java.util.Scanner;

public class sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int original_number = number;
        int count= 0;
        while(number > 0) {
            int last_digit = number % 10;
            count += last_digit;
            number/= 10;
        }
        System.out.print("Sum of digits of " + original_number + " is: " + count);
    }
}
