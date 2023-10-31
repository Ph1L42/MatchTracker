package controller;

import entities.Competition;
import entities.Match;
import entities.Scoreline;
import entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repositories.MatchRepository;

@Controller
@RequestMapping(path = "match")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addMatch(@RequestParam Team homeTeam,
                                         @RequestParam Team awayTeam,
                                         @RequestParam Scoreline scoreline,
                                         @RequestParam Competition competition) {

        Match match = new Match();
        match.setHomeTeam(homeTeam);
        match.setAwayTeam(awayTeam);
        match.setScoreLine(scoreline);
        match.setCompetetion(competition);

        return "Done";
    }

    @GetMapping(path = "all")
    public @ResponseBody Iterable<Match> getAllMatches(){
        return matchRepository.findAll();
    }

}
