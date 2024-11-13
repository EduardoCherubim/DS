package prjCadastro;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Menu extends JFrame{

	public Menu(){   

		this.setSize(800,600);
		this.setTitle("Exemplo Menu");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);

		JMenu arq = new JMenu("Arquivo");
		JMenu cad = new JMenu("Cadastrar");
		JMenu apr = new JMenu("Apresentar");
		JMenu aju = new JMenu("Ajuda");

		JMenuItem sair = new JMenuItem("Sair"); 
		JMenuItem categoria = new JMenuItem("Categoria");
		JMenuItem produto = new JMenuItem("Produto");
		JMenuItem cliente = new JMenuItem("Cliente");
		JMenuItem pedido = new JMenuItem("Pedido");
		JMenuItem aprCategoria = new JMenuItem("Categoria");
		JMenuItem aprProduto = new JMenuItem("Produto");
		JMenuItem aprCliente = new JMenuItem("Cliente");
		JMenuItem aprPedido = new JMenuItem("Pedido");
		JMenuItem sobre = new JMenuItem("Sobre");

		arq.add(sair);
		cad.add(categoria);
		cad.add(produto);
		cad.add(cliente);
		cad.add(pedido);
		apr.add(aprCategoria);
		apr.add(aprProduto);
		apr.add(aprCliente);
		apr.add(aprPedido);
		aju.add(sobre);

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(arq);
		bar.add(cad); 
		bar.add(apr);
		bar.add(aju);

		sair.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						System.exit(0);
					}
				}
				);

		categoria.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						FrmCategoria frmCat = new FrmCategoria();
						frmCat.setVisible(true);
					}
				}
				);

		produto.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						FrmProduto frmPro = new FrmProduto();
						frmPro.setVisible(true);
					}
				}
				);

		cliente.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						FrmCliente frmCli = new FrmCliente();
						frmCli.setVisible(true);
					}
				}
				);

		pedido.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						FrmPedido frmPed = new FrmPedido();
						frmPed.setVisible(true);
					}
				}
				);

		aprCategoria.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						AprCategoria aprCat = new AprCategoria();
						aprCat.setVisible(true);
					}
				}
				);

		aprProduto.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						AprProduto aprPro = new AprProduto();
						aprPro.setVisible(true);
					}
				}
				);

		aprCliente.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						AprCliente aprCli = new AprCliente();
						aprCli.setVisible(true);
					}
				}
				);

		aprPedido.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						AprPedido aprPed = new AprPedido();
						aprPed.setVisible(true);
					}
				}
				);

		this.setVisible(true);
	} 
}