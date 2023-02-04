import java.util.Scanner;

public class count_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter any integer value: ");
            int number = sc.nextInt();
            int original_number= number;
            int count= 0;
            while(number>0) {
                number/= 10;
                count++;
            }
            System.out.println("Number of digits in "+original_number+" are: "+count);
            System.out.print("Do you wish to continue?(y/n): ");
            char ch = sc.next().trim().charAt(0);
            if(ch== 'n') {
                break;
            }
        }

    }
}
