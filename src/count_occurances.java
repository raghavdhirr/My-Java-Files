import java.util.Scanner;

public class count_occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter any integer value: ");
            int number = sc.nextInt();
            int original_number= number;
            System.out.print("Enter the digit you want to count: ");
            int n = sc.nextInt();
            int original_n = n;
            int count = 0;
            while(number > 0) {
                int remainder = number % 10;
                if(remainder == n) {
                    count++;
                }
                number /= 10;
            }
            System.out.println("Number of "+original_n+ "'s in " + original_number +" is: " + count);
            System.out.print("Do you wish to continue?(y/n): ");
            char c = sc.next().trim().charAt(0);
            if(c == 'n') {
                break;
            }
        }

    }
}
