import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso = new Curso();
        curso.setTitulo("POO");
        curso.setDescricao("Nessa Formação você será preparado para o que o mercado de trablho espera de você");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desafio de Projetos Java POO");
        curso2.setDescricao("Nessa Formação você será preparado para o que o mercado de trablho espera de você");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Pilares POO");
        mentoria.setDescricao("Vamos embarcar nesse fantástico mundo e desmistificar um pouco desse incrível paradigma");
        mentoria.setData(LocalDate.of(2023, 8 , 8));

        // System.out.println(curso);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricap("Venha decolar na carreira JAVA");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);

        Dev dev = new Dev();
        dev.setNome("Aluno Teste");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev.getNome() + " são: " + dev.getConteudosInscritos());
        System.out.println("Estou Iniciado meus Estudos!");
        dev.progredir();
        System.out.println("Assiti o conteudo: " + dev.getConteudosConcluidos());
        
        
        Dev dev2 = new Dev();
        dev2.setNome("Aluno 2 Teste");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + " são: " + dev2.getConteudosInscritos());



    }
}
