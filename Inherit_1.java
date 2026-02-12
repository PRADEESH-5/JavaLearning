class Car {
    protected String brand = "Ford";        
    public void honk() {                    
        System.out.println("Tuut, tuut!");
    }
}

class Inherit_1 extends Car {
    private String modelName = "Mustang";    
    public static void main(String[] args) {

        Inherit_1 myCar = new Inherit_1();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
  }
}