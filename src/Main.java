import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("curso de Java");
        curso.setDescricao("Bootcamp Curso DIO");
        curso.setCargaHoraria(1500);

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Bootcamp mentoria DIO");
        mentoria.setData(LocalDate.now());

        Bootcamp dio = new Bootcamp();
        dio.setNome("Bootcamp Dio");
        dio.setDescrica("Bootcamp de Java");
        dio.getConteudos().add(curso);
        dio.getConteudos().add(mentoria);

        Dev devDanilo = new Dev();
        Dev devMurilo = new Dev();

        devDanilo.setNome("Danilo");
        devDanilo.setNome("Murilo");

        devDanilo.inscreverBootcamp(dio);
        devMurilo.inscreverBootcamp(dio);

        devDanilo.progredir();
//        devMurilo.progredir();

        devDanilo.calcularTotalXp();
        devMurilo.calcularTotalXp();

        System.out.println(devDanilo.getConteudosConcluidos());
        System.out.println(devMurilo.getConteudosConcluidos());
        System.out.println(devDanilo.getConteudosInscritos());
        System.out.println(devMurilo.getConteudosInscritos());
        System.out.println(devDanilo.calcularTotalXp());
        System.out.println(devMurilo.calcularTotalXp());
    }

}