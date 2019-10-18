package gov.cgr.holamundo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import gov.cgr.holamundo.controlador.ControladorRest;
import gov.cgr.holamundo.entidadesservicio.ServicioHolaMundoSumador;
import gov.cgr.holamundo.logicanegocio.PeticionHolaMundoDTO;
import gov.cgr.holamundo.logicanegocio.SumandoDTO;

@RunWith(MockitoJUnitRunner.class)
public class AplicacionHolaMundoTests {

	@InjectMocks
	private ControladorRest controladorRest;
	
	@Mock
	private ServicioHolaMundoSumador servicio;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testProbarSumador() {
		
		when(servicio.sumarNumeros(Mockito.anyList())).thenReturn(10);
		PeticionHolaMundoDTO peticion = new PeticionHolaMundoDTO();
		List<SumandoDTO> numerosSuma = new ArrayList<SumandoDTO>();
		numerosSuma.add(new SumandoDTO(5));
		numerosSuma.add(new SumandoDTO(5));
		peticion.setNumerosAsumar(numerosSuma);
		controladorRest.sumarNumeros(peticion);
	}

}
