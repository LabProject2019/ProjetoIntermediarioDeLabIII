package hello;

public class Game {

	private String codigoGame;
	private Especificacao espc;

	
	public Game(String codigoGame, Especificacao espc){
		this.codigoGame = codigoGame;
		this.espc = espc;
	}


	public String getCodigoGame() {
		return codigoGame;
	}


	public void setCodigoGame(String codigoGame) {
		this.codigoGame = codigoGame;
	}


	public Especificacao getEspc() {
		return espc;
	}


	public void setEspc(Especificacao espc) {
		this.espc = espc;
	}	
}
