import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateandTime{
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formatted=dt.format(dtf);
        System.out.println(formatted);
    }
}