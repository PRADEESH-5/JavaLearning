import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


class Car_Vandi {
  public String brand;
  public String model;
  public int year;
  
  public Car_Vandi(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
}

class SortByYear implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Car_Vandi a = (Car_Vandi) obj1;
    Car_Vandi b = (Car_Vandi) obj2;
    
    // Compare the year of both objects
    if (a.year < b.year) return -1; // The first car has a smaller year
    if (a.year > b.year) return 1;  // The first car has a larger year
    return 0; // Both cars have the same year
  }
}

public class Comparator_1 {
  public static void main(String[] args) {
    ArrayList<Car_Vandi> myCars = new ArrayList<Car_Vandi>();
    myCars.add(new Car_Vandi("BMW", "X5", 1999));
    myCars.add(new Car_Vandi("Honda", "Accord", 2006));
    myCars.add(new Car_Vandi("Ford", "Mustang", 1970));

    Comparator myComparator = new SortByYear();
    Collections.sort(myCars, myComparator);

    for (Car_Vandi c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}