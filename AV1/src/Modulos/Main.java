package Modulos;

public class Main {

	public static void main(String[] args) {
		//criar chefes
		Chefe chefe = new Chefe("Calros", "Oliveira", "111.111.111-1", 39, "Solda");
		Chefe chefe2 = new Chefe("Pedro", "Santos", "222.222.222-22", 42, "Montagem");
			
		//verificar valores dos chefes
		System.out.println("Nome do chefe do setor de "+ chefe.getSetor() + ": "+ chefe.getNome()+" "+ chefe.getSobrenome());
		System.out.println("CPF: " + chefe.getCPF());
		System.out.println("Idade: " + chefe.getIdade()+"\n");
		
		System.out.println("Nome do chefe do setor de "+ chefe2.getSetor() + ": "+ chefe2.getNome()+" "+ chefe2.getSobrenome());
		System.out.println("CPF: " + chefe2.getCPF());
		System.out.println("Idade: " + chefe2.getIdade()+"\n");
			
		//criar funcionario
		Funcionario func = new Funcionario("Jõao", "Silva", "000.000.000-00", 24, "Soldador", chefe);
						
		//verificar valores do funcionario
		System.out.println("Nome do funcionario: "+ func.getNome()+" "+ func.getSobrenome());
		System.out.println("CPF: " + func.getCPF());
		System.out.println("Idade: " + func.getIdade());
		System.out.println("Função: "+ func.getFuncao());		
		
		//verificar o chefe e mandar mensagem se não tiver nenhum
		if(func.getChefe() != null)
			System.out.println("Chefe: "+ func.getChefe().getNome()+"\n");
		else
			System.out.println("Sem chefe cadastrado para este funcionário \n");
		
		//Iniciar projeto para o chefe2
		chefe2.IniciarProjeto("Montar grande quantidade de produtos");
		
		//trocar o chefe do funcionario
		func.TrocarChefe(chefe2);
		
		//set a função de acordo com o novo cargo do funcionario
		func.setFuncao("Montador");
		
		//verificar valores do funcionario após a troca de chefe e função
		System.out.println("Funcionario após a troca de chefe e função:");
		System.out.println("Nome do funcionario: "+ func.getNome()+" "+ func.getSobrenome());
		System.out.println("CPF: " + func.getCPF());
		System.out.println("Idade: " + func.getIdade());
		System.out.println("Função: "+ func.getFuncao());
		
		//demitir o funcionario
		func.DesativarFuncionario();
	}

}
