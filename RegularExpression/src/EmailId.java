import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId {
    public static void main(String[] args)
    {
        String n="trinadhreddy63@gmail.com";
        Pattern p= Pattern.compile("[a-zA-Z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+[.]([a-zA-z]+)*");
        Matcher m=p.matcher(n);
        if((m.find() && m.group().equals(n)))
            System.out.println(n);
        else
            System.out.println("Enter valid emailId");
    }
}
