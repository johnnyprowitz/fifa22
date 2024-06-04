package com.johpro.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fifa")
public class MatchController {

    @Autowired
    private MatchRepo mr;

    @GetMapping("/all")
    public List<Matches> getMatches(){

        return mr.findAll();
    }

}
