package entities;

public class Match {

    private String matchID;
    private Team homeTeam;
    private Team awayTeam;
    private Scoreline scoreLine;
    private Competition competetion;
    private String matchDay;

    public Match() {
    }

    public Match(String matchID, Team homeTeam, Team awayTeam, Scoreline scoreLine, Competition competetion, String matchDay) {
        this.matchID = matchID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.scoreLine = scoreLine;
        this.competetion = competetion;
        this.matchDay = matchDay;
    }

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

    public Scoreline getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(Scoreline scoreLine) {
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
