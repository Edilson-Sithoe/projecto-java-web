package cursoJavaWeb.classes;

import java.util.Objects;

public class Curso {
	
	private String nomeCurso;
	private String regimeCurso;
	private String nivelCurso;
	private String semestreCurso;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getRegimeCurso() {
		return regimeCurso;
	}
	public void setRegimeCurso(String regimeCurso) {
		this.regimeCurso = regimeCurso;
	}
	public String getNivelCurso() {
		return nivelCurso;
	}
	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}
	public String getSemestreCurso() {
		return semestreCurso;
	}
	public void setSemestreCurso(String semestreCurso) {
		this.semestreCurso = semestreCurso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nivelCurso, nomeCurso, regimeCurso, semestreCurso);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(nivelCurso, other.nivelCurso) && Objects.equals(nomeCurso, other.nomeCurso)
				&& Objects.equals(regimeCurso, other.regimeCurso) && Objects.equals(semestreCurso, other.semestreCurso);
	}
	
	@Override
	public String toString() {
		return "Curso [nomeCurso=" + nomeCurso + ", regimeCurso=" + regimeCurso + ", nivelCurso=" + nivelCurso
				+ ", semestreCurso=" + semestreCurso + "]";
	}
	
	
}
