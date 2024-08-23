package com.cristianorellana.rick_and_morty_api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Response {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private Origin origin;
}
