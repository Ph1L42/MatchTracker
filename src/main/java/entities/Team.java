package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teamId;

    @Getter
    @Setter
    @Column(nullable = false)
    private String teamName;

    @Getter
    @Setter
    @Column
    @OneToMany
    private List<Competition> competitionList;

    @Getter
    @Setter
    @Column
    private String stadium;

    public Team() {
    }

    public Team(String teamName, List<Competition> competitionList, String stadium) {
        this.teamName = teamName;
        this.competitionList = competitionList;
        this.stadium = stadium;
    }
}
