package com.batu.pokemon.pokemon;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> findAll(){

        return pokemonRepository.findAll();

    }

    public Pokemon findPokemon(Integer id) {

        Optional<Pokemon> pokemon = pokemonRepository.findById(id);

        if (!pokemon.isPresent()) {
            throw new RuntimeException("Pokemon not found");
        }

        return pokemon.get();
    }

    public Pokemon createPokemon(PokemonRequest PokemonRequest) {

        Pokemon pokemon = new Pokemon();
        pokemon.setName(PokemonRequest.name());

        Pokemon savedPokemon = pokemonRepository.save(pokemon);

        return savedPokemon;
    }

public Pokemon updatePokemon(Integer id, PokemonRequest PokemonRequest) {

        Pokemon pokemon = findPokemon(id);
        pokemon.setName(PokemonRequest.name());

        Pokemon saved = pokemonRepository.save(pokemon);
        return saved;
}

public void deletePokemon(Integer id) {

        Pokemon pokemon = findPokemon(id);
        pokemonRepository.delete(pokemon);


}


}
