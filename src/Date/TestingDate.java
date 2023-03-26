package Date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestingDate {



    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, hh:mma", Locale.getDefault());
        String formattedDate = sdf.format(new Date());

        String dateText = DateFormat.getDateInstance(0).format(calendar.getTime());
        System.out.println(formattedDate);


        long now = System.currentTimeMillis();
        DateFormat obj = new SimpleDateFormat("d MMMM yyyy, hh:mma");
        // we create instance of the Date and pass milliseconds to the constructor
        Date res = new Date(now);
        // now we format the res by using SimpleDateFormat
        System.out.println(obj.format(res));

    }




}
