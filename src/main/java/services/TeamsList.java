package services;

import entities.Team;

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
}
