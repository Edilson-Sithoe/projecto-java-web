package cursoJavaWeb.executavel;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;

public class PrimeiroPrograma {
	/*Main eh um metodo de auto execucao do java*/
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Edilson";
		aluno1.apelido = "Sithoe";
		System.out.println("Nome: "+aluno1.nome+" "+aluno1.apelido);
		JOptionPane.showMessageDialog(null,"Nome completo: "+ aluno1.nome+" "+aluno1.apelido);
		
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
	}
}
