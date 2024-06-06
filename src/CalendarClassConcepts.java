import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassConcepts {
    public static void main(String[] args) {



        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

        System.out.println(simpleDateFormat.format(calendar.getTime()));

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR));

        /*
        Calendar come from util package.
        Calendar package babohar kore date time r o beshi property acess kora jay ja Date class e nai.
        simpleDateFormat deya date time k formate kora hoice.
        calendar.get(Calender.Day_OF_MONTh)
        calendar.get deya all property k acces kora jay ja Date class er modde nai

         */



    }
}
