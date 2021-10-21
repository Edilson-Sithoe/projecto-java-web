package curso.javaweb.switchCase;


public class SwichCase {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 12;
		int nota3 = 14;
		int nota4 = 16;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		int dia = 2;
		switch (dia) {
			case 1:
				System.out.println("Domingo");
			break;
			case 2:
				System.out.println("Segunda-feira");
			break;
			case 3:
				System.out.println("Terça-feria");
			break;
			default: 
				System.out.println("Outro valor " + dia);
			break;
		}
	}
}
