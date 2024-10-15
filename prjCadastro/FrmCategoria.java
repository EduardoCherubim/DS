package prjCadastro;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FrmCategoria extends JDialog {
	
	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txNome;
	
	
	public FrmCategoria() {		
		this.setTitle("Cadastro de Categorias");
	    this.setModal(true);
	    this.setSize(500,500);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	    Container janelacalc = this.getContentPane();
	    setLocationRelativeTo(janelacalc);
	    janelacalc.setLayout(null);
	    
	    lbNome = new JLabel();
	    lbNome.setText("Insira o nome da Categoria:");
	    lbNome.setBounds(5,0,200,100);
	    add (lbNome);
	    
	    txNome = new JTextField();
	    txNome.setBounds(5,70,200,30);
	    add (txNome);
	    
	    btAdicionar = new JButton();
	    btAdicionar.setBounds(145,250,100,50);
	    btAdicionar.setText("Cadastrar");
	    add (btAdicionar);
	}
}