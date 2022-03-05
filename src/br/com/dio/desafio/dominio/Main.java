package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição mentoria jva");
        mentoria.setTitulo("Mentoria java");

        /* Conteudo conteudo = new Curso(); //POLIMORFISMO

        List<String> palavras = new ArrayList<>();
         */

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Carlos" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Carlos" + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Carlos" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: "  + devCarlos.calcularTotalXp());

        System.out.println("----------");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Daniel" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP: "  + devDaniel.calcularTotalXp());
    }
}
