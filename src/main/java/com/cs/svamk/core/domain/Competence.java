package com.cs.svamk.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_competence_gen")
    @SequenceGenerator(name = "seq_competence_gen", sequenceName = "seq_competence", allocationSize = 1)
    Long id;

    @NotNull
    String code;

    @NotNull
    String name;

}
