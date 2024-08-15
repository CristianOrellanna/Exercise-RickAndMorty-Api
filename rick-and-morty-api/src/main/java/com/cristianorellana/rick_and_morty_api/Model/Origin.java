package com.cristianorellana.rick_and_morty_api.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Origin {

    public String name;
    public String url;
    public String dimension;
    public List<String> residents = new ArrayList<>();

}

