package entities;

import java.util.List;

public class MatchList {
    private List<Match> matchHistory;

    public MatchList() {
    }

    public MatchList(List<Match> matchHistory) {
        this.matchHistory = matchHistory;
    }

    public List<Match> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(List<Match> matchHistory) {
        this.matchHistory = matchHistory;
    }
}
