package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	//Game
	public void buscarGame(){
		get("/game/:genero/:nome/:plataforma", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":genero"), req.params(":nome"), req.params(":plataforma"));	
			List<Game> gamesEncontrados = model.buscarEspecificacao(espec);	
			return new Gson().toJson(gamesEncontrados);
			
		});
	}
	
	//Camisa
	public void buscarCamisa() {
		get("camisa/:tamanho/:estampa/:cor", (req,res) -> {
			Espeficicacao_Camisa especC = new Espeficicacao_Camisa(req.params(":tamanho"),req.params(":estampa"),req.params(":cor"));
			List<Camisa> camisasEncontradas = model.buscarEspecificacao_Camisa(especC);
			return new Gson().toJson(camisasEncontradas);
		});
	}
	
	
	/*public void buscarGameNome(){
		get("/game99/:nome", (req, res) -> {
		
			
			Game gamesEncontrados = model.buscarNome(req.params(":nome"));	
			return new Gson().toJson(gamesEncontrados);
			
		});
	}*/
	//Game
	public void buscarGameGenero(){
		get("/game5/:genero", (req, res) -> {
		
			
			List<Game> gamesEncontrados = model.buscarGenero(req.params(":genero"));	
			return new Gson().toJson(gamesEncontrados);
			
		});
	}
	
	//Camisa
	public void buscarCamisaEstampa() {
		get("/camisa110/:estampa", (req,res) ->{
			List<Camisa> camisasEncontradas = model.buscarEstampa(req.params(":estampa"));
			return new Gson().toJson(camisasEncontradas);
		});
	}
	
	
	//Game
	public void buscarGameNome(){
		get("/game2/:nome", (req, res) -> {
		
			
			List<Game> gamesEncontrados = model.buscarNome(req.params(":nome"));	
			return new Gson().toJson(gamesEncontrados);
			
		});
	}
	//Camisa
	public void buscarCamisaTamanho(){
		get("/camisa100/:tamanho", (req, res) -> {
			List<Camisa> camisasEncontradas = model.buscarTamanho(req.params(":tamanho"));
			return new Gson().toJson(camisasEncontradas);
			
		});
	}
	
	//Game
	public void buscarGamePlataforma(){
		get("/game99/:plataforma", (req, res) -> {
		
			
			List<Game> gamesEncontrados = model.buscarPlataforma(req.params(":plataforma"));	
			return new Gson().toJson(gamesEncontrados);
			
		});
	}
	
	//Game
	public void adicionarGame() {
		get("/game3/:codigoGame/:genero/:nome/:plataforma", (req, res) -> {
			
			
			model.addGame(new Game(req.params(":codigoGame"), new Especificacao(req.params(":genero"), req.params(":nome"), req.params(":plataforma"))));
			return "";
					
		});
	}
	
	//Camisa
	public void adicionarCamisa() {
		get("/camisa200/:codigo/:tamanho/:estampa/:cor", (req, res) -> {
			
			
			model.addCamisa(new Camisa(req.params(":codigo"), new Espeficicacao_Camisa(req.params(":tamanho"), req.params(":estampa"), req.params(":cor"))));
			return "";
					
		});
	}
}
