package cursoJavaWeb.executavel;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;
import cursoJavaWeb.classes.Disciplina;

public class PrimeiroPrograma {
	/* Main eh um metodo de auto execucao do java */
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome: ");
		String apelido = JOptionPane.showInputDialog("Apelido");
		
		/*	String curso = JOptionPane.showInputDialog("Curso: ");
		String regime = JOptionPane.showInputDialog("Regime");
		String nivel = JOptionPane.showInputDialog("Nivel[1 - 4]");
		String semestre = JOptionPane.showInputDialog("Semestre");
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");*/

		Aluno aluno1 = new Aluno();	
		
		
		
		aluno1.setNome(nome);
		aluno1.setApelido(apelido);
		
		
		for (int pos = 1; pos <= 2; pos++) {
			String nomeDisc = JOptionPane.showInputDialog("Disciplina "+pos+":");
			String notaDisc = JOptionPane.showInputDialog("Nota "+pos+":");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setNomeDisciplina(nomeDisc);
			disciplina.setNota(Double.parseDouble(notaDisc));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma disciplina?");
		
		if (escolha == 0) {
			String discRemover  = JOptionPane.showInputDialog("Qual o numero da disciplina deseja remover? 1 ou 2");
			aluno1.getDisciplinas().remove(Integer.valueOf(discRemover).intValue() - 1);
		}
		


		
		System.out.println("Nome: "+aluno1.getNome()+";");
		System.out.println("Apelido: "+aluno1.getApelido()+";");
	
		System.out.println("Media Final: "+aluno1.getMediaNota());
		System.out.println("Situação: "+aluno1.getSituacaoAluno());

		
	}
}
