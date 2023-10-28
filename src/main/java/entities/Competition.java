package entities;

public class Competition {
    private String competitionName;

    public Competition() {
    }

    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
}
