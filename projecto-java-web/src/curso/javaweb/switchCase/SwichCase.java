package curso.javaweb.switchCase;

import javax.swing.DefaultBoundedRangeModel;

public class SwichCase {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 12;
		int nota3 = 14;
		int nota4 = 16;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		int media = 2;
		switch (media) {
			case 10:
				System.out.println("Vai ao exame com "+ media);
			break;
			case 12:
				System.out.println("Vai ao exame com "+ media);
			break;
			case 14:
				System.out.println("Dispensa com media " +media);
			break;
			default: 
				System.out.println("Outro valor " + media);
			break;
		}
	}
}
