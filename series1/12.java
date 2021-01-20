import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Qunatity = input.nextInt();
        int len = 0;
        String[] arr = new String[Qunatity];
        String[] result = new String[Qunatity];
        for (int i = 0; i < Qunatity; i++)
        {
            arr[i] = input.next();
        }
        Arrays.sort(arr);
        for (int i = 0; i < Qunatity - 1; i++)
        {
            if (arr[i].equals(arr[i+1]))
            {
                continue;
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[Qunatity - 1]);
    }
}
