import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a1,a2,a3,b1,b2,b3;
        a1 = input.nextInt();
        b1 = input.nextInt();
        a2 = input.nextInt();
        b2 = input.nextInt();
        a3 = input.nextInt();
        b3 = input.nextInt();
        int CountTeam1,CountTeam2,CountTeam3;
        CountTeam1 = Math.min(a1,b1);
        CountTeam2 = Math.min(a2,b2);
        CountTeam3 = Math.min(a3,b3);
        int TotalQuantityOfTeams = CountTeam1 + CountTeam2 + CountTeam3;
        System.out.println(TotalQuantityOfTeams);
    }
}