package com.cs.svamk.core.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CompetenceDto {

    @NotNull
    Long id;

    @NotNull
    String code;

    @NotNull
    String name;
}
