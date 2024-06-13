import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Fundamentos de Programação e primeiros passos com a linguagem Java", 60);
        Curso curso2 = new Curso("Avançando em Java", "Coleções e Stream API", 40);
        Mentoria mentoria = new Mentoria("Conhecendo o Java", "Bate-papo sobre Java para iniciantes", LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Curso completo para quem quer se tornar um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGaya = new Dev("Gaya");
        devGaya.inscreveEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gaya:" + devGaya.getConteudosInscritos());
        devGaya.finalizaConteudo();
        devGaya.finalizaConteudo();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devGaya.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devGaya.getConteudosConcluidos());
        System.out.println("XP:" + devGaya.calculaTotalXP());

        System.out.println("-------");

        Dev devJoao = new Dev("João");
        devJoao.setNome("Joao");
        devJoao.inscreveEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.finalizaConteudo();
        devJoao.finalizaConteudo();
        devJoao.finalizaConteudo();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calculaTotalXP());

    }

}