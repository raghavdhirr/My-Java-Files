import java.util.Scanner;

public class check_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original_number, number, reverse = 0;
        System.out.print("Enter a number: ");
        original_number= sc.nextInt();
        number = original_number;
        do {
            int last_digit = number % 10;
            reverse = (reverse * 10) + last_digit;
            number/= 10;
        } while (number!=0) ;
        if(reverse == original_number) {
            System.out.print(original_number + " is a palindrome");
        } else  {
            System.out.print(original_number + " is not a palindrome");
        }
    }
}
