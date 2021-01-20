//-------------------------importing packages blcok
import java.util.Scanner;
//------------------------------------------ main class
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] InputString = new String[100000];
        int i;
        String[] tokens;
        for (i = 0;input.hasNextLine();i++)
        {
            InputString[i] = input.nextLine();
        }
        int tokenLen;
        for (int j = 0; j < i; j++)
        {
            tokens = InputString[j].split(" ");
            tokenLen = tokens.length;
            for (int k = tokenLen-1; k >= 0; k--)
            {
                System.out.printf("%s ",tokens[k]);
            }
            System.out.println();
        }
    }
}