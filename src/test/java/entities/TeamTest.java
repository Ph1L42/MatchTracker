package entities;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TeamTest {


    @Test
    public void testGetTeamName() {
        Team team = new Team("FC Bayern", null, "Allianz Arena");
        assertEquals("FC Bayern", team.getTeamName());
    }

    @Test
    public void testSetTeamName() {
        Team team = new Team();
        team.setTeamName("Real Madrid");
        assertEquals("Real Madrid", team.getTeamName());
    }

    @Test
    public void testGetStadium() {
        Team team = new Team("Liverpool FC", null, "Anfield");
        assertEquals("Anfield", team.getStadium());
    }

    @Test
    public void testSetStadium() {
        Team team = new Team();
        team.setStadium("Camp Nou");
        assertEquals("Camp Nou", team.getStadium());
    }

/*    @Test
    public void testGetCompetitionList() {
        Team team = new Team("AC Milan", null, "San Siro");
        assertNull(team.getCompetitionList());
    }

    @Test
    public void testSetCompetitionList() {
        Team team = new Team();
        List<Competition> competitions = List.of(new Competition("Serie A"));
        team.setCompetitionList(competitions);
        assertEquals(competitions, team.getCompetitionList());
    }
*/
}
