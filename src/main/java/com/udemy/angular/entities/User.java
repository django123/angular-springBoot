package com.udemy.angular.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name="\"User\"")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idUser")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long idUser;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    @Lob
    private byte[] photo;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private Collection<AnimeCharacter> animeCharacters;
}
