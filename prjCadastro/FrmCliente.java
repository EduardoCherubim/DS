package prjCadastro;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FrmCliente extends JDialog {

	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txNome;

	public FrmCliente() {		
		this.setTitle("Cadastro de Clientes");
		this.setModal(true);
		this.setSize(500,470);  
		this.setResizable(false);
		this.setLocationRelativeTo(null);	

		Container janelacalc = this.getContentPane();
		setLocationRelativeTo(janelacalc);
		janelacalc.setLayout(null);

		JTabbedPane tabbedpane = new JTabbedPane();
		tabbedpane.setBounds(0,0,500,470);     

		JPanel painel1 = new JPanel();
		painel1.setLayout(null);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(10,20,50,20);     
		painel1.add(lbNome);


		lbNome = new JLabel("Rg:");
		lbNome.setBounds(10,40,50,20);     
		painel1.add(lbNome);


		lbNome = new JLabel("Cpf:");
		lbNome.setBounds(10,60,50,20);     
		painel1.add(lbNome);


		lbNome = new JLabel("Data de Nascimento:");
		lbNome.setBounds(10,80,120,20);     
		painel1.add(lbNome);

		//nome
		txNome = new JTextField();
		txNome.setBounds(55, 20, 150, 20);
		painel1.add(txNome);

		//rg
		txNome = new JTextField();
		txNome.setBounds(55, 40, 150, 20);
		painel1.add(txNome);

		//cpf
		txNome = new JTextField();
		txNome.setBounds(55, 60, 150, 20);
		painel1.add(txNome);

		//data nasc
		txNome = new JTextField();
		txNome.setBounds(135, 80, 150, 20);
		painel1.add(txNome);


		btAdicionar = new JButton("Cadastrar");
		btAdicionar.setBounds(145,250,100,50);
		painel1.add(btAdicionar);


		/*EventoBotao evb = new EventoBotao();
		btAdicionar.addActionListener(evb);*/

		tabbedpane.addTab("Aba 1", null,painel1,"Primeiro Painel");

		JPanel painel2 = new JPanel();
		painel2.setLayout(null);

		lbNome = new JLabel("Endereço:");
		lbNome.setBounds(10,20,80,20);     
		painel2.add(lbNome);


		lbNome = new JLabel("Número:");
		lbNome.setBounds(10,40,50,20);     
		painel2.add(lbNome);


		lbNome = new JLabel("Cep:");
		lbNome.setBounds(10,60,50,20);     
		painel2.add(lbNome);


		lbNome = new JLabel("Bairro:");
		lbNome.setBounds(10,80,50,20);     
		painel2.add(lbNome);


		lbNome = new JLabel("Cidade:");
		lbNome.setBounds(10,100,50,20);     
		painel2.add(lbNome);


		lbNome = new JLabel("Estado:");
		lbNome.setBounds(10,120,50,20);     
		painel2.add(lbNome);

		//endereço
		txNome = new JTextField();
		txNome.setBounds(70, 20, 150, 20);
		painel2.add(txNome);

		//numero
		txNome = new JTextField();
		txNome.setBounds(65, 40, 150, 20);
		painel2.add(txNome);

		//cep
		txNome = new JTextField();
		txNome.setBounds(55, 60, 150, 20);
		painel2.add(txNome);

		//bairro
		txNome = new JTextField();
		txNome.setBounds(55, 80, 150, 20);
		painel2.add(txNome);

		//cidade
		txNome = new JTextField();
		txNome.setBounds(55, 100, 150, 20);
		painel2.add(txNome);

		//estado
		txNome = new JTextField();
		txNome.setBounds(55, 120, 150, 20);
		painel2.add(txNome);

		btAdicionar = new JButton("Cadastrar");
		btAdicionar.setBounds(145,250,100,50);
		painel2.add(btAdicionar);

		tabbedpane.addTab("Aba 2", null,painel2,"Segundo Painel");
		janelacalc.add(tabbedpane);
	}
}