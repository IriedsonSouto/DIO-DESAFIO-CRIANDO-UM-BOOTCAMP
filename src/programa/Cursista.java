package programa;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import Enums.Sexo;
import Enums.Vinculo;

public class Cursista extends Pessoa{

	//Atributos e variaveis
    private Set<Atividade> conteudosInscritos = new LinkedHashSet<>();
    private Set<Atividade> conteudosConcluidos = new LinkedHashSet<>();
    
    //Metodo construtor 
    public Cursista(String nome, String email, Sexo sexo, Vinculo vinculo){
		super(nome, email, sexo, vinculo);
	}

    //Metodo responsavel por pegar pessoa e inscrever no bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getTrilha());
        bootcamp.getDevsInscritos().add(this);
    }

    //Metodo responsavel por fazer a progreção da pessoa
    public void progredir() {
        Optional<Atividade> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não tem cursos para progredir.");
        }
    }

    //Metodo de cacular Xp do aluno
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Atividade::calcularXp)
                .sum();
    }

    //Metodos get
    public Set<Atividade> getConteudosInscritos() {
        return conteudosInscritos;
    }
    
    public Set<Atividade> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    
    //Metodos set
    public void setConteudosInscritos(Set<Atividade> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Atividade> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
	
}
