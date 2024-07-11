package com.batu.pokemon.gym;


import org.springframework.stereotype.Service;

@Service
public class GymMapper {

    public GymRequest toGymRequest(Gym gym){
        return GymRequest.builder()
                .name(gym.getName())
                .build();
    }
    public Gym toGym(GymRequest gymRequest){
        return Gym.builder()
                .name(gymRequest.name())
                .build();

    }


}
