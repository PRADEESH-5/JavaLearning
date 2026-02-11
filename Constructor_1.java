public class Constructor_1 {
int modelYear;
String modelName;

public Constructor_1(int year, String name) {
    modelYear = year;
    modelName = name;
}

public static void main(String[] args) {
    Constructor_1 myCar = new Constructor_1(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
