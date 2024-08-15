package com.cristianorellana.rick_and_morty_api.Controller;

import com.cristianorellana.rick_and_morty_api.Model.Character;
import com.cristianorellana.rick_and_morty_api.Model.Origin;
import com.cristianorellana.rick_and_morty_api.Service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personajes")
public class RickAndMortyController {

    @Autowired
    private RickAndMortyService rickAndMortyService;

    @GetMapping("/character/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable int id) {
        Character character = rickAndMortyService.getCharacterById(id);
        if (character != null){
            return ResponseEntity.ok(character);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Origin> getLocationById(@PathVariable int id) {
        Origin origin = rickAndMortyService.getLocationById(id);
        if (origin != null){
            return ResponseEntity.ok(origin);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
