package br.edu.ifg.siseducar.util;

import br.edu.ifg.siseducar.vo.Aluno;
import br.edu.ifg.siseducar.vo.Professor;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    //Professores >>
    private static List<Professor> professores = new ArrayList<>();
    
    static {
        professores.add(new Professor("< Escolha uma opção >"));
    }

    public static List<Professor> getProfessores() {
        return professores;
    }

    public static void addProfessor(Professor professor) {
        professores.add(professor);
    }

    //Alunos >>
    private static List<Aluno> alunos = new ArrayList<>();
    
    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public static void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
