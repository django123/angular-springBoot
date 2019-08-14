package com.udemy.angular.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class AnimeCharacter implements Serializable {

    @Id
    @GeneratedValue
    private Long idCharacter;

    private String characterName;

    private String legend;

    private String category;

    private String strength;

    @Lob
    private byte[] photo;

    private boolean shared;

    @Transient
    private Long idOwner;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
