package com.johpro.fifa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Teams {

    private String name;
    private int points;
    private int wins;
    private int losses;
    private int ties;
    private String category;
    //@Override
    public int getPoints() {return (3 * wins) + ties;}
}
