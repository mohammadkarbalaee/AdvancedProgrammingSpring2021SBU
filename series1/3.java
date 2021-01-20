import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int k = 0,n = 0;
        k = input.nextInt();
        n = CheckFactorialFunction(k);
        System.out.println(n);
    }
    public static int Factorial(int number)
    {
        int result = 1;
        for(int i = 1;i <= number;i++)
        {
            result *= i;
        }
        return result;
    }
    public static int CheckFactorialFunction(int k)
    {
        int result = 0;
        for(int i = 0;Factorial(i) <= k;i++)
        {
            result = i;
        }
        return result;
    }
}