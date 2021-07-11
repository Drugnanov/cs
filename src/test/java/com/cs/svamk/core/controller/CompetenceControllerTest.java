package com.cs.svamk.core.controller;

import com.cs.svamk.core.dto.CompetenceDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@SqlGroup({
        @Sql(scripts = {"/sql/init/clean-up.sql", "/sql/init/init.sql"}, executionPhase = BEFORE_TEST_METHOD),
        @Sql(scripts = {"/sql/init/clean-up.sql"}, executionPhase = AFTER_TEST_METHOD)})
public class CompetenceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void findAllCompetences() throws Exception {
        String uri = "/competences";
        MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get(uri)).andExpect(status().isOk()).andReturn();

        List<CompetenceDto> competences = mapper.readValue(mvcResult.getResponse().getContentAsString(), new TypeReference<List<CompetenceDto>>() {
        });

        assertEquals(5, competences.size());
    }

}
