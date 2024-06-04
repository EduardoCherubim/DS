package prjCadastro;
import java.util.Scanner;
public class Pessoa {
	Scanner in = new Scanner(System.in);
	public String nome;
	public int nascimento;
	public String estado;
	public char genero;
	private int rg;
	private int cpf;
	public String email;
	public int telefone;
	private String endereco;
	private int cep;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getEmail() {
		return this.email;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public int getNascimento() {
		return this.nascimento;
	}
	public int getRg() {
		return this.rg;
	}
	public int getCpf() {
		return this.cpf;
	}
	public int getCep() {
		return this.cep;
	}
	public int getTelefone() {
		return this.telefone;
	}
	public char getGenero() {
		return this.genero;
	}
}