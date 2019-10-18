package gov.cgr.holamundo.entidadesservicio;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServicioHolaMundoSumador {

	public Integer sumarNumeros(List<Integer> sumandos) {
		
		Integer resultado = 0;
		Integer sumandoActual;
		
		Iterator<Integer> iterSumandos = sumandos.iterator();
		
		while(iterSumandos.hasNext()) {
			sumandoActual = iterSumandos.next();
			resultado = resultado + sumandoActual;
		}
		
		return resultado;		
	}
	
}
