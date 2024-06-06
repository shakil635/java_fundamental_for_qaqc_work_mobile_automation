import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDateClassConcepts {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        /*
        util package Date comes
        date formet MM is uper case.
        jodi formet korte chai tahole text package babohar kore hobe.
        SimpleDateFormat deya korte hobe,SimpleDateFormat akta String  parametert ney.
        .format() er modde parameter j date k formate korte chai ta dete hoy

         */
        System.out.println(simpleDateFormat.format(date));
        System.out.println(date);


    }
}
