package com.batu.pokemon.trainer;

import org.springframework.stereotype.Service;

@Service
public class TrainerMapper {

    public TrainerRequest toTrainerRequest(Trainer trainer) {
        return TrainerRequest.builder()
                .firstName(trainer.getFirstName())
                .lastName(trainer.getLastName())
                .build();
    }

    public Trainer toTrainer(TrainerRequest trainerRequest) {
        return Trainer.builder()
                .firstName(trainerRequest.firstName())
                .lastName(trainerRequest.lastName())
                .build();
    }

}
