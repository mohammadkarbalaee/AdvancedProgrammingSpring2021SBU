import java.util.Scanner;
//------------------------------------------
public class test
{
    public static void main (String[] args)
    {
        //--------------------------------------initializing and input taking block
        Scanner input = new Scanner(System.in);
        int CurrentLevel,FinalLevel,QuantityOfLevels;
        QuantityOfLevels = input.nextInt();
        int[] LevelsLength = new int[QuantityOfLevels];
        for(int i = 0;i < QuantityOfLevels - 1;i++)
        {
            LevelsLength[i] = input.nextInt();
        }
        CurrentLevel = input.nextInt();
        FinalLevel = input.nextInt();
        //-------------------------------------------------calculation block
        int TakenYears = 0;
        for(int i = CurrentLevel-1;i < FinalLevel-1;i++)
        {
            TakenYears += LevelsLength[i];
        }
        //----------------------------------------------printing the result
        System.out.println(TakenYears);
    }
}