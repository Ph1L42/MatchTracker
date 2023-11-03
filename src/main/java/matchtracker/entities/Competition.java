package matchtracker.entities;

import jakarta.persistence.*;


import java.util.List;
import java.util.Set;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String competitionName;

    @OneToMany
    private List<Spieltag> spieltags;

    public Competition() {
    }

    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long competitionId) {
        this.id = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public List<Spieltag> getSpieltags() {
        return spieltags;
    }

    public void setSpieltags(List<Spieltag> spieltags) {
        this.spieltags = spieltags;
    }
}

