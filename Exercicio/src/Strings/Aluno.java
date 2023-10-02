package Strings;

public class Aluno {
	private int matricula;
	private String nome, cpf;
	
	public  Aluno(String nome, String cpf, int mat) {
		this.nome =nome;
		this.cpf = cpf;
		this.matricula = mat;

	}
	
	public String toString() {
		String saida = "";
		saida+=nome+cpf+matricula;
		return saida;
	}
	
	public String getNom() {
		return nome;
	}
	public void setNom(String nom) {
		this.nome = nom;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
