package matchtracker.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Team {

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String teamName;

    @Column
    private String stadium;
    //endregion

    //region Relationships
    @ManyToMany
    private List<Spieltag> spieltags;

    //region Constructors
    public Team() {
    }

    public Team(String teamName, String stadium) {
        this.teamName = teamName;
        this.stadium = stadium;
    }
    //endregion

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public List<Spieltag> getSpieltags() {
        return spieltags;
    }

    public void setSpieltags(List<Spieltag> spieltags) {
        this.spieltags = spieltags;
    }
}
