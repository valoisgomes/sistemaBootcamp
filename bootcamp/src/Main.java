import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso = new Curso();
        curso.setTitulo("Formação JAVA");
        curso.setDescricao("Nessa Formação você será preparado para o que o mercado de trablho espera de você");
        curso.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Pilares POO");
        mentoria.setDescricao("Vamos embarcar nesse fantástico mundo e desmistificar um pouco desse incrível paradigma");
        mentoria.setData(LocalDate.of(2023, 8 , 8));

        System.out.println(curso);
        System.out.println(mentoria);

    }
}
