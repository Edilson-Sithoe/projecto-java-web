package curso.javaweb.edilson;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String apelido;
	private int idade;
	private Date dataNascimento;

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setData_nascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
