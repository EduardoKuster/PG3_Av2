package Modulos;

import Views.TelaEmpresa;
import daoMemoria.*;

public class Main {

	public static void main(String[] args) {
		//criar daos (e popula-los pelos construtores)
		FuncionarioDao daoFunc = new FuncionarioDao();
		ChefeDao daoChefe = new ChefeDao();
		
		//instanciar a tela com as informacoes de chefes e funcionarios e deixa-la visivel
		TelaEmpresa tela = new TelaEmpresa();
		tela.setVisible(true);
	}

}
