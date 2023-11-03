package entities;

import matchtracker.entities.Competition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompetitionTest {

    @Test
    public void testGetCompetition() {
        Competition competition = new Competition("Premier League");
        assertEquals("Premier League", competition.getCompetitionName());
    }

    @Test
    public void testSetCompetition() {
        Competition competition = new Competition();
        competition.setCompetitionName("Serie A");
        assertEquals("Serie A", competition.getCompetitionName());
    }
}

