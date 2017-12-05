
public class Team
{
    private String teamName;
    private Athlete[] players;
      public Team(String tmNm, int size)
    {
        this.teamName = tmNm;
        this.players = new Athlete[size];
    }

    public void addAthlete(Athlete a, int index){
        players[index] = a;
    }
    
    public String toString()
    {
        String output = "This players for the "+teamName+ ": \n";
        for (Athlete a : players){
            output += a + "\n";
        }
        return output;
    }
}