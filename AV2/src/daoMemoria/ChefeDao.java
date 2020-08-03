package daoMemoria;

import java.util.ArrayList;

import Modulos.*;

public class ChefeDao {
	
	private ArrayList<Chefe> chefes = new ArrayList<Chefe>();
	//Listagem dos chefes 
	public ArrayList<Chefe> getChefes(){
		return chefes;
	}
	
	//popular lista de chefes ao criar o dao
	public ChefeDao(){
		chefes.add(new Chefe("Calros", "Oliveira", "111.111.111-1", 39, "Solda"));
		chefes.get(0).IniciarProjeto("Saldando uma viga");
		chefes.add(new Chefe("Pedro", "Santos", "222.222.222-22", 42, "Montagem"));
		chefes.get(1).IniciarProjeto("Montando peças");
	}
}
