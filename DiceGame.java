import java.util.*;
public class DiceGame
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int score1=0,score2=0;
        int turn=1,n;
        while(score1<20 && score2<20){
            System.out.println("Player1: "+score1+" Player2: "+score2);
            if(turn%2==1)
                System.out.println("Player 1's turn: ");
            else
                System.out.println("Player 2's turn: ");
            System.out.println("Press ENTER to throw the dice: ");
            sc.nextLine();
            n=(int)Math.ceil(Math.random()*6);
            System.out.println("outcome: "+n);
            if(turn%2==1)
                score1+=n;
            else
                score2+=n;
            turn++;
        }
        System.out.println("Final Score: ");
        System.out.println("Player1: "+score1+" Player2: "+score2);
        if(score1>20)
            System.out.println("Player1 is winner");
        else
            System.out.println("Player2 is winner");
    }
}
