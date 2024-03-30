package entities;

import matchtracker.entities.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TeamTest {

    @Test
    public void testSetTeamName() {
        Team team = new Team();
        team.setTeamName("Real Madrid");
        assertEquals("Real Madrid", team.getTeamName());
    }

    @Test
    public void testEditTeamName(){
        Team team = new Team("Liverpool FI", "LFC", "Anfield");
        assertEquals("Liverpool FI", team.getTeamName());
        team.editTeamName(team, "Liverpool FC");
        assertEquals("Liverpool FC", team.getTeamName());
    }

    @Test
    public void testSetAbbreviation(){
        Team team = new Team("Karlsruher SC",  null, null);
        assertNull(team.getAbbreviation());
        team.setAbbreviation("KSC");
        assertEquals("KSC", team.getAbbreviation());
    }

    @Test
    public void testEditAbbreviation(){
        Team team = new Team("Karlsruher SC",  "KSw", "BBBank Wildparkstadion");
        assertEquals("KSw", team.getAbbreviation());
        team.editAbbreviation(team,"KSC");
        assertEquals("KSC", team.getAbbreviation());
    }

    @Test
    public void testGetStadium() {
        Team team = new Team("Liverpool FC", "LFC", "Anfield");
        assertEquals("Anfield", team.getStadium());
    }

    @Test
    public void testSetStadium() {
        Team team = new Team();
        team.setStadium("Camp Nou");
        assertEquals("Camp Nou", team.getStadium());
    }

    @Test
    public void testEditStadium(){
        Team team = new Team("Liverpool FC", "LFC", "Emirates");
        assertEquals("Emirates", team.getStadium());
        team.editStadium(team, "Anfield");
        assertEquals("Anfield", team.getStadium());
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
