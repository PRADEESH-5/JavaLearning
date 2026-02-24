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

    }
}
