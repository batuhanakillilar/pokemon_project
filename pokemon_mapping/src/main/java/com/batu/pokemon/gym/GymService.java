package com.batu.pokemon.gym;

import com.batu.pokemon.trainer.Trainer;
import com.batu.pokemon.trainer.TrainerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GymService {

    private final GymRepository gymRepository;
    private final GymMapper gymMapper;

    public List<Gym> findAll() {
        return gymRepository.findAll();

    }

    public Gym findGym(Integer id) {
        Optional<Gym> gym = gymRepository.findById(id);

        if (!gym.isPresent()) {
            throw new RuntimeException("Trainer not found");
        }

        return gym.get();
    }

    public Gym createGym(GymRequest gymRequest) {

        Gym theGym = gymMapper.toGym(gymRequest);
        Gym saved = gymRepository.save(theGym);

        return saved;
    }

    public Gym updateGym(Integer id, GymRequest gymRequest) {

        Gym gym = findGym(id);
        gym.setName(gymRequest.name());

        Gym saved = gymRepository.save(gym);

        return saved;
    }

    public Gym deleteGym(Integer id) {

        Gym gym = findGym(id);
        gymRepository.delete(gym);
        return gym;
    }


}
