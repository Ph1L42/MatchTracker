package matchtracker.services;

import matchtracker.entities.Spieltag;

import java.util.ArrayList;
import java.util.List;

public class MatchTracker {
    private List<Spieltag> spieltagHistory;

    public MatchTracker() {
        spieltagHistory = new ArrayList<>();
    }

    public void addMatch(Spieltag spieltag){
        spieltagHistory.add(spieltag);
    }

    public void removeMatch(Spieltag spieltag){
        spieltagHistory.remove(spieltag);
    }

    public List<Spieltag> getMatchHistory() {
        return spieltagHistory;
    }

    public void setMatchHistory(List<Spieltag> spieltagHistory) {
        this.spieltagHistory = spieltagHistory;
    }
}
