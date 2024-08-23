package com.cristianorellana.rick_and_morty_api.Model;

import lombok.Getter;

import java.util.List;

@Getter
public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private List<String> episode;
    private Origin origin;

    public int getEpisodeCount(){
        if (episode != null){
            return episode.size();
        }else {
            return 0;
        }
    }

}
