package entities;

import java.util.List;

public class Team {
    private String teamName;
    private List<Competition> competitionList;
    private String stadium;

    public Team() {
    }

    public Team(String teamName, List<Competition> competitionList, String stadium) {
        this.teamName = teamName;
        this.competitionList = competitionList;
        this.stadium = stadium;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
