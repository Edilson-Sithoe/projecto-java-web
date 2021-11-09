package cursoJavaWeb.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import curso.javaweb.constantes.StatusAluno;

public class Aluno {

	private String nome;
	private String apelido;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Curso> cursos = new ArrayList<Curso>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();

		if (media > 10) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media > 9 && media < 14) {
			if (media > 9) {
				return "Aprovado";
			} else {
				return "Recorrencia";
			}
		} else if (media > 13) {
			return "Aluno dispensado";
		} else {
			return "Excluido";
		}
	}

	public String getSituacaoAluno() {
		double media = this.getMediaNota();
		if (media < 10) {
			return StatusAluno.EXCLUIDO;
		} else if ((media > 9) && (media < 14)) {
			return StatusAluno.ADMITIDO;
		} else {
			return StatusAluno.DESPENSADO;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", apelido=" + apelido + "]";
	}

}
