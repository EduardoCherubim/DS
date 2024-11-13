package prjCadastro;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FrmProduto extends JDialog {

	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txNome;

	public FrmProduto() {		
		this.setTitle("Cadastro de Produtos");
		this.setModal(true);
		this.setSize(500,470);  
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		Container janelacalc = this.getContentPane();
		setLocationRelativeTo(janelacalc);
		janelacalc.setLayout(null);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(10,20,50,20);     
		add(lbNome);


		lbNome = new JLabel("Descrição:");
		lbNome.setBounds(10,40,100,20);     
		add(lbNome);


		lbNome = new JLabel("Valor:");
		lbNome.setBounds(10,60,50,20);     
		add(lbNome);


		lbNome = new JLabel("Marca:");
		lbNome.setBounds(10,80,120,20);     
		add(lbNome);

		lbNome = new JLabel("Fornecedor:");
		lbNome.setBounds(10,100,120,20);     
		add(lbNome);

		//nome
		txNome = new JTextField();
		txNome.setBounds(55, 20, 150, 20);
		add(txNome);

		//desc
		txNome = new JTextField();
		txNome.setBounds(80, 40, 150, 20);
		add(txNome);

		//valor
		txNome = new JTextField();
		txNome.setBounds(55, 60, 150, 20);
		add(txNome);

		//marca
		txNome = new JTextField();
		txNome.setBounds(60, 80, 150, 20);
		add(txNome);

		//fornecedor
		txNome = new JTextField();
		txNome.setBounds(80, 100, 150, 20);
		add(txNome);

		btAdicionar = new JButton("Cadastrar");
		btAdicionar.setBounds(150,140,100,60);     
		add(btAdicionar);
	}
}