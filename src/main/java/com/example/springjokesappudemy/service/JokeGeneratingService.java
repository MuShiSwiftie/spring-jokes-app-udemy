package com.example.springjokesappudemy.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeGeneratingService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String createJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
