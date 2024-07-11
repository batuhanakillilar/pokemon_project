package com.batu.pokemon.gym;


import com.batu.pokemon.trainer.Trainer;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "gym")
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "gym",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,CascadeType.MERGE,
                    CascadeType.REFRESH,CascadeType.DETACH})
    private List<Trainer> trainers;


    public void add(Trainer trainer) {

        if(trainers == null){

            trainers = new ArrayList<>();
        }

            trainers.add(trainer);
    }

}
