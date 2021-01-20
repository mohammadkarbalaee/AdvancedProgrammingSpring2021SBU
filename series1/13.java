import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Quantity = input.nextInt();
        String sample = input.next();
        String[] codes = new String[Quantity];
        for (int i = 0; i < Quantity; i++)
        {
            codes[i] = input.next();
        }
        String samplecode = zirAlefba(sample);
        for (int i = 0; i < Quantity; i++)
        {
            if(samplecode.equals(zirAlefba(codes[i])))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static String zirAlefba(String inputString)
    {
        String sortedString = sortString(inputString);
        String result = "";
        int k = 0;
        for (int i = 0; i < sortedString.length()-1; i++)
        {
            if (sortedString.charAt(i) == sortedString.charAt(i+1))
            {
                continue;
            }
            else
            {
                result = result + sortedString.charAt(i);
            }
        }
        return result;
    }
}