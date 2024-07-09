package com.batu.pokemon.trainer;

import org.springframework.stereotype.Service;

@Service
public class TrainerMapper {

    public TrainerRequest toTrainerRequest(Trainer trainer) {
        return TrainerRequest.builder()
                .firstName(trainer.getFirstName())
                .lastName(trainer.getLastName())
                .role(trainer.getRole())
                .pw(trainer.getPw())
                .active(trainer.getActive())
                .userId(trainer.getUserId())
                .build();
    }

    public Trainer toTrainer(TrainerRequest trainerRequest) {
        return Trainer.builder()
                .firstName(trainerRequest.firstName())
                .lastName(trainerRequest.lastName())
                .role(trainerRequest.role())
                .pw(trainerRequest.pw())
                .active(trainerRequest.active())
                .userId(trainerRequest.userId())
                .build();
    }

}
