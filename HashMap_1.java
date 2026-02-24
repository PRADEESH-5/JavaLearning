import java.util.*;
public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, String> h=new HashMap<>();
        h.put("England", "London");
        h.put("India", "New Dehli");
        h.put("Austria", "Wien");
        h.put("Norway", "Oslo");
        h.put("Norway", "Oslo");
        h.put("USA", "Washington DC");
        System.out.println(h);

        System.out.println(h.get("England"));
        h.remove("England");
        System.out.println(h);

        System.out.println(h.size());

        for(String i:h.keySet()){
            System.out.println(i);
        }

        for(String i:h.values()){
            System.out.println(i);
        }

        h.clear();
        System.out.println(h);
    }
}

