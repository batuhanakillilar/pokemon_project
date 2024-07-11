package com.batu.pokemon.gym;

import com.batu.pokemon.trainer.Trainer;
import lombok.Builder;
import org.springframework.stereotype.Service;
@Builder
public record GymRequest (String name, Trainer trainer){


}
