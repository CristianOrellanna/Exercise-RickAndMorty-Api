package com.cristianorellana.rick_and_morty_api.Service;

import com.cristianorellana.rick_and_morty_api.Model.Character;
import com.cristianorellana.rick_and_morty_api.Model.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickAndMortyService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${rickAndMorty.api.character}")
    private String apiCharacterUrl;

    public Character getCharacterById(int id) {
        String url = apiCharacterUrl + id;
        return restTemplate.getForObject(url, Character.class);
    }

    @Value("${rickAndMorty.api.location}")
    private String apiLocationUrl;

    public Origin getLocationById(int id) {
        String url = apiLocationUrl + id;
        return restTemplate.getForObject(url, Origin.class);
    }
}
