package view;

import javax.swing.JOptionPane;

import controller.InverteController;

public class Principal {

	public static void main(String[] args) {
		InverteController invCont = new InverteController();
		String texto;
				texto = JOptionPane.showInputDialog("Insira uma frase ou palavra para ser invertida: ");
		JOptionPane.showMessageDialog(null, "Resultado invertido: " +invCont.inverte(texto));
	}
}