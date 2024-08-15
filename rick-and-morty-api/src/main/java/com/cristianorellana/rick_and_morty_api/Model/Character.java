package com.cristianorellana.rick_and_morty_api.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;

}
