package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class PrincipalView {

	public static void main(String[] args) {
		
		int num = -1;
		while (num < 0 || num > 1000) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo ate 1000"));
		}
		
		ConverteController c = new ConverteController();
		
		String resul = c.decToBin(num);
		System.out.println(resul);
	}
}
