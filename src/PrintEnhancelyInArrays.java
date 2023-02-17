import java.util.Arrays;
import java.util.Scanner;

public class PrintEnhancelyInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in 5 subjects: ");
        int [] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(marks)); //this method automatically adds brackets, commas and everything and prints the output more enhancely

        String [] str = new String[4];
        System.out.print("Enter names: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));
    }

}
