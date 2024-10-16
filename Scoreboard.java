public class Scoreboard {
    private int activeTeam;
    private String name1;
    private String name2;
    private int score1;
    private int score2;

    public Scoreboard(String team1, String team2) {
        name1 = team1;
        name2 = team2;
        activeTeam = 1;
    }

    public void recordPlay(int ptsScored) {
        if (ptsScored == 0) {
            if (activeTeam == 1) {
                activeTeam = 2;
            }
            else {
                activeTeam = 1;
            }
        }
        else {
            if (activeTeam == 1) {
                score1 += ptsScored;
            }
            else {
                score2 += ptsScored;
            }

        }
    }

    public String getScore() {
        if (activeTeam == 1) {
            return (score1 + "-" + score2 + "-" + name1);
        }
        else {
            return (score1 + "-" + score2 + "-" + name2);
        }
    }
}