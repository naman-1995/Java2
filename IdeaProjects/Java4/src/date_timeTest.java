import sun.util.calendar.JulianCalendar;

import java.text.SimpleDateFormat;
import java.util.*;
public class date_timeTest {

    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.toString());

        SimpleDateFormat dateFormat=new SimpleDateFormat("yy/M/dd h:mm:s");
        Date theDate=new Date();

        System.out.println(dateFormat.format(theDate));
        Calendar cal=new GregorianCalendar();
        System.out.println(cal);


    }
}
