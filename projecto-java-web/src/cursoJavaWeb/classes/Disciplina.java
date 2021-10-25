package cursoJavaWeb.classes;

import java.util.Objects;

public class Disciplina {
	
	private double nota1;
	private double nota2;
	
	
	
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
	
	@Override
	public int hashCode() {
		return Objects.hash(nota1, nota2);
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
		return nota1 == other.nota1 && nota2 == other.nota2;
	}
	
	
}
