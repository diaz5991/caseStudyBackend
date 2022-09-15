package com.casestudy.hectordiaz;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.casestudy.hectordiaz.model.Claims_model;
import com.casestudy.hectordiaz.repository.Claims_repository;
import com.casestudy.hectordiaz.service.Claims_service;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class Claims_controllerTests {

	@MockBean
	private Claims_repository claims_repo;

	@InjectMocks
	private Claims_service claims_service;

	@Test
	public void getClaimByIdTest() {

		Long id = 1L;

		Mockito.when(claims_repo.getById(id)).thenReturn(Datos.crearCuentaPrueba2(id));

		Optional<Claims_model> result = claims_service.getClaimById(id);

		assertNotNull(result);
	}

}

/*
 * Long id;
 * 
 * @Autowired MockMvc mockMvc;
 * 
 * @InjectMocks Claims_service claims_service;
 * 
 * @Test void prueba() { System.out.println();
 * 
 * }
 * 
 * @BeforeEach void setUp() {
 * 
 * System.out.println();
 * 
 * }
 * 
 * @Test void getClaimsById() throws Exception {
 * when(claims_service.getClaimById(1L)).thenReturn(Datos.crearCuentaPrueba(1L))
 * ; {
 * 
 * mockMvc.perform(get("claims/getClaimById/1L").contentType(MediaType.
 * APPLICATION_JSON)) .andExpect((ResultMatcher)
 * content().contentType(MediaType.APPLICATION_JSON))
 * .andExpect(jsonPath("$.description").value("description"))
 * .andExpect(jsonPath("$.status").value("status"))
 * .andExpect(jsonPath("$.model").value("model"))
 * .andExpect(jsonPath("$.plates").value("plates"));
 * 
 * verify(claims_service).getClaimById(1L);
 * 
 * }
 * 
 * }
 * 
 * @Test void getClaims() throws Exception {
 * 
 * List<Claims_model> claimsList = Arrays.asList(Datos.crearCuentaPrueba2(id),
 * Datos.crearCuentaPrueba3(id));
 * 
 * when(claims_service.getClaims()).thenReturn((ArrayList<Claims_model>)
 * claimsList);
 * 
 * mockMvc.perform(get("claims/getClaims").contentType(MediaType.
 * APPLICATION_JSON)) .andExpect((ResultMatcher)
 * content().contentType(MediaType.APPLICATION_JSON))
 * .andExpect(jsonPath("$[0].description").value("description"))
 * .andExpect(jsonPath("$[0].status").value("status")).andExpect(jsonPath(
 * "$[0].model").value("model"))
 * .andExpect(jsonPath("$[0].plates").value("plates"))
 * .andExpect(jsonPath("$[1].description").value("description"))
 * .andExpect(jsonPath("$[1].status").value("status")).andExpect(jsonPath(
 * "$[1].model").value("model"))
 * .andExpect(jsonPath("$[1].plates").value("plates")).andExpect(jsonPath("$",
 * hasSize(2)));
 * 
 * verify(claims_service).getClaims();
 * 
 * } /*
 * 
 * @Test void saveClaims() {
 * 
 * Claims_model datos= Datos.crearNuevaCuentaPrueba();
 * when(claims_service.addClaim(datos)).thenReturn(invocation -> { Claims_model
 * datosInv = invocation.getArgument(0);
 * 
 * });
 * 
 * 
 * }
 */
