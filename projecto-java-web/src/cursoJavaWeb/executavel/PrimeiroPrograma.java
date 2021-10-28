package cursoJavaWeb.executavel;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;

public class PrimeiroPrograma {
	/* Main eh um metodo de auto execucao do java */
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome: ");
		String apelido = JOptionPane.showInputDialog("Apelido");
		
		String curso = JOptionPane.showInputDialog("Curso: ");
		String regime = JOptionPane.showInputDialog("Regime");
		String nivel = JOptionPane.showInputDialog("Nivel[1 - 4]");
		String semestre = JOptionPane.showInputDialog("Semestre");
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		
		Aluno aluno1 = new Aluno();		
		
		aluno1.setNome(nome);
		aluno1.setApelido(apelido);
		aluno1.getCurso().setNomeCurso(curso);
		aluno1.getCurso().setRegimeCurso(regime);
		aluno1.getCurso().setNivelCurso(nivel);
		aluno1.getCurso().setSemestreCurso(semestre);
		aluno1.getDisciplina().setNomeDisciplina(disciplina);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));	
		
		System.out.println("Nome: "+aluno1.getNome()+";");
		System.out.println("Apelido: "+aluno1.getApelido()+";");
		System.out.println("Curso: "+aluno1.getCurso().getNomeCurso());
		System.out.println("Regime: "+aluno1.getCurso().getRegimeCurso());
		System.out.println("Nível: "+aluno1.getCurso().getNivelCurso());
		System.out.println("Semestre: "+aluno1.getCurso().getSemestreCurso());
		System.out.println("Disciplina: "+aluno1.getDisciplina().getNomeDisciplina());
		System.out.println("Media Fianl: "+aluno1.getMediaNota());
		System.out.println("Situação: "+aluno1.getSituacaoAluno());

		
	}
}
