import java.util.Scanner;

public class upperCase_lowerCase_specialSymbol_case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a character: ");
            char c = sc.next().trim().charAt(0);
            if (Character.isUpperCase(c)) {
                System.out.println(c + " is upper case character");
            } else if (Character.isLowerCase(c)) {
                System.out.println(c + " is lower case character");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit");
            } else {
                System.out.println(c + " is a special symbol");
            }
            System.out.print("Do you wish to continue(y/n): ");
            char ch = sc.next().trim().charAt(0);
            if (ch == 'n'){
                break;
            }
        }
    }
}
