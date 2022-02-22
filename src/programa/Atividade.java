package programa;

import Enums.TipoAtividade;

//Classe abstrata referente aos tipos de atividade "Curso" e "Mentoria"
public abstract class Atividade {
	
	//Atributos e variaveis
	protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
	private TipoAtividade tipo;
	private Pessoa instrutor;

	//Construtores
    public Atividade() {}
	
    public Atividade(String titulo, String descricao, TipoAtividade tipo) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	
    //Metodo abstrato que calculara o Xp da atividade
    public abstract double calcularXp();
    
    //Metodos get
    public String getTitulo() {
        return titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
	public Pessoa getInstrutor() {
		return instrutor;
	}
	
	public TipoAtividade getTipo() {
		return tipo;
	}
	
	
    //Metodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }  

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public void setInstrutor(Pessoa instrutor) {
		if(this.instrutor != null){
			this.instrutor.getVinculo().descadastrarAtividade(this);
		}
		this.instrutor = instrutor;
		instrutor.getVinculo().cadastrarAtividade(this);
	}   
}
