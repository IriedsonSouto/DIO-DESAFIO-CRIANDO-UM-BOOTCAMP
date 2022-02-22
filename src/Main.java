import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import programa.*;
import Enums.*;


//Classe main simulando o programa
public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    // Instanceando 8 pessoas, duas atribui a Instrutor e seis para Cursista
    Pessoa pessoa1 = new Pessoa("Carlos", "pessoa1@email.com", Sexo.MASCULINO);
    Pessoa pessoa2 = new Pessoa("Maria", "pessoa2@email.com", Sexo.FEMININO);
    pessoa1.setVinculo(new Instrutor());
    pessoa2.setVinculo(new Instrutor());
    
    Pessoa pessoa3 = new Pessoa("Jose", "pessoa3@email.com", Sexo.MASCULINO);
    Pessoa pessoa4 = new Pessoa("Camila", "pessoa4@email.com", Sexo.FEMININO);
    Pessoa pessoa5 = new Pessoa("Luiz", "pessoa5@email.com", Sexo.MASCULINO);
    Pessoa pessoa6 = new Pessoa("Joao", "pessoa6@email.com", Sexo.MASCULINO);
    Pessoa pessoa7 = new Pessoa("Larissa", "pessoa7@email.com", Sexo.FEMININO);
    Pessoa pessoa8 = new Pessoa("Vanusa", "pessoa8@email.com", Sexo.FEMININO);
    pessoa3.setVinculo(new Cursista());
    pessoa4.setVinculo(new Cursista());
    pessoa5.setVinculo(new Cursista());
    pessoa6.setVinculo(new Cursista());
    pessoa7.setVinculo(new Cursista());
    pessoa8.setVinculo(new Cursista());
    
    //Exibição de um cursista e um instrutor
    System.out.println(pessoa1);
    System.out.println(pessoa8);
    System.out.println();
    
    //Criei duas atividades, um curso e uma mentoria
    Atividade curso = new Curso("Curso1", "Ensina conteudo");
    Atividade mentoria = new Mentoria("Mentoria1", "Auxilia em atividades");
    curso.setInstrutor(pessoa1); //Adicionei instrutor na atividade
    mentoria.setInstrutor(pessoa2);//Adicionei instrutor na atividade
    System.out.println();
    
    //Exibição curso que um instrutor expecifico é responsavel
    System.out.println(pessoa1.getVinculo().getAtividadeResponsavel());
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
    pessoa3.getVinculo().inscreverBootcamp(bootcamp, pessoa3);
    pessoa4.getVinculo().inscreverBootcamp(bootcamp, pessoa4);
    pessoa5.getVinculo().inscreverBootcamp(bootcamp, pessoa5);
    pessoa6.getVinculo().inscreverBootcamp(bootcamp, pessoa6);
    pessoa7.getVinculo().inscreverBootcamp(bootcamp, pessoa7);
    pessoa8.getVinculo().inscreverBootcamp(bootcamp, pessoa8);
    
    //Exibção do bootcamp e dos Cursistas inscritos
    System.out.println(bootcamp);
    System.out.println(bootcamp.getDevsInscritos());
    System.out.println();
    
    //Exibição de um cursista especifico do bootcamp e sua situação de cursos concliudos
    System.out.println(pessoa3.getVinculo().getConteudosInscritos());
    System.out.println(pessoa3.getVinculo().getConteudosConcluidos());
    System.out.println();
    
    //Fiz cursista progredir na trilha
    pessoa3.getVinculo().progredir();
    pessoa3.getVinculo().progredir();
    System.out.println();
    
    //Nova exibição de um cursista especifico do bootcamp e sua situação de cursos concliudos
    System.out.println(pessoa3.getVinculo().getConteudosInscritos());
    System.out.println(pessoa3.getVinculo().getConteudosConcluidos());
    System.out.println();
    
    //Exibição do xp final do cursista
    System.out.println("XP:" + pessoa3.getVinculo().calcularTotalXp());
     
  }
}
