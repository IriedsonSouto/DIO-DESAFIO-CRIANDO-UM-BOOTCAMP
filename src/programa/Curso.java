package programa;

import Enums.TipoAtividade;

public class Curso extends Atividade {
	
	//Atributos e variaveis
    private int cargaHoraria;
    
    //Construtores
    public Curso(String titulo, String descricao) {
		super(titulo, descricao, TipoAtividade.CURSO);
	}

    //Sobreescrita do metodo de cacular Xp da classe atividade
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //Metodos get
    public int getCargaHoraria() {
        return cargaHoraria;
    }    
       
    //Metodos set
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

	//Sobreescrita metodo toString    
    @Override
    public String toString() {
        return "Curso: " + getTitulo() 
        		+"\nDescricao: " + getDescricao() 
        		+"\nCargaHoraria: " + cargaHoraria
        		+"\nInstrutor: " +getInstrutor().getNome();
    }
}
