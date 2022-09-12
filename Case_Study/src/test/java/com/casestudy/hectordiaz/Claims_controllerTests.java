package com.casestudy.hectordiaz;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.casestudy.hectordiaz.controller.Claims_controller;
import com.casestudy.hectordiaz.service.Claims_service;

@WebMvcTest(Claims_controller.class)
public class Claims_controllerTests {

	Long id;

	@Autowired
	MockMvc mockMvc;

	@MockBean
	Claims_service claims_service;

	@Test
	void getClaims() throws Exception {
		when(claims_service.getClaimById(id)).thenReturn(Datos.crearCuentaPrueba());
		{

			mockMvc.perform(get("claims/getClaimById/1").contentType(MediaType.APPLICATION_JSON))
					.andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON))
					.andExpect(jsonPath("$description").value("description"))
					.andExpect(jsonPath("$status").value("status")).andExpect(jsonPath("$model").value("model"))
					.andExpect(jsonPath("$plates").value("plates"));

			verify(claims_service).getClaimById(1L);

		}

	}

}
