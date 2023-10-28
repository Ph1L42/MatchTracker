package entities;

public class Match {

    private String matchID;
    private Team homeTeam;
    private Team awayTeam;
    private String scoreLine;
    private Competition competetion;
    private String matchDay;

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        this.scoreLine = scoreLine;
    }

    public Competition getCompetetion() {
        return competetion;
    }

    public void setCompetetion(Competition competetion) {
        this.competetion = competetion;
    }

    public String getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(String matchDay) {
        this.matchDay = matchDay;
    }
}
