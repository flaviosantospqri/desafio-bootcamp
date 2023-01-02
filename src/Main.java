import br.com.flavio.desafio.dominio.model.BootCamp;
import br.com.flavio.desafio.dominio.model.Curso;
import br.com.flavio.desafio.dominio.model.Dev;
import br.com.flavio.desafio.dominio.model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Java", "Curso Java", 10);
        Curso c2 = new Curso("Js", "Curso Js", 10);
        System.out.println(c1);

        Mentoria m1 = new Mentoria("Java", "Mentoria Java", LocalDate.now());

        System.out.println(m1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java");
        bootCamp.setDescricao("Descricação");
        bootCamp.getConteudos().add(c1);
        bootCamp.getConteudos().add(c2);

        Dev dev1 = new Dev();
        dev1.setNome("Flávio");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo inscrito" + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdo inscrito" + dev1.getConteudosInscritos());
        System.out.println("Conteúdo concluidos" + dev1.getConteudosConcluidos());
        System.out.println("xp" + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo inscrito" + dev2.getConteudosInscritos());

        dev2.progredir();
        System.out.println("Conteúdo inscrito" + dev2.getConteudosInscritos());
        System.out.println("Conteúdo concluidos" + dev2.getConteudosConcluidos());
        System.out.println("xp" + dev2.calcularTotalXp());


    }
}