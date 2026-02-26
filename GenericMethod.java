
public class GenericMethod {
    public static <T> void printArray(T[] a){
        for(T i :a )System.out.print(i+" ");

        System.out.println();
    }

    public static void main(String[] args) {
        String[] names={"Pradeesh", "Rupanarayanan", "Idrees"};

        Integer[] nums={1,2,3,4,5,6,7,8,9,0};

        printArray(names);
        printArray(nums);
    }
}
