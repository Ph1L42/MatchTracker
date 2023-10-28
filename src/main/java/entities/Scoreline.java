package entities;

public class Scoreline {

    private int homeGoals;
    private int awayGoals;

    public Scoreline() {
    }

    public Scoreline(int homeGoals, int awayGoals) {
        if (homeGoals >= 0 && awayGoals >= 0) {
            this.homeGoals = homeGoals;
            this.awayGoals = awayGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        if (homeGoals >= 0) {
            this.homeGoals = homeGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        if(awayGoals >= 0) {
            this.awayGoals = awayGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    @Override
    public String toString() {
        return homeGoals + ":" + awayGoals;
    }
}
