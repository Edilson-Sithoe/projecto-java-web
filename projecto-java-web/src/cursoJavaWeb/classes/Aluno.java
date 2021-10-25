package cursoJavaWeb.classes;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private String apelido;
	
	private Disciplina disciplina = new Disciplina();
	
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2())/2;
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		
		if (media > 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getSituacaoAluno() {
		double media = this.getMediaNota();
		if (media < 10) {
			return "Aluno Excluido";
		} else if((media > 9) && (media < 14)){
			return "Admitido";
		} else {
			return "Dispensado";
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
		return "Aluno [nome:" + nome + ", apelido:" + apelido + ", disciplina:" + disciplina + "]";
	}

	
}
