package cursoJavaWeb.classes;

public class Aluno {
	
	private String nome;
	private String apelido;
	private int idade;
	private String dataNascimento;
	private String morada;
	private String dataMatricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getdataNascimento() {
		return dataNascimento;
	}

	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

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

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4)/4;
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
}
