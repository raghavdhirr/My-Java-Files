import java.util.Arrays;
import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String input: ");
        String str = sc.next();
        System.out.print("Enter the target character: ");
        char target = sc.next().trim().charAt(0);
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.print(searchChar(str,target));
    }
    static boolean searchChar(String str, char target) {
        if(str.length()==0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
