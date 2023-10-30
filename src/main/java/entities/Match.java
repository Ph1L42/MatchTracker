package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String matchID;

    @Getter
    @Setter
    @OneToOne
    @Column(nullable = false)
    private Team homeTeam;

    @Getter
    @Setter
    @OneToOne
    @Column(nullable = false)
    private Team awayTeam;

    @Getter
    @Setter
    @Column(nullable = false)
    @OneToOne
    private Scoreline scoreLine;

    @Getter
    @Setter
    @ManyToOne
    @Column
    private Competition competetion;

    /*TODO Date*/

    public Match(String matchID, Team homeTeam, Team awayTeam, Scoreline scoreLine, Competition competetion) {
        this.matchID = matchID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.scoreLine = scoreLine;
        this.competetion = competetion;
    }

    public Match() {

    }
}
