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

		int nota1 = 10;
		int nota2 = 12;
		int nota3 = 14;
		int nota4 = 16;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		int media1 = 2;
		switch (media1) {
			case 10:
				System.out.println("Vai ao exame com "+ media1);
			break;
			case 12:
				System.out.println("Vai ao exame com "+ media1);
			break;
			case 14:
				System.out.println("Dispensa com media " +media1);
			break;
			default: 
				System.out.println("Outro valor " + media1);
			break;
		}
//github.com/Edilson-Sithoe/projecto-java-web.git
	}
}
