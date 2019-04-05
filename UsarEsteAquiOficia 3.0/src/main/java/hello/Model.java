 package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	//Games
	private List<Game> games = new LinkedList<Game>();

	
	public void addGame(Game game){
		games.add(game);
	}
	
	
	public Game buscarCodigoGame(String nome){
		for(Game game:games){
			if(game.getCodigoGame().equals(nome)) return game;
		}
		
		return null;
	}
	
	
	public List<Game> buscarEspecificacao(Especificacao esp){
		List<Game> gamesEncontrados = new LinkedList<Game>();
		
		for(Game game:games){
			 if(esp.compararJog(game.getEspc())) gamesEncontrados.add(game);
		}
		
		return gamesEncontrados;
		
	}
	
	
	public List<Game> buscarPlataforma(String plataforma){
		List<Game> gamesEncontrados = new LinkedList<Game>();
		for(Game game:games) {
			if(game.getEspc().getPlataforma().equals(plataforma)) gamesEncontrados.add(game);
		}
		return gamesEncontrados;
	}
	
	public List<Game> buscarNome(String nome){
		List<Game> gamesEncontrados = new LinkedList<Game>();
		for(Game game:games) {
			if(game.getEspc().getNome().equals(nome)) gamesEncontrados.add(game);
		}
		return gamesEncontrados;
	}
	
	public List<Game> buscarGenero(String genero){
		List<Game> gamesEncontrados = new LinkedList<Game>();
		for(Game game:games) {
			if(game.getEspc().getGenero().equals(genero)) gamesEncontrados.add(game);
		}
		return gamesEncontrados;
	}
	
	public List<Game> getGame(){
		return games;
	}
	
	
	//Camisa
	private List<Camisa> camisas = new LinkedList<Camisa>();
	
	public void addCamisa(Camisa camisa){
		camisas.add(camisa);
	}
	
	
	public Camisa buscarCodigo(String codigo){
		for(Camisa camisa:camisas){
		if(camisa.getCodigoCamisa().equals(codigo)) return camisa;
		}
		
		return null;
	}
	
	
	public List<Camisa> buscarEspecificacao_Camisa(Espeficicacao_Camisa espC){
		List<Camisa> camisasEncontradas = new LinkedList<Camisa>();
		
		for(Camisa camisa:camisas){
			if(espC.comparar_camisa(camisa.getEspc())) camisasEncontradas.add(camisa);
		}
		
		return camisasEncontradas;
		
	}
	
	
	public List<Camisa> buscarTamanho(String tamanho){
		List<Camisa> camisasEncontradas = new LinkedList<Camisa>();
		for(Camisa camisa:camisas) {
			if(camisa.getEspc().getTamanho().equals(tamanho)) camisasEncontradas.add(camisa);
		}
		return camisasEncontradas;
	}
	
	public List<Camisa> buscarEstampa(String estampa){
		List<Camisa> camisasEncontradas = new LinkedList<Camisa>();
		for(Camisa camisa:camisas) {
			if(camisa.getEspc().getEstampa().equals(estampa)) camisasEncontradas.add(camisa);
		}
		return camisasEncontradas;
	}
	public List<Camisa> getCamisa(){
		return camisas;
	}

}
