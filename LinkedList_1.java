import java.sql.SQLOutput;
import java.util.*;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();

        for(int i=1;i<=5;i++){
            l1.add(i);
        }
        System.out.println(l1);
        System.out.println(l1.get(1));
        l1.set(3,7);
        System.out.println(l1);
        l1.remove(4);
        System.out.println(l1);
        System.out.println(l1.contains(2));
        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(7));
        l1.clear();
        System.out.println(l1);
        l1.iterator();
        System.out.println(l1);
    }
}