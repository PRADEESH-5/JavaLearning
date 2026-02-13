public class TryCatch{
    public static void main(String[] args) {
        int[] n={1,2,3};
        try{
            System.out.println(n[10]);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}