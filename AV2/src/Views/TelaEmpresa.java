package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import daoMemoria.*;
import Modulos.*;

import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaEmpresa extends JFrame {

	//painel de controle de componentes
	private JPanel contentPane;
	
	//instânciações dos DAOs a serem utilizados
	private ChefeDao daoChefe = new ChefeDao();
	private FuncionarioDao daoFunc = new FuncionarioDao();
		
	//codigo main gerado automaticamente, mantido para testes futuros
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpresa frame = new TelaEmpresa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//inicio  do código gerado automaticamente pelo JavaSwing
	public TelaEmpresa() {
		setTitle("Listagem de Funcion\u00E1rios e Chefes de setor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JTextArea taChefe = new JTextArea();
		taChefe.setEditable(false);
		taChefe.setLineWrap(true);
		taChefe.setRows(10);
		taChefe.setColumns(50);
		
		JLabel lbChefes = new JLabel("Chefes");
		
		JLabel lbFuncionarios = new JLabel("Funcionarios");
		
		JTextArea taFuncionario = new JTextArea();
		taFuncionario.setEditable(false);
		taFuncionario.setRows(10);
		taFuncionario.setColumns(50);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbChefes, Alignment.LEADING)
								.addComponent(lbFuncionarios, Alignment.LEADING))
							.addContainerGap(658, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(taChefe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
								.addComponent(taFuncionario, 0, 0, Short.MAX_VALUE))
							.addGap(176))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(lbChefes)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(taChefe, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lbFuncionarios)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taFuncionario, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		//fim do código gerado automaticamente pelo JavaSwing
		
		//chama funcao para botar as informacoes no TextArea para chefes
		atualizarDadosChefes(taChefe);
		//chama funcao para botar as informacoes no TextArea para funcionarios
		atualizarDadosFuncionarios(taFuncionario);
	}
	
	//preenche o textArea com os dados dos chefes vindos do dao
	private void atualizarDadosChefes(JTextArea taChefe) {		
		for (Chefe chefe : daoChefe.getChefes()) {
			taChefe.append("Nome: "+chefe.getNome()+" "+ chefe.getSobrenome()+ " CPF: "+ chefe.getCPF()+ " Setor: "+ chefe.getSetor() + " Projeto: " + (chefe.getProjeto() == null? " nenhum \n" : " "+chefe.getProjeto()+ "\n"));			
		}
	}
	
	//preenche o textArea com os dados dos funcionarios vindos do dao
	private void atualizarDadosFuncionarios(JTextArea taFunc) {		
		for (Funcionario func : daoFunc.getFuncionarios()) {
			taFunc.append("Nome: "+func.getNome()+" "+ func.getSobrenome()+ " CPF: "+ func.getCPF());	
			if(func.getChefe() != null) {
				taFunc.append(" Setor: "+ func.getChefe().getSetor());
			}
			taFunc.append("\n");
		}
	}
}
