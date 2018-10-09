import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args)
    {
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