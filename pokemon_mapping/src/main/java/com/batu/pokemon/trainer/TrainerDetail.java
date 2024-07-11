package com.batu.pokemon.trainer;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "trainer_detail")
public class TrainerDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "level")
    private int level;

    @Enumerated(EnumType.STRING)
    private TrainerType trainerType;

}
