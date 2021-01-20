import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        long n;
        int TempSum,output,TempDigits;
        n = input.nextLong();
        while(true)
        {
            TempSum = SumOfDigits(n);
            TempDigits = NumberOfDigits(n);
            if (TempDigits == 1)
            {
                output = TempSum;
                break;
            }
            n = TempSum;
        }
        System.out.println(output);
    }
    public static int SumOfDigits(long number)
    {
        int sum = 0;
        while (number > 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int NumberOfDigits(long number)
    {
        int DigitsCount = 0;
        if(number != 0)
        {
            while(number > 0)
            {
                number /= 10;
                DigitsCount++;
            }
        }
        else if(number == 0)
        {
            return 1;
        }
        return DigitsCount;
    }
}