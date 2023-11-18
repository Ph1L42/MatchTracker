package matchtracker.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
public class Spieltag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToMany
    @JoinColumn(name = "team_id")
    private List<Team> homeTeam;

    @ManyToMany
    @JoinColumn(name = "team_id")
    private List<Team> awayTeam;

    @OneToOne
    private Scoreline scoreLine;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competetion;

    /*TODO Date*/

    public Spieltag(String id, Team homeTeam, Team awayTeam, Scoreline scoreLine, Competition competetion) {
        this.id = id;
        this.homeTeam = new ArrayList<>((Collection<? extends Team>) homeTeam);
        this.awayTeam = new ArrayList<>((Collection<? extends Team>) awayTeam);
        this.scoreLine = scoreLine;
        this.competetion = competetion;
    }

    public Spieltag() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Team> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<Team> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public List<Team> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<Team> awayTeam) {
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
}
