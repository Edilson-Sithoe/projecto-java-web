package cursoJavaWeb.classes;

import java.util.Objects;

public class Disciplina {
	
	private double nota1;
	private double nota2;
	private String nomeDisciplina;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nomeDisciplina, nota1, nota2);
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
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2);
	}
	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", nota2=" + nota2 + ", nomeDisciplina=" + nomeDisciplina + "]";
	}
	

	
	
}
