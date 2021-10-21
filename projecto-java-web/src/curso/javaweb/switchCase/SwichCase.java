package curso.javaweb.switchCase;

import javax.swing.JOptionPane;

public class SwichCase {
	public static void main(String[] args) {
		
		String pessoas = JOptionPane.showInputDialog("Quantas pessoas existem? ");
		String carros = JOptionPane.showInputDialog("Quantos carros existem? ");
		
		Double pessoasNumero = Double.parseDouble(pessoas);
		Double carrosNumero = Double.parseDouble(carros);
		
		int divisao = (int)(pessoasNumero/carrosNumero);
		Double resto = carrosNumero % pessoasNumero;
		
		int resp = JOptionPane.showConfirmDialog(null, "Deseja ver o resulado da divisão e o seu resto?");
		System.out.println(resp);
		
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu: " +divisao+ " carros e sobrou " +resto+" carros");
	}
}
