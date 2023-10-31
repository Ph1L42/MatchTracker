package controller;

import entities.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repositories.CompetitionRepository;

import java.util.List;

@Controller
@RequestMapping(path = "competition")
public class CompetitionController {

    @Autowired
    private CompetitionRepository competitionRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addCompetition
            (@RequestParam String name) {

        Competition competition = new Competition();
        competition.setCompetitionName(name);

        return "Done";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Competition> getAllTeams(){
        // This returns a JSON or XML with the teams
        return competitionRepository.findAll();
    }

}
