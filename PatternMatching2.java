import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching2 {
    public static void main(String[] args)
    {
        Pattern p= Pattern.compile(".");
        Matcher m=p.matcher("a@bc dAn12$");
        while(m.find())
        {
            System.out.println("the index of start of that occurence --- "+m.start()+ " the occurence is ----- "+m.group());
        }
    }
}
