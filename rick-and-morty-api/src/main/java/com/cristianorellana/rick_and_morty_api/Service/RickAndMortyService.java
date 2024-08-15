package com.cristianorellana.rick_and_morty_api.Service;

import com.cristianorellana.rick_and_morty_api.Model.Character;
import com.cristianorellana.rick_and_morty_api.Model.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickAndMortyService {

    @Autowired
    private RestTemplate restTemplate;

    public Character getCharacterById(int id){
        String url = "https://rickandmortyapi.com/api/character/" + id;
        return restTemplate.getForObject(url, Character.class);
    }

    public Origin getLocationById(int id){
        String url = "https://rickandmortyapi.com/api/location/" + id;
        return restTemplate.getForObject(url, Origin.class);
    }

}
