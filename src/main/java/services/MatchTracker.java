package services;

import entities.Match;

import java.util.ArrayList;
import java.util.List;

public class MatchTracker {
    private List<Match> matchHistory;

    public MatchTracker() {
        matchHistory = new ArrayList<>();
    }

    public void addMatch(Match match){
        matchHistory.add(match);
    }

    public void removeMatch(Match match){
        matchHistory.remove(match);
    }

    public List<Match> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(List<Match> matchHistory) {
        this.matchHistory = matchHistory;
    }
}
