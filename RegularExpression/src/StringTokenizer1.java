import java.util.StringTokenizer;
public class StringTokenizer1 {
    public static void main(String[] args)
    {
        StringTokenizer s=new StringTokenizer("27-04-2017","-");
        while(s.hasMoreTokens())
        {
            System.out.println(s.nextToken());
        }
    }
}
