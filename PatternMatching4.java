import java.util.regex.Pattern;

public class PatternMatching4{
    public static void main(String[] args)
    {
        Pattern p= Pattern.compile("\\s");
        String s[]=p.split("Durga Software Solutions");
        for (String s1 : s)
        {
           System.out.println(s1);
        }
    }
}
