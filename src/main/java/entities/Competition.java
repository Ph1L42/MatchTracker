package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long competitionId;

    @Getter
    @Setter
    @Column(nullable = false)
    private String competitionName;

    public Competition() {
    }

    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }
}
