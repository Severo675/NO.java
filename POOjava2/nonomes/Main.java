package nonomes;

class no {
    String nome;

    no(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        no nome1 = new no("Débora Severo");
        no nome2 = new no("Josiane da Silva");
        no nome3 = new no("Paulo Luiz");

        System.out.println(nome1.nome);
        System.out.println(nome2.nome);
        System.out.println(nome3.nome);
    }
}
