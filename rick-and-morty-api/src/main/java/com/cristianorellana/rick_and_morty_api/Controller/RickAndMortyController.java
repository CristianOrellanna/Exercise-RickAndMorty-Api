package com.cristianorellana.rick_and_morty_api.Controller;

import com.cristianorellana.rick_and_morty_api.Model.Character;
import com.cristianorellana.rick_and_morty_api.Model.Origin;
import com.cristianorellana.rick_and_morty_api.Model.Response;
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
    public ResponseEntity<Response> getCharacterById(@PathVariable int id) {
        Character character = rickAndMortyService.getCharacterById(id);
        if (character == null) {
            return ResponseEntity.notFound().build();
        }
        // Obtener el origen
        Origin origin = rickAndMortyService.getLocationById(extractIdFromUrl(character.getOrigin().getUrl()));
        Response response = new Response(
                character.getId(),
                character.getName(),
                character.getStatus(),
                character.getSpecies(),
                character.getType(),
                character.getEpisodeCount(),
                origin
        );
        return ResponseEntity.ok(response);
    }

    private int extractIdFromUrl(String url) {
        try {
            String[] parts = url.split("/");
            return Integer.parseInt(parts[parts.length - 1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }
}
