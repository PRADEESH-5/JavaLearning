public class ThisKey {
    int x;
    
    public ThisKey(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        ThisKey t=new ThisKey(5);
        System.out.print(t.x);
    }
}
