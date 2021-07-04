package com.cs.svamk.core.controller;

import com.cs.svamk.core.domain.Competence;
import com.cs.svamk.core.dto.CompetenceDto;
import com.cs.svamk.core.service.CompetenceService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/competences")
public class CompetenceController {

    private final CompetenceService competenceService;
    private final ModelMapper modelMapper = new ModelMapper();

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping
    public List<CompetenceDto> getCompetences(){
        return competenceService.getAllCompetences().stream().map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private CompetenceDto convertToDto(Competence competence) {
        return modelMapper.map(competence, CompetenceDto.class);
    }
}
