package prjCadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmPedido extends JDialog {
	
	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txNome;
	
	public FrmPedido() {		
		this.setTitle("Cadastro de Pedidos");
	    this.setModal(true);
	    this.setSize(500,470);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);	
	    
	    Container janelacalc = this.getContentPane();
	    setLocationRelativeTo(janelacalc);
	    janelacalc.setLayout(null);
	    
	    lbNome = new JLabel("Produto:");
		lbNome.setBounds(10,20,50,20);     
		add(lbNome);


		lbNome = new JLabel("Quantidade Produtos:");
		lbNome.setBounds(10,40,140,20);     
		add(lbNome);


		lbNome = new JLabel("Cliente:");
		lbNome.setBounds(10,60,50,20);     
		add(lbNome);


		lbNome = new JLabel("Data do Pedido:");
		lbNome.setBounds(10,80,120,20);     
		add(lbNome);

		lbNome = new JLabel("Data Entrega:");
		lbNome.setBounds(10,100,120,20);     
		add(lbNome);
		
		lbNome = new JLabel("Valor Entrega:");
		lbNome.setBounds(10,120,120,20);     
		add(lbNome);

		//Produto
		txNome = new JTextField();
		txNome.setBounds(65, 20, 150, 20);
		add(txNome);

		//qtd
		txNome = new JTextField();
		txNome.setBounds(140, 40, 150, 20);
		add(txNome);

		//cli
		txNome = new JTextField();
		txNome.setBounds(60, 60, 150, 20);
		add(txNome);

		//datap
		txNome = new JTextField();
		txNome.setBounds(105, 80, 150, 20);
		add(txNome);

		//datae
		txNome = new JTextField();
		txNome.setBounds(90, 100, 150, 20);
		add(txNome);
		
		//valore
		txNome = new JTextField();
		txNome.setBounds(95, 120, 150, 20);
		add(txNome);
	}
}