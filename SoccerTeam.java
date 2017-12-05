
public class SoccerTeam
{
    public static void main(String[]args){
       Team soccer = new Team ("Soccer Team", 20);
       Athlete player1 = new Athlete ("Name 1", 18);
       soccer.addAthlete(player1, 0);
       System.out.println(soccer);
    }
}
