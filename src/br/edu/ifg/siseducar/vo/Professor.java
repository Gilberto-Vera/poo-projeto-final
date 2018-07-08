package br.edu.ifg.siseducar.vo;

public class Professor {

    private String nome;

    public Professor() {
    }

    public Professor(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
