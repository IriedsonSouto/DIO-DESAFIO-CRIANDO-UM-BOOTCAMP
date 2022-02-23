import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import programa.*;
import Enums.*;


//Classe main simulando o programa
public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    // Instanceando 8 pessoas, sendo duas Instrutor e seis Cursista
    Instrutor pessoa1 = new Instrutor("Carlos", "pessoa1@email.com", Sexo.MASCULINO, Vinculo.INSTRUTOR);
    Instrutor pessoa2 = new Instrutor("Maria", "pessoa2@email.com", Sexo.FEMININO, Vinculo.INSTRUTOR);
    
    
    Cursista pessoa3 = new Cursista("Jose", "pessoa3@email.com", Sexo.MASCULINO, Vinculo.CURSISTA);
    Cursista pessoa4 = new Cursista("Camila", "pessoa4@email.com", Sexo.FEMININO, Vinculo.CURSISTA);
    Cursista pessoa5 = new Cursista("Luiz", "pessoa5@email.com", Sexo.MASCULINO, Vinculo.CURSISTA);
    Cursista pessoa6 = new Cursista("Joao", "pessoa6@email.com", Sexo.MASCULINO, Vinculo.CURSISTA);
    Cursista pessoa7 = new Cursista("Larissa", "pessoa7@email.com", Sexo.FEMININO, Vinculo.CURSISTA);
    Cursista pessoa8 = new Cursista("Vanusa", "pessoa8@email.com", Sexo.FEMININO, Vinculo.CURSISTA);

    
    //Exibição de um cursista e um instrutor
    System.out.println(pessoa1);
    System.out.println(pessoa8);
    System.out.println();
    
    //Criei duas atividades, um curso e uma mentoria
    Atividade curso = new Curso("Curso1", "Ensina conteudo");
    Atividade mentoria = new Mentoria("Mentoria1", "Auxilia em atividades");
    curso.setInstrutor(pessoa1); //Adicionei instrutor na atividade
    mentoria.setInstrutor(pessoa2);//Adicionei instrutor na atividade
    
    //Exibição curso que um instrutor expecifico é responsavel
    System.out.println(pessoa1.getAtividadeResponsavel());
    System.out.println();
    
    //Exibição das atividades
    System.out.println(curso);   
    System.out.println(mentoria);
    System.out.println();
    
    //Set responsavel pela trilha de cursos para o bootcamp
    Set<Atividade> trilha = new LinkedHashSet<>();
    trilha.add(curso);
    trilha.add(mentoria);
    
    //Criei um novo bootcamp
    Bootcamp bootcamp = null;
    try {
		bootcamp = new Bootcamp("Bootcampeão", "Qualifica cursista", "22/02/2022");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
    //Adicionei a trilha ao bootcamp
    bootcamp.setTrilha(trilha); 
    
    //Inscrevi cursistas ao bootcamp
    pessoa3.inscreverBootcamp(bootcamp);
    pessoa4.inscreverBootcamp(bootcamp);
    pessoa5.inscreverBootcamp(bootcamp);
    pessoa6.inscreverBootcamp(bootcamp);
    pessoa7.inscreverBootcamp(bootcamp);
    pessoa8.inscreverBootcamp(bootcamp);
    
    //Exibção do bootcamp e dos Cursistas inscritos
    System.out.println(bootcamp);
    System.out.println(bootcamp.getDevsInscritos());
    System.out.println();
    
    //Exibição de um cursista especifico do bootcamp e sua situação de cursos concliudos
    System.out.println(pessoa3.getConteudosInscritos());
    System.out.println(pessoa3.getConteudosConcluidos());
    System.out.println();
    
    //Fiz cursista progredir na trilha
    pessoa3.progredir();
    pessoa3.progredir();
    System.out.println();
    
    //Nova exibição de um cursista especifico do bootcamp e sua situação de cursos concliudos
    System.out.println(pessoa3.getConteudosInscritos());
    System.out.println(pessoa3.getConteudosConcluidos());
    System.out.println();
    
    //Exibição do xp final do cursista
    System.out.println("XP:" + pessoa3.calcularTotalXp());
     
  }
}
