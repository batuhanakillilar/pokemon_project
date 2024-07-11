package com.batu.pokemon.trainer;

import com.batu.pokemon.gym.Gym;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="trainers")

public class Trainer {

    //id,name
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String role;
    private String pw;
    private int active;
    private String userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_detail_id")
    private TrainerDetail trainerDetail;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name="gym_id")
    private Gym gym;

}
