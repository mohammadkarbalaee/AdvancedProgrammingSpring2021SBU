import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Quantity = input.nextInt();
        String[] array = new String[Quantity];
        int[] lengthArray = new int[Quantity];
        for(int i = 0;i < Quantity;i++)
        {
            array[i] = input.next();
            lengthArray[i] = zirAlefba(array[i]).length();
        }
        int longest = 0;
        for (int i = 0; i < Quantity; i++)
        {
            if(lengthArray[i] > longest)
            {
                longest = lengthArray[i];
            }
        }
        System.out.println(longest);
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
        for (int i = 0; i < sortedString.length() - 1; i++)
        {
            if (sortedString.charAt(i) == sortedString.charAt(i+1))
            {
                continue;
            }
            else
            {
                result += sortedString.charAt(i);
            }
        }
        result += sortedString.charAt(sortedString.length()-1);
        return result;
    }
}