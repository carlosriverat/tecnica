package gov.cgr.holamundo.logicanegocio;

import java.util.List;

public class PeticionHolaMundoDTO {

	private List<SumandoDTO> numerosSuma;

	public List<SumandoDTO> getNumerosSuma() {
		return numerosSuma;
	}

	public void setNumerosAsumar(List<SumandoDTO> numerosSuma) {
		this.numerosSuma = numerosSuma;
	}
	
	
}
