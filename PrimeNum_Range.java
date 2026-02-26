import java.util.*;
public class PrimeNum_Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range: ");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime!");
            return;
        }

        for(int i=2;i<=n;i++){
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
