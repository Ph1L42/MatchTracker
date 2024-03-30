package matchtracker.controller;

import matchtracker.entities.Competition;
import matchtracker.entities.Spieltag;
import matchtracker.entities.Scoreline;
import matchtracker.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import matchtracker.repositories.SpieltagRespository;

import java.util.List;

@Controller
@RequestMapping(path = "spieltag")
public class SpieltagController {

    @Autowired
    private SpieltagRespository spieltagRespository;

    @PostMapping(path = "/add")
    public @ResponseBody String addMatch(@RequestParam Team homeTeam,
                                         @RequestParam Team awayTeam,
                                         @RequestParam Scoreline scoreline,
                                         @RequestParam Competition competition) {

        Spieltag spieltag = new Spieltag();
        spieltag.setHomeTeam((List<Team>) homeTeam);
        spieltag.setAwayTeam((List<Team>) awayTeam);
        spieltag.setScoreLine(scoreline);
        spieltag.setCompetetion(competition);

        return "Done";
    }

    @GetMapping(path = "all")
    public @ResponseBody Iterable<Spieltag> getAllMatches(){
        return spieltagRespository.findAll();
    }

}
