package prjCadastro;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DAO.CategoriaDAO;
import DAO.PedidoDAO;
import model.Categoria;
import model.Pedido;

public class FrmPedido extends JDialog {
	
	private JLabel lbNome;
	private JButton btAdicionar;
	private JTextField txProduto;
	private JTextField txQtd;
	private JTextField txCliente;
	private JTextField txDataP;
	private JTextField txDataE;
	private JTextField txValores;
	
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
		txProduto = new JTextField();
		txProduto.setBounds(65, 20, 150, 20);
		add(txProduto);

		//qtd
		txQtd = new JTextField();
		txQtd.setBounds(140, 40, 150, 20);
		add(txQtd);

		//cli
		txCliente = new JTextField();
		txCliente.setBounds(60, 60, 150, 20);
		add(txCliente);

		//datap
		txDataP = new JTextField();
		txDataP.setBounds(105, 80, 150, 20);
		add(txDataP);

		//datae
		txDataE = new JTextField();
		txDataE.setBounds(90, 100, 150, 20);
		add(txDataE);
		
		//valore
		txValores = new JTextField();
		txValores.setBounds(95, 120, 150, 20);
		add(txValores);
		
		btAdicionar = new JButton("Cadastrar");
		btAdicionar.setBounds(180,170,100,50);     
		add(btAdicionar);
		
		btAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedidoDAO pedidoDao = new PedidoDAO();
				Pedido pedido = new Pedido();
				String produto = txProduto.getText();
				String qtd = txQtd.getText();
				pedido.setClientePedido(nome);
				pedido.setDataEntrega();
				pedido.setDataPedido();
				pedido.setProdutoPedido();
				pedido.setQtdeProduto();
				pedido.setValorEntrega();
				
				categoriaDao.adicionar(categoria);
			}
	    	
	    });
	}
}