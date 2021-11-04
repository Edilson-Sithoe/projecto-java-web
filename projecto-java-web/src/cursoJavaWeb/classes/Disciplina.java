package cursoJavaWeb.classes;

import java.util.Objects;

public class Disciplina {
	/*
	 * Trabalhando com listas Esta classe servirá para todos os objcetos e
	 * Instâncias de notas e maaterias
	 */

	private double nota;
	private String nomeDisciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeDisciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nomeDisciplina, other.nomeDisciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", nomeDisciplina=" + nomeDisciplina + "]";
	}

}
