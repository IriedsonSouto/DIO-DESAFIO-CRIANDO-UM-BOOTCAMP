package programa;

import Enums.*;
import Exceptions.EmailInvalidoException;

public class Pessoa implements Comparable<Pessoa>{
	
	//Atributos
	private String nome;
	private String telefone;
	private String email;
	private Sexo sexo;
	private Vinculo vinculo;
	
	// construtores Pessoa
	public Pessoa(){}
	
	public Pessoa(String nome, String email, Sexo sexo, Vinculo vinculo){
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.vinculo = vinculo;
	}
	

	// Metodos get
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public Vinculo getVinculo() {
		return vinculo;
	}
	
	//Metodos set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) throws EmailInvalidoException {
		Autenticacao.validarEmail(email);
		this.email = email;	
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}
	
	
	// Sobreescrita metodo equals
	public boolean equals(Pessoa pessoa) {
		if (getEmail().equals(pessoa.getEmail())){
			return true;
		}
		return false;
	}
	
	// Sobreescrita metodo compareTo
	@Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareTo(pessoa.getNome());
    }

	// Sobreescrita metodo toString
	@Override
	public String toString() {
		return "Nome: " + nome 
				+ "\nTelefone: " + telefone 
				+ "\nEmail: " + email 
				+ "\nSexo: " + sexo 
				+ "\nVinculo: " + vinculo;
	}

}
