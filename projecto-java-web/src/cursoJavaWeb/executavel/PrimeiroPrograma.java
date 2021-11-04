package cursoJavaWeb.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;
import cursoJavaWeb.classes.Disciplina;

public class PrimeiroPrograma {
	/* Main eh um metodo de auto execucao do java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			String nome = JOptionPane.showInputDialog("Nome do " + qtd + "º aluno(a) ");
			String apelido = JOptionPane.showInputDialog("Apelido do " + qtd + "º aluno(a): ");

			/*
			 * String curso = JOptionPane.showInputDialog("Curso: "); String regime =
			 * JOptionPane.showInputDialog("Regime"); String nivel =
			 * JOptionPane.showInputDialog("Nivel[1 - 4]"); String semestre =
			 * JOptionPane.showInputDialog("Semestre");
			 */

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			aluno1.setApelido(apelido);

			for (int pos = 1; pos <= 2; pos++) {
				String nomeDisc = JOptionPane.showInputDialog("Disciplina " + pos + ":");
				String notaDisc = JOptionPane.showInputDialog("Nota " + pos + ":");

				Disciplina disciplina = new Disciplina();
				disciplina.setNomeDisciplina(nomeDisc);
				disciplina.setNota(Double.parseDouble(notaDisc));

				aluno1.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno1);
		}

		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);

			System.out.println("Nome: " + aluno.getNome() + ";");
			System.out.println("Apelido: " + aluno.getApelido() + ";");
			System.out.println("Media Final: " + aluno.getMediaNota());
			System.out.println("Situação: " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------");
		}
	}
}
