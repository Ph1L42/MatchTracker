package matchtracker.services;

import matchtracker.entities.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamsList {

    private List<Team> teamList;

    public TeamsList() {
        teamList = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teamList.add(team);
    }

    public void removeTeam(Team team) {
        teamList.remove(team);
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    /*TODO:
    * Add Team Photo
    * */

    //Edit Team Name
    public void editTeamName(Team team, String newTeamName){
        team.setTeamName(newTeamName);
    }

    //Edit Abbreviation
    public void editAbbreviation(Team team, String newAbbreviation){
        team.setAbbreviation(newAbbreviation);
    }

    //Edit Stadium
    public void editStadium(Team team, String newStadium){
        team.setStadium(newStadium);
    }
}
