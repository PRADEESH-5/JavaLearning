enum Status{
    Running, Failed, Pending, Success;
}


public class Enum1{
    public static void main(String[] args) {
        int i=5;
        Status s=Status.Pending;
        System.out.println(s.ordinal());
    }
}