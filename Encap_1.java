public class Encap_1 {

    private String name;
  
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encap_1 myObj = new Encap_1();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
