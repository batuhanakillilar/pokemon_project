package com.batu.pokemon.trainer;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface TrainerRepository extends JpaRepository <Trainer, Integer> {




}
