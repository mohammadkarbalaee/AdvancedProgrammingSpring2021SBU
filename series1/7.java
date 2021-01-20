//-------------------------calling libraries blcok
import java.util.Scanner;
import java.util.concurrent.Callable;

//------------------------------------------
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int QuantityOfPoints = input.nextInt();
        int[] Coordiantes = new int[2*QuantityOfPoints];
        for(int i = 0;i < 2*QuantityOfPoints;i++)
        {
            Coordiantes[i] = input.nextInt();
        }
        int countOfNegativeXcoordinates = 0;
        int countOfPositiveXcoordinates = 0;
        for (int i = 0;i < 2*QuantityOfPoints;i += 2)
        {
            if(Coordiantes[i] > 0)
            {
                countOfPositiveXcoordinates++;
            }
            else
            {
                countOfNegativeXcoordinates++;
            }
        }
        if(countOfNegativeXcoordinates == 1 || countOfPositiveXcoordinates == 1)
        {
            System.out.println("Yes");
        }
        else if(countOfNegativeXcoordinates == 0 || countOfPositiveXcoordinates == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}