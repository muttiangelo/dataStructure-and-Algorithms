package HackerRank;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Loop1 {

    public static void main(String[] args){
        int N = 7;

        Calendar calendar = Calendar.getInstance();
        calendar.set(1992, 4, 20);

        int dayOfWeek =calendar.get(Calendar.DAY_OF_WEEK);


        switch (dayOfWeek)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

        }

    }
}
