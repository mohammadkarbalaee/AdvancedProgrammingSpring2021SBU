//-------------------------calling libraries blcok
import java.util.Scanner;
//------------------------------------------
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lengthOfArray = input.nextInt();
        int[] array = new int[lengthOfArray];
        for(int i = 0;i < lengthOfArray;i++)
        {
           array[i] = 0;
        }
        String commands = input.next();
        int lengthOfCommands = commands.length();
        int position = 0;
        for(int i = 0;i < lengthOfCommands;i++)
        {
            if(commands.charAt(i) == '+')
            {
                array[position]++;
            }
            else if(commands.charAt(i) == '-')
            {
                array[position]--;
            }
            else if(commands.charAt(i) == '>')
            {
                if(position < lengthOfArray - 1)
                {
                    position++;
                }
                else if(position == lengthOfArray - 1)
                {
                    position = 0;
                }
            }
            else if(commands.charAt(i) == '<')
            {
                if(position > 0)
                {
                    position--;
                }
                else if(position == 0)
                {
                    position = lengthOfArray - 1;
                }
            }
        }
        for(int i = 0;i < lengthOfArray;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}