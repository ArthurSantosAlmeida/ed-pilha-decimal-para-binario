package controller;

import model.Pilha;

public class ConverteController {

	public ConverteController() {
		
	}
	
	public String decToBin (int decimal) {
		
		Pilha p = new Pilha();
		int i=0;
		
		if (decimal == 0) {
			p.push(0);
		}
		else {	
			while (decimal > 0) {
				p.push(decimal % 2);
				decimal = decimal / 2;
			}
		}
	
		StringBuffer buffer = new StringBuffer();
		while (!p.isEmpty()) {
			try {
				buffer.append(p.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String bin = buffer.toString();
		return bin;
	}
}
