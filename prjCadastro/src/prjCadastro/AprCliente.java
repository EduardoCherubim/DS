package prjCadastro;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AprCliente extends JDialog {
	
	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txNome;
	
	
	public AprCliente() {		
		this.setTitle("Apresentação de clientes");
	    this.setModal(true);
	    this.setSize(500,500);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	    
	}
}