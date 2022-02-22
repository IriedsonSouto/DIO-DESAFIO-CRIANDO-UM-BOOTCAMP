package programa;

import java.time.LocalDate;

import Enums.TipoAtividade;

public class Mentoria extends Atividade {
    
	//Atributos e variaveis
	private LocalDate data;

	//Construtores
    public Mentoria(String titulo, String descricao) {
		super(titulo, descricao, TipoAtividade.MENTORIA);
	}

    //Sobreescrita do metodo de cacular Xp da classe atividade
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    //Metodos get
    public LocalDate getData() {
        return data;
    }
    
    //Metodos set
    public void setData(LocalDate data) {
        this.data = data;
    }
    

    //Sobreescrita metodo toString 
    @Override
    public String toString() {
        return "Mentoria: " + getTitulo()
        		+"\nDescricao: " + getDescricao()
        		+"\nData: " + data
        		+"\nInstrutor: " +getInstrutor().getNome();
    }
}
