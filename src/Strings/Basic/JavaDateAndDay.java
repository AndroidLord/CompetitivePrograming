package Strings.Basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class JavaDateAndDay {


    static String findDay(int Day, int Month, int Year){


        LocalDate localDate = LocalDate.of(Year,Month,Day);



        return localDate.getDayOfWeek().name();
    }


}
