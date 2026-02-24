import java.util.*;
public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
