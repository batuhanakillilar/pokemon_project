package com.batu.pokemon.pokemon;

import com.batu.pokemon.trainer.Trainer;
import com.batu.pokemon.trainer.TrainerRequest;

public class PokemonMapper {

    public PokemonRequest pokemonRequest(Pokemon pokemon) {
        return PokemonRequest.builder()
                .name(pokemon.getName())
                .build();
    }

    public Pokemon toPokemon(PokemonRequest pokemonRequest) {
        return Pokemon.builder()
                .name(pokemonRequest.name())
                .build();
    }
}
