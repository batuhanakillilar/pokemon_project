package com.batu.pokemon.trainer;

import lombok.Builder;

@Builder
public record TrainerRequest
        (String firstName, String lastName) {


}
