package cursoJavaWeb.executavel;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;

public class PrimeiroPrograma {
	/*Main eh um metodo de auto execucao do java*/
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Edilson");
		aluno1.setApelido("Sithoe");
		aluno1.setIdade(26);
		aluno1.setdataNascimento("05-10-1995");
		aluno1.setMorada("Zimpeto");
		aluno1.setDataMatricula("22-10-2021");
		
		System.out.println("Nome: "+aluno1.getNome()+";");
		System.out.println("Apelido: "+aluno1.getApelido()+";");
		System.out.println("Idade: "+aluno1.getIdade()+";");
		System.out.println("Data de Nasciemnto: "+aluno1.getdataNascimento()+";");
		System.out.println("Morada: "+aluno1.getMorada()+";");
		System.out.println("Data da Matricula: "+aluno1.getDataMatricula()+".");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Yannick");
		aluno2.setApelido("Mahumane");
		aluno2.setIdade(26);
		aluno2.setdataNascimento("05-10-1995");
		aluno2.setMorada("Zimpeto");
		aluno2.setDataMatricula("22-10-2021");
		
		System.out.println("********************** Aluno 2 *****************************");
		System.out.println("Nome: "+aluno2.getNome()+";");
		System.out.println("Apelido: "+aluno2.getApelido()+";");
		System.out.println("Idade: "+aluno2.getIdade()+";");
		System.out.println("Data de Nasciemnto: "+aluno2.getdataNascimento()+";");
		System.out.println("Morada: "+aluno2.getMorada()+";");
		System.out.println("Data da Matricula: "+aluno2.getDataMatricula()+".");
		
		Aluno aluno3 = new Aluno();
	}
}
