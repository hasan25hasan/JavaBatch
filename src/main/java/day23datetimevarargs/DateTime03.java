package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ltd=LocalDateTime.now();
        System.out.println(ltd);//2023-06-10T22:22:23.306355

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedLdt=dtf.format(ltd);
        System.out.println(formattedLdt);



    }
}
