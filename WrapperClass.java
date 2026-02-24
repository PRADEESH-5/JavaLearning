import java.util.*;
public class WrapperClass {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        Integer myInt_1 = 5;
        Double myDouble_2 = 5.99;
        Character myChar_3= 'A';
        System.out.println(myInt_1.intValue());
        System.out.println(myDouble_2.doubleValue());
        System.out.println(myChar_3.charValue());

        Integer myInt_4 = 100;
        String myString = myInt_4.toString();
        System.out.println(myString.length());
    }

}
