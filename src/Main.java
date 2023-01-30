import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Taking 5 integers as input.
        int siz=5;
        for (int i = 0; i < siz; i++) {
            Scanner src = new Scanner(System.in);
            int val = src.nextInt();
            list.add(val);
        }
        //After formatting
        System.out.println(list);
        for(int i=0;i<siz/2;i++)
        {
            int startElement=list.get(i);
            int lastElement=list.get(siz-i-1);
            list.set(siz-i-1,startElement);
            list.set(i,lastElement);
        }
        System.out.println(list);
    }
}