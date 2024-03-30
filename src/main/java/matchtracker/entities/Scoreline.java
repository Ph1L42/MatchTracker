package matchtracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Scoreline {

    @Id
    private Long id;

    private int homeGoals;
    private int awayGoals;

    @OneToMany
    private List<Spieltag> spieltags;

    public Scoreline() {
    }

    public Scoreline(int homeGoals, int awayGoals) {
        if (homeGoals >= 0 && awayGoals >= 0) {
            this.homeGoals = homeGoals;
            this.awayGoals = awayGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        if (homeGoals >= 0) {
            this.homeGoals = homeGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        if (awayGoals >= 0) {
            this.awayGoals = awayGoals;
        } else {
            throw new IllegalArgumentException("Negative Tore gibts nicht");
        }
    }

    public List<Spieltag> getSpieltags() {
        return spieltags;
    }

    public void setSpieltags(List<Spieltag> spieltags) {
        this.spieltags = spieltags;
    }

    @Override
    public String toString() {
        return homeGoals + ":" + awayGoals;
    }

}
