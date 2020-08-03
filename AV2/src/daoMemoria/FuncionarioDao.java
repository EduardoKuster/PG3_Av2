package daoMemoria;

import java.util.ArrayList;

import Modulos.*;

public class FuncionarioDao {

	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	//Lista dos funcionarios
	public ArrayList<Funcionario> getFuncionarios(){
		return funcionarios;
	}

	//dao de chefes dos funcionarios
	private ChefeDao daoChefe = new ChefeDao();
	
	//popular lista de funcionarios ao criar o dao
	public FuncionarioDao(){		
		funcionarios.add(new Funcionario("João", "Silva", "000.000.000-00", 24, "Soldador", daoChefe.getChefes().get(0)));
		funcionarios.add(new Funcionario("Paulo", "Oliveira", "000.000.000-01", 32, "Montador júnior", daoChefe.getChefes().get(1)));
		funcionarios.add(new Funcionario("Sandra", "Almeida", "000.000.000-02", 21, "Secretária"));
	}
}
