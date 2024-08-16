package com.cristianorellana.rick_and_morty_api.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Origin {

    private String name;
    private String url;
    private String dimension;
    private List<String> residents = new ArrayList<>();

}

