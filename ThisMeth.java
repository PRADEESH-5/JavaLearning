public class ThisMeth {
    String name;
    int age;

    public ThisMeth(String name){
        this(name,67);
    }

    public ThisMeth(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[]args){
        ThisMeth obj=new ThisMeth("Dih na");

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
