package matchtracker.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String teamName;

    @Column
    private String abbreviation;

    @Column
    private String stadium;
    //endregion

    //region Relationships
    @ManyToMany
    private List<Spieltag> spieltags;

    //region Constructors
    public Team() {
    }

    public Team(String teamName, String abbreviation, String stadium) {
        this.teamName = teamName;
        this.abbreviation = abbreviation;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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
