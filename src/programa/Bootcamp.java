package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {
	
	//Atributos e variaveis
	private String nome;
    private String descricao;
	private LocalDate dataInicial = null;
    private LocalDate dataFinal;
    private Set<Pessoa> devsInscritos = new HashSet<>();
    private Set<Atividade> trilha = new LinkedHashSet<>();

    //Construtores
    public Bootcamp(String nome, String descricao, String data) throws Exception {	
    	this.nome = nome;
    	this.descricao = descricao;
    	setDataInicial(data);
		dataFinal = dataInicial.plusDays(45);    	
    }
    
    //Metodos get
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    
    public Set<Pessoa> getDevsInscritos() {
        return devsInscritos;
    }
    
    public Set<Atividade> getTrilha() {
        return trilha;
    }
    
    //Metodos set
    public void setDataInicial(String data) throws Exception {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Esse metodo converte string em data e seta a variavel data inicio e data fim
 		try{
 			LocalDate date2 = LocalDate.parse(data,formatter); 
 			this.dataInicial = date2;
 			dataFinal = dataInicial.plusDays(45);
 		}catch (Exception erro){
			throw new Exception("A data é invalida.");
		}
 	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDevsInscritos(Set<Pessoa> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public void setTrilha(Set<Atividade> trilha) {
        this.trilha = trilha;
    }

    
    //Sobreescrita metodo equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) 
        		&& Objects.equals(dataInicial, bootcamp.dataInicial) 
        		&& Objects.equals(dataFinal, bootcamp.dataFinal)
        		&& Objects.equals(trilha, bootcamp.trilha);
    }

    //Sobreescrita metodo hashCode
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, trilha);
    }

    //Sobreescrita metodo toString
	@Override
	public String toString() {
		return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal="
				+ dataFinal + ", trilha=" + trilha + "]";
	}
    
    
}