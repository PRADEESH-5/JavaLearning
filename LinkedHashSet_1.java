import java.util.*;
public class LinkedHashSet_1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(9);
        l.add(0);
        l.add(9);
        l.add(2);
        l.add(6);
        l.add(4);

        System.out.println(l);
    }
}
