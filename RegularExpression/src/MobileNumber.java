import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args)
    {
       String n="07656565465";
        Pattern p= Pattern.compile("(0|91)?[789]\\d{9}$");
        Matcher m=p.matcher(n);
        if((m.find() && m.group().equals(n)))
            System.out.println(n);
        else
            System.out.println("Enter valid number");
    }
}
