import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a != 0 && b != 0 && c != 0)
        {
            if(a + b + c == 180)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println("No");
        }
    }
}
