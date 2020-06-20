package Modulos;

public class Funcionario {

	private String Nome;	
	private String Sobrenome;
	private String CPF;
	private int Idade;
	private String Funcao;
	private Chefe Chefe;
	private boolean Ativo;
	
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
	public String getFuncao() {
		return Funcao;
	}
	public void setFuncao(String funcao) {
		Funcao = funcao;
	}
	public Chefe getChefe() {
		return Chefe;
	}
	public void setChefe(Chefe chefe) {
		Chefe = chefe;
	}
	public boolean getAtivo() {
		return Ativo;
	}
	
	//construtor
	public Funcionario(String nome, String sobrenome, String cpf, int idade, String funcao, Chefe chefe) {
		this.Nome=nome;
		this.Sobrenome = sobrenome;
		this.CPF = cpf;
		this.Idade = idade;
		this.Funcao = funcao;
		this.Chefe = chefe;
		Ativo = true;
	}
	
	//sobrecarga do construtor sem chefe caso for contratado sem alocação à setor
	public Funcionario(String nome, String sobrenome, String cpf, int idade, String funcao) {
		this.Nome=nome;
		this.Sobrenome = sobrenome;
		this.CPF = cpf;
		this.Idade = idade;
		this.Funcao = funcao;
		Chefe = null;
		Ativo = true;
	}
	
	//trocar o chefe do funcionario, apenas se já não for o chefe atual
	public void TrocarChefe(Chefe novoChefe) {
		if(novoChefe != Chefe)
		Chefe = novoChefe;
	}
	
	//Demissão do funcionario
	public void DesativarFuncionario() {
		Ativo = false;
	}
}
