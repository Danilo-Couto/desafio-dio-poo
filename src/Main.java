import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Conteudo curso2 = new Curso(); //polimorfismo

        curso.setTitulo("curso de Java");
        curso.setDescricao("Bootcamp Curso DIO");
        curso.setCargaHoraria(1500);

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Bootcamp mentoria DIO");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(curso2);

    }

}