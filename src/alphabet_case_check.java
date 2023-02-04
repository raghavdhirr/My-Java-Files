import java.util.Scanner;

public class alphabet_case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any upper case or lower case alphabet: ");
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
           System.out.print("Lower case character entered");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.print("Upper case character entered");
        }

    }
}

