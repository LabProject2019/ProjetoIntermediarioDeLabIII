package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 9999;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarGames();

		Controller controller = new Controller(model);
		
		//game
		controller.buscarGame();
		controller.buscarGameGenero();
		controller.buscarGameNome();
		controller.buscarGamePlataforma();
		controller.adicionarGame();
		
		//camisa
		controller.buscarCamisa();
		controller.buscarCamisaTamanho();
		controller.buscarCamisaEstampa();
		controller.adicionarCamisa();
    }
    
    public static void inicializarGames(){   
    	model.addGame(new Game("12345", new Especificacao("acao","god of war","ps4")));
    	
    	model.addCamisa(new Camisa("12345", new Espeficicacao_Camisa("M", "Naruto", "Preta")));
    }
}
