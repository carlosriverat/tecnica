package gov.cgr.holamundo.logicanegocio;

public class RespuestaHolaMundoDTO {

	private ResultadoSumaDTO resultadoSuma;

	public RespuestaHolaMundoDTO( ResultadoSumaDTO resultadoSuma ) {
		super();
		this.resultadoSuma = resultadoSuma;
	}
	
	public ResultadoSumaDTO getResultadoSuma() {
		return resultadoSuma;
	}

	public void setResultadoSuma(ResultadoSumaDTO resultadoSuma) {
		this.resultadoSuma = resultadoSuma;
	}
	
	
}
