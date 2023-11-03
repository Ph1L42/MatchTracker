package entities;

import matchtracker.entities.Spieltag;
import org.junit.jupiter.api.Test;
import matchtracker.services.MatchTracker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpieltagTrackerTest {

    @Test
    public void testAddMatch() {
        MatchTracker tracker = new MatchTracker();
        Spieltag spieltag = new Spieltag(/* Hier die Parameter für das Match einfügen */);
        tracker.addMatch(spieltag);

        assertTrue(tracker.getMatchHistory().contains(spieltag));
    }

    @Test
    public void testRemoveMatch() {
        MatchTracker tracker = new MatchTracker();
        Spieltag spieltag = new Spieltag(/* Hier die Parameter für das Match einfügen */);
        tracker.addMatch(spieltag);

        assertTrue(tracker.getMatchHistory().contains(spieltag));

        tracker.removeMatch(spieltag);

        assertFalse(tracker.getMatchHistory().contains(spieltag));
    }
}
