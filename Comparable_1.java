import java.util.ArrayList;
import java.util.Collections;

class Caruhhh_Mazhilunthi implements Comparable {
  public String brand;
  public String model;
  public int year;
  
  public Caruhhh_Mazhilunthi(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }

  public int compareTo(Object obj) {
  	Caruhhh_Mazhilunthi other = (Caruhhh_Mazhilunthi)obj;
    if(year < other.year) return -1;
    if(year > other.year) return 1;
    return 0;
  }
}

public class Comparable_1 {
  public static void main(String[] args) {
    ArrayList<Caruhhh_Mazhilunthi> myCars = new ArrayList<Caruhhh_Mazhilunthi>();
    myCars.add(new Caruhhh_Mazhilunthi("BMW", "X5", 1999));
    myCars.add(new Caruhhh_Mazhilunthi("Honda", "Accord", 2006));
    myCars.add(new Caruhhh_Mazhilunthi("Ford", "Mustang", 1970));

    Collections.sort(myCars);

    for (Caruhhh_Mazhilunthi c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}