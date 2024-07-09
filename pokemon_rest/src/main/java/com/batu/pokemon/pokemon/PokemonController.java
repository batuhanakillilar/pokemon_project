package com.batu.pokemon.pokemon;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private final PokemonService pokemonService;
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

    @GetMapping("/{pokemonId}")
    public Pokemon findById(@PathVariable Integer pokemonId) {

        return pokemonService.findPokemon(pokemonId);
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody PokemonRequest pokemonRequest) {
        return pokemonService.createPokemon(pokemonRequest);

    }

    @PutMapping("/{id}")
    public Pokemon updatePokemon(@PathVariable Integer id, @RequestBody PokemonRequest pokemonRequest) {

        return pokemonService.updatePokemon(id,pokemonRequest);
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Integer id) {
        pokemonService.deletePokemon(id);
    }



}
