import java.time.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Mix{
    public static void main(String[] args)
    {


        Calendar cal = Calendar.getInstance();
       cal.set(1985, 1, 8); // Assumes MM/dd/yyyy
        //cal.set(1985, 8, 1); // Assumes dd/MM/yyyy
        // cal.getTime() returns a Date object
        LocalDate birthday1 = LocalDate.of(1960, Month.JANUARY, 1);
        int count=0;
        Pattern p= Pattern.compile("ab");
        Matcher m=p.matcher("ababbababb");
        while(m.find())
        {
            count++;
            System.out.println("the index of start of that occurence: "+m.start()+" the (index+1) of end of that occurence: "+m.end()+" the occurence is: "+m.group());
        }
        System.out.println("the number of occurence "+count);
    }
}