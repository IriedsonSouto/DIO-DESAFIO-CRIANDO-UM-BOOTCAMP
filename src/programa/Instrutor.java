package programa;

import java.util.HashSet;
import java.util.Set;

import Enums.Sexo;
import Enums.Vinculo;

public class Instrutor extends Pessoa{

	//Atributos e variaveis	
	private Set<Atividade> atividadeResponsavel = new HashSet<>();
	
	
	//Metodo construtor 
	public Instrutor(String nome, String email, Sexo sexo, Vinculo vinculo){
		super(nome, email, sexo, vinculo);
	}
	
	//Metodo responsavel por cadastrar atividade que o instrutor leciona
    public void cadastrarAtividade(Atividade atividade) {
    	atividadeResponsavel.add(atividade);
    }
    
  	//Metodo responsavel por descadastrar atividade que o instrutor leciona
    public void descadastrarAtividade(Atividade atividade) {
    	atividadeResponsavel.remove(atividade);
    }
    
    //Metodos get
	public Set<Atividade> getAtividadeResponsavel() {
		return atividadeResponsavel;
	}

	//Metodos set
	public void setAtividadeResponsavel(Set<Atividade> atividadeResponsavel) {
		this.atividadeResponsavel = atividadeResponsavel;
	}
    
    
}
