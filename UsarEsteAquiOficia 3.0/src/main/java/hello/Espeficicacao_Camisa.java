package hello;

public class Espeficicacao_Camisa 
{
	private String tamanho;
	private String estampa;
	private String cor;
	
	public Espeficicacao_Camisa(String tamanho, String estampa, String cor) {
		
		this.tamanho = tamanho;
		this.estampa = estampa;
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public boolean comparar_camisa(Espeficicacao_Camisa espC){
		if(tamanho.equals(espC.tamanho) && estampa.equals(espC.estampa) && cor.equals(espC.cor)){
			return true;
		} else {
			return false;
		}
	}
}
