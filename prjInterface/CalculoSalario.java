package prjInterface;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculoSalario extends JFrame{
	CalculoSalario(){
		
		JOptionPane.showConfirmDialog(null, "Deseja Continuar?","Pergunta",JOptionPane.YES_NO_CANCEL_OPTION);
		double sFixo = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o salario fixo?","Salario Fixo",JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null,"O valor que voce vai ganhar e de R$"+sFixo,"Valor a Recebe",JOptionPane.INFORMATION_MESSAGE);
		Object[] options1 = {"Maçã","Mamão","Abacaxi"};
		JOptionPane.showInputDialog(null,"Selecione a fruta desejada","Casa de Suco",
				JOptionPane.QUESTION_MESSAGE,null,options1,options1[0]);
		Object[] options2 = {"Confirmar","Cancelar","Voltar"};
		JOptionPane.showOptionDialog(null, "Deseja confirmar a compra", "Casa de Suco", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
	}
}
