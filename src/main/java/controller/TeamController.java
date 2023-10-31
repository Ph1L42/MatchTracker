package controller;

import entities.Competition;
import entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repositories.TeamRepository;

import java.util.List;

@Controller
@RequestMapping(path = "team")
public class TeamController {

    @Autowired //automatisch Abhängigkeiten zu injizieren
    private TeamRepository teamRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addTeam
            (@RequestParam String teamname,
             @RequestParam List<Competition> competitionList,
             @RequestParam String stadium) {

        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Team team = new Team();
        team.setTeamName(teamname);
        team.setCompetitionList(null);
        team.setStadium(stadium);

        return "Done";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Team> getAllTeams(){
        // This returns a JSON or XML with the teams
        return teamRepository.findAll();
    }

}
