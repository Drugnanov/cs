package com.cs.svamk.core.service;

import com.cs.svamk.core.domain.Competence;
import com.cs.svamk.core.repository.CompetenceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class CompetenceServiceTest {

    @Mock
    private CompetenceRepository cr;

    private CompetenceService cs;

    @Before
    public void init() {
        cs = new CompetenceService(cr);
    }

    @Test
    public void findAllCompetences() {
        List<Competence> competences = new ArrayList<>();
        competences.add(new Competence(1L, "CODE", "Coding"));
        competences.add(new Competence(2L, "PO", "Managing"));
        Mockito.when(cr.findAll()).thenReturn(competences);

        List<Competence> competencesReturned = cs.getAllCompetences();

        assertEquals(2, competencesReturned.size());
        assertEquals(competences, competencesReturned);
    }
}
