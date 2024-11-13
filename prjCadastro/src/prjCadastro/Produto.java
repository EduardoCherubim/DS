package prjCadastro;

public class Produto {

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

}
