package prjInterface;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculoSalario extends JFrame{
	CalculoSalario(){
		
		double sFixo = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o salario fixo?","Salario Fixo",JOptionPane.QUESTION_MESSAGE));
		double vUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor de cada unidade?","Valor Unitario",JOptionPane.QUESTION_MESSAGE));
		int qtdVendida = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto voce vendeu?","Quantidade venda",JOptionPane.QUESTION_MESSAGE));
		double pComissao = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a comissao?","Comissao",JOptionPane.QUESTION_MESSAGE));
		double aReceber = sFixo + ((vUnitario*qtdVendida)*pComissao/100);
		JOptionPane.showMessageDialog(null,"O valor que voce vai ganhar e de R$"+aReceber,"Valor a Recebe",JOptionPane.INFORMATION_MESSAGE);
	}
}
