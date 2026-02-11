public class Constructor_1 {

    String name;
    int age;

    public Constructor_1(String n,int a){
        name=n;
        age=a;
    }
    public static void main(String[]args){
        Constructor_1 obj=new Constructor_1("Dih", 67);

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
