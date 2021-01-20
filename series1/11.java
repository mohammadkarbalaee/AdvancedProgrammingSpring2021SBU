import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.matches("(144|14|1)*"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
