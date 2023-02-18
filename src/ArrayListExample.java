import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(17);
//        list.add(27);
//        list.add(57);
//        list.add(78);
//        list.add(907);
//        list.add(9706);
//        list.add(9856);
//        list.add(684);
//        list.add(41);
//        list.add(652);
//        list.add(423);
//        list.add(464);
//        list.add(77);
//        list.add(4652);
//        System.out.print(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //print
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
    }
}
