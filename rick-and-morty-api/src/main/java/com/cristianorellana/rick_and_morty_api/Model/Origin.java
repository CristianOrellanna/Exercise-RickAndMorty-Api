package com.cristianorellana.rick_and_morty_api.Model;

import lombok.Getter;

import java.util.List;

@Getter
public class Origin {
    private String name;
    private String url;
    private String dimension;
    private List<String> residents;
}

