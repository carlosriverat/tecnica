package gov.cgr.holamundo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gov.cgr.holamundo.entidadesservicio.ServicioHolaMundoSumador;
import gov.cgr.holamundo.logicanegocio.PeticionHolaMundoDTO;
import gov.cgr.holamundo.logicanegocio.RespuestaHolaMundoDTO;
import gov.cgr.holamundo.logicanegocio.ResultadoSumaDTO;
import gov.cgr.holamundo.logicanegocio.SumandoDTO;

@RestController
public class ControladorRest {

	@Autowired
	private ServicioHolaMundoSumador servicioSumador;
	
	@PostMapping("/nasa/sumarnumeros")
	@ResponseBody	
	public ResponseEntity<RespuestaHolaMundoDTO> sumarNumeros(@RequestBody PeticionHolaMundoDTO peticionSumarNumeros){
		
		List<SumandoDTO> listaSumandosDTO = peticionSumarNumeros.getNumerosSuma(); 
		List<Integer> listaSumandos = new ArrayList<Integer>();
		SumandoDTO sumandoActual = null;
		
		for(int i=0; i<listaSumandosDTO.size(); i++) {
			sumandoActual = listaSumandosDTO.get(i);
			listaSumandos.add(sumandoActual.getSumando());
		}
		return ResponseEntity.ok(new RespuestaHolaMundoDTO( new ResultadoSumaDTO(servicioSumador.sumarNumeros(listaSumandos))));		
	}
	
}
