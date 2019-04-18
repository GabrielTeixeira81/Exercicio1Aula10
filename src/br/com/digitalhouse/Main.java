package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Pessoa Gabriel = new Pessoa("Gabriel", 298787281);
        Pessoa Ariane = new Pessoa("Ariane", 298787281);

    System.out.println("As pessoas são iguais?\n" + Gabriel.equals(Ariane));

    }
}
