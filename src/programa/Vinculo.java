package programa;

import java.util.Set;

//Interface responsavel pro criar o vinculo que pessoa tem com a instituição
public interface Vinculo {

	
	//Metodos Cursista
    public default void inscreverBootcamp(Bootcamp bootcamp, Pessoa pessoa){}
    
    public default void progredir() {}
    
    public default double calcularTotalXp() {
		return 0;}
    
    public default Set<Atividade> getConteudosInscritos() {
		return null;}

    public default void setConteudosInscritos(Set<Atividade> conteudosInscritos) {}
    
    public default Set<Atividade> getConteudosConcluidos() {
		return null;}

    public default void setConteudosConcluidos(Set<Atividade> conteudosConcluidos) {}
    
    
    //Metodos Instrutor    
    public default void cadastrarAtividade(Atividade atividade) {}
    
    public default void descadastrarAtividade(Atividade atividade) {}
    
    public default Set<Atividade> getAtividadeResponsavel() {
		return null;}

	public default void setAtividadeResponsavel(Set<Atividade> atividadeResponsavel) {}
	
}
