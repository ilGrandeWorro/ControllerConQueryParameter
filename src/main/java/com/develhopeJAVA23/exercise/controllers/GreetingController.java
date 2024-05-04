package com.develhopeJAVA23.exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class GreetingController {

    @GetMapping("/ciao")
    public String greeting (@RequestParam (defaultValue = "amico") String nome, @RequestParam(defaultValue = "quella regione in cui vivi") String provincia) {

        return "Ciao " + nome + ", com'è il tempo in " + provincia +"?";
    }
}
