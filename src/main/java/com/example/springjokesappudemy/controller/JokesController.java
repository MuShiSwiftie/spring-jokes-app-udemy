package com.example.springjokesappudemy.controller;

import com.example.springjokesappudemy.service.JokeGeneratingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeGeneratingService jokeGeneratingService;

    public JokesController(JokeGeneratingService jokeGeneratingService) {
        this.jokeGeneratingService = jokeGeneratingService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeGeneratingService.createJoke());

        return "index";
    }
}
