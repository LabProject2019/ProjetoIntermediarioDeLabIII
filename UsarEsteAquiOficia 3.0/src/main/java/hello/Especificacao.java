package hello;

public class Especificacao 
{
	private String genero;
	private String nome;
	private String plataforma;
	
	public Especificacao(String genero, String nome, String plataforma) 
	{
		this.genero = genero;
		this.nome = nome;
		this.plataforma = plataforma;
	}
	public String getGenero() 
	{
		return genero;
	}
	public void setGenero(String genero) 
	{
		this.genero = genero;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	//Metodos de Comparacao
	
	//Comparacao usando todas as especificacoes
	public boolean compararJog(Especificacao esp) {
		if(genero.equals(esp.genero) && nome.equals(esp.nome) && plataforma.equals(esp.plataforma)){
				return true;
		}
		else
		{
			return false;
		}
	}
	
}
