import br.com.flavio.desafio.dominio.model.Curso;
import br.com.flavio.desafio.dominio.model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Java", "Curso Java", 10);
        Curso c2 = new Curso("Js", "Curso Js", 10);
        System.out.println(c1);

        Mentoria m1 = new Mentoria("Java", "Mentoria Java", LocalDate.now());

        System.out.println(m1);
    }
}