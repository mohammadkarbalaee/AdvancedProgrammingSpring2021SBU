//-------------------------importing packages blcok
import java.util.Scanner;
//------------------------------------------ main class
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int QuantityOfIPs = input.nextInt();
        String[] IP = new String[QuantityOfIPs];
        for (int i = 0; i < QuantityOfIPs; i++)
        {
            IP[i] = input.next();
        }
        for (int i = 0; i < QuantityOfIPs; i++)
        {
            if(RegexIPcheck(IP[i]))
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("invalid");
            }
        }
    }
    public static boolean RegexIPcheck(String ip)
    {
        String sectionCheck = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String dot = "\\.";
        return ip.matches(sectionCheck + dot + sectionCheck + dot + sectionCheck + dot + sectionCheck);
    }
}