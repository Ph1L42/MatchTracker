package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScorelineTest {

    @Test
    public void testGetHomeGoals() {
        Scoreline scoreline = new Scoreline(2, 1);
        assertEquals(2, scoreline.getHomeGoals());
    }

    @Test
    public void testSetHomeGoals() {
        Scoreline scoreline = new Scoreline();
        scoreline.setHomeGoals(3);
        assertEquals(3, scoreline.getHomeGoals());
    }

    @Test
    public void testGetAwayGoals() {
        Scoreline scoreline = new Scoreline(2, 1);
        assertEquals(1, scoreline.getAwayGoals());
    }

    @Test
    public void testSetAwayGoals() {
        Scoreline scoreline = new Scoreline();
        scoreline.setAwayGoals(0);
        assertEquals(0, scoreline.getAwayGoals());
    }

    @Test
    public void testToString() {
        Scoreline scoreline = new Scoreline(3, 0);
        assertEquals("3:0", scoreline.toString());
    }
}
