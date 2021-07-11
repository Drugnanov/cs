package com.cs.svamk.core.service;

import com.cs.svamk.core.domain.Competence;
import com.cs.svamk.core.repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public List<Competence> getAllCompetences() {
        List<Competence> competences = competenceRepository.findAll();
        return competences;
    }
}
