public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int n[]={1,2,3};
            System.out.println(n[1]);
        }catch( Exception e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            System.out.println("The try-catch block executed");
        }
    }
}