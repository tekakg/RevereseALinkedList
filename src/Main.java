import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Taking 5 integers as input.
        for (int i = 0; i < 51; i++) {
            Scanner src = new Scanner(System.in);
            int val = src.nextInt();
            list.add(val);
        }
        //After formatting
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}