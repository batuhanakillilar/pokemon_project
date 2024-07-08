package com.batu.pokemon;

import com.batu.pokemon.pokemon.Pokemon;
import com.batu.pokemon.pokemon.PokemonAddRequest;
import com.batu.pokemon.pokemon.PokemonService;
import com.batu.pokemon.trainer.Trainer;
import com.batu.pokemon.trainer.TrainerRequest;
import com.batu.pokemon.trainer.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final TrainerService trainerService;

    @GetMapping("/init")
    public void init() {
        System.out.println("All trainers:");
        for (Trainer trainer : trainerService.findAll()) {
            System.out.println(trainer);
        }

        System.out.println("Saving 3 trainers");
        TrainerRequest trainerRequest1 = new TrainerRequest("Emre", "Aydın");
        TrainerRequest trainerRequest2 = new TrainerRequest("Batuhan", "Akıllılar");
        TrainerRequest trainerRequest3 = new TrainerRequest("Habil Yusuf", "Ayhan");
        trainerService.createTrainer(trainerRequest1);
        trainerService.createTrainer(trainerRequest2);
        trainerService.createTrainer(trainerRequest3);

        System.out.println("All trainers after save:");
        for (Trainer trainer : trainerService.findAll()) {
            System.out.println(trainer);
        }
    }

    private final PokemonService pokemonService;
    @GetMapping("/init-pokemon")
    public void initPokemon() {
        System.out.println("All pokemons:");
        for (Pokemon pokemon : pokemonService.findAll()) {
            System.out.println(pokemon);
        }

        System.out.println("Saving 3 pokemons");
        PokemonAddRequest pokemonAddRequest1 = new PokemonAddRequest("Pichu");
        PokemonAddRequest pokemonAddRequest2 = new PokemonAddRequest("Pikachu");
        PokemonAddRequest pokemonAddRequest3 = new PokemonAddRequest("Charmander");
        pokemonService.addPokemon(pokemonAddRequest1);
        pokemonService.addPokemon(pokemonAddRequest2);
        pokemonService.addPokemon(pokemonAddRequest3);

        System.out.println("All pokemons after save:");
        for (Pokemon pokemon : pokemonService.findAll()) {
            System.out.println(pokemon);
        }
    }

}

