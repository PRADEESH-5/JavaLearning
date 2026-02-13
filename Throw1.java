public class Throw1 {

    static void checkAge(int n){
        if(n<18){
            throw new ArithmeticException("Access denied: ");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}