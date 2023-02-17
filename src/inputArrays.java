import java.util.Scanner;

public class inputArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];  //array of size 5
        System.out.print("Enter marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            System.out.print(marks[i] + " ");
        }
    }
}
