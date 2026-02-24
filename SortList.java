import java.util.*;
public class SortList {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(3);
        l.add(8);
        l.add(9);
        l.add(2);
        l.add(1);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}