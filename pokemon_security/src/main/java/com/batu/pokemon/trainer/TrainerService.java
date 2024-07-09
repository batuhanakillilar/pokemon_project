package com.batu.pokemon.trainer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TrainerService {

    private final TrainerRepository trainerRepository;
    private final TrainerMapper trainerMapper;


    public List<Trainer> findAll() {
        return trainerRepository.findAll();

    }

    public Trainer findTrainer(Integer id) {
        Optional<Trainer> trainer = trainerRepository.findById(id);

        if (!trainer.isPresent()) {
            throw new RuntimeException("Trainer not found");
        }

        return trainer.get();
    }

    public Trainer createTrainer(TrainerRequest trainerRequest) {

        Trainer trainer = trainerMapper.toTrainer(trainerRequest);
        Trainer saved = trainerRepository.save(trainer);

        return saved;
    }

    public Trainer updateTrainer(Integer id, TrainerRequest trainerRequest) {

        Trainer trainer = findTrainer(id);
        trainer.setFirstName(trainerRequest.firstName());
        trainer.setLastName(trainerRequest.lastName());

        Trainer saved = trainerRepository.save(trainer);

        return saved;
    }

    public Trainer deleteTrainer(Integer id) {

        Trainer trainer = findTrainer(id);
        trainerRepository.delete(trainer);
        return trainer;
    }
}
