package br.com.digitalhouse;

public class Pessoa {

    private String nome;
    private Integer rg;


    public Pessoa() {

    }

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object individuo) {
        if (!(individuo instanceof Pessoa)) {
            return false;
        }

        if (((Pessoa) individuo).getRg() == this.getRg() && ((Pessoa) individuo).getNome().equals(this.getNome())){
        return true;
        }
        else { return false;
    }
}
}
