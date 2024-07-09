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

}
