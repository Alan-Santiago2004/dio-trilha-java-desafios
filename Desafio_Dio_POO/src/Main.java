
import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("Curso de Java");
        c1.setCargaHoraria(4);

        Curso c2 = new Curso();
        c2.setTitulo("Js");
        c2.setDescricao("Curso de Js");
        c2.setCargaHoraria(8);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("descrição mentoria Java");
        m1.setData(LocalDate.now());

        Bootcamp boot = new Bootcamp();
        boot.setNome("BootCamp Java Developer");
        boot.setDescricao("Descrição do bootcamp Java Developer");
        boot.getConteudos().addAll(Arrays.asList(c1,c2,m1));

        Dev dev1 = new Dev();
        dev1.setNome("Alan Santiago");
        dev1.inscreverBootcamp(boot);
        System.out.println("Conteudos Inscritos Alan: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alan: " + dev1.getConteudosConcluidos());
        dev1.progredirBootcamp();
        dev1.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Alan: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alan: " + dev1.getConteudosConcluidos());
        System.out.println("XP" + dev1.calcularXP());

        System.out.println("------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Amanda Demetrio");
        dev2.inscreverBootcamp(boot);
        System.out.println("Conteudos Inscritos Amanda: " + dev2.getConteudosInscritos());
        dev2.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Amanda: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Amanda: " + dev2.getConteudosConcluidos());
        System.out.println("XP" + dev2.calcularXP());

        System.out.println("-----------------------");
        Dev dev3 = new Dev();
        dev3.setNome("Anna Alyce");
        System.out.println("Conteudos Inscritos Alyce: " + dev3.getConteudosInscritos());

        Dev dev4 = new Dev();
        dev4.setNome("Max Rockatansky");
        System.out.println("Conteudos Inscritos Max: " + dev4.getConteudosInscritos());

    }
}
