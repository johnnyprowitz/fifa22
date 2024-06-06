package com.johpro.fifa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/fifa")
public class MatchController {

    @Autowired
    private MatchRepo mr;

    private String jsonFile="src/main/resources/static/static.json";
    private void saveToFile(List<Matches> matches){
        ObjectMapper objectMapper= new ObjectMapper();
        try(FileWriter fileWriter = new FileWriter(jsonFile)){
            objectMapper.writeValue(fileWriter, matches);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    @GetMapping("/display")
    public List<Matches> getMatches(){
        saveToFile(mr.findAll());

        return mr.findAll();
    }

}
