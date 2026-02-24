class Box<M>{
    M value;
    void set(M value){
        this.value=value;
    }

    M get(){
        return value;
    }
}

public class Generics_1{
    public static void main(String[] args) {
        Box<Integer> intBox=new Box();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> stringBox=new Box();
        stringBox.set("Pradeesh");
        System.out.println(stringBox.get());
    }
}
