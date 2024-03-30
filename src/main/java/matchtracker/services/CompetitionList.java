package matchtracker.services;

import matchtracker.entities.Competition;

import java.util.ArrayList;
import java.util.List;

public class CompetitionList {

    private List<Competition> competitionList;

    public CompetitionList() {
        competitionList = new ArrayList<>();
    }

    public void addCompetition(Competition competition) {
        competitionList.add(competition);
    }

    public void removeCompetition(Competition competition) {
        competitionList.remove(competition);
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
    }
}
