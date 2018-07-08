package br.edu.ifg.siseducar.vo;

public class Aluno {

    private String nome;

    public Aluno() {
    }

    public Aluno(String nome) {
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
