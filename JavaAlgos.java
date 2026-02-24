import java.util.*;
public class JavaAlgos {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names);
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        Collections.shuffle(numbers);
        System.out.println(numbers);
        System.out.println(Collections.frequency(numbers,7));
        Collections.swap(numbers,0,1);
        System.out.println(numbers);
    }
}
