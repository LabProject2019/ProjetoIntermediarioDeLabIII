package hello;

public class Camisa 
{
	private String codigoCamisa;
	private Espeficicacao_Camisa espc;
	
	
	public Camisa(String codigoCamisa, Espeficicacao_Camisa espc) {
		super();
		this.codigoCamisa = codigoCamisa;
		this.espc = espc;
	}


	public String getCodigoCamisa() {
		return codigoCamisa;
	}


	public void setCodigoCamisa(String codigoCamisa) {
		this.codigoCamisa = codigoCamisa;
	}


	public Espeficicacao_Camisa getEspc() {
		return espc;
	}


	public void setEspc(Espeficicacao_Camisa espc) {
		this.espc = espc;
	}
}

