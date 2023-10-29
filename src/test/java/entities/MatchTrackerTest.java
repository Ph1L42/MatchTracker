package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatchTrackerTest {

    @Test
    public void testAddMatch() {
        MatchTracker tracker = new MatchTracker();
        Match match = new Match(/* Hier die Parameter für das Match einfügen */);
        tracker.addMatch(match);

        assertTrue(tracker.getMatchHistory().contains(match));
    }

    @Test
    public void testRemoveMatch() {
        MatchTracker tracker = new MatchTracker();
        Match match = new Match(/* Hier die Parameter für das Match einfügen */);
        tracker.addMatch(match);

        assertTrue(tracker.getMatchHistory().contains(match));

        tracker.removeMatch(match);

        assertFalse(tracker.getMatchHistory().contains(match));
    }
}
