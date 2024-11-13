package prjCadastro;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PgSobre extends JDialog {

	private JLabel lbNome;
	
	public PgSobre() {		
		this.setTitle("Cadastro de Produtos");
		this.setModal(true);
		this.setSize(500,470);  
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		Container janelacalc = this.getContentPane();
		setLocationRelativeTo(janelacalc);
		janelacalc.setLayout(null);
		
		lbNome = new JLabel("Página feita por Eduardo Cherubim e Carlos Alexandre");
		lbNome.setBounds(10,20,400,20);     
		add(lbNome);
		
	}
}