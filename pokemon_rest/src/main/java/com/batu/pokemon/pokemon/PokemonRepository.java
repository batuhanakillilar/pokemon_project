package com.batu.pokemon.pokemon;

import com.batu.pokemon.trainer.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository  extends JpaRepository<Pokemon, Integer> {
}
