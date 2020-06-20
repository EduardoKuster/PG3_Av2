package Modulos;

public class Chefe {
	
	private String Nome;
	private String Sobrenome;
	private String CPF;
	private int Idade;
	private String Setor;
	private String projeto;
	
	//getters e setters da classe
	public String getNome() {
		return Nome;
	}	
	public String getSobrenome() {
		return Sobrenome;
	}	
	public String getCPF() {
		return CPF;
	}	
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSetor() {
		return Setor;
	}
	public void setSetor(String setor) {
		this.Setor = setor;
	}
		
	public String getProjeto() {
		return projeto;
	}
	
	//construtor
	public Chefe(String nome, String sobrenome, String cpf, int idade, String setor) {
		this.Nome=nome;
		this.Sobrenome = sobrenome;
		this.CPF = cpf;
		this.Idade = idade;
		this.Setor = setor;		
	}
	
	// Iniciar um novo projeto apenas se for diferente do projeto atual
	public void IniciarProjeto(String nomeDoProjeto) {
		if(nomeDoProjeto != projeto)
			this.projeto = nomeDoProjeto;
	}
}
	

