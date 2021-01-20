import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String Inputstr = input.next();
        int condition = charCheckFunction(0,'h',Inputstr);
        if(condition != -1)
        {
            condition = charCheckFunction(condition,'e',Inputstr);
            if(condition != -1)
            {
                condition = charCheckFunction(condition,'l',Inputstr);
                if(condition != -1)
                {
                    condition = charCheckFunction(condition,'l',Inputstr);
                    if(condition != -1)
                    {
                        condition = charCheckFunction(condition,'o',Inputstr);
                        if(condition != -1)
                        {
                            System.out.println("YES");
                        }
                        else
                        {
                            System.out.println("NO");
                        }
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static int charCheckFunction(int startingStage,char indexChar,String str)
    {
        int len = str.length();
        char currentCharacter;
        for(int i = startingStage;i < len;i++)
        {
            currentCharacter = str.charAt(i);
            if(currentCharacter == indexChar)
            {
                return i+1;
            }
        }
        return -1;
    }
}