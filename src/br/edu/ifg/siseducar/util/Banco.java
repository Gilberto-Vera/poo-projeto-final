package br.edu.ifg.siseducar.util;

import static br.edu.ifg.poo.Main.conexao;
import br.edu.ifg.siseducar.vo.Aluno;
import br.edu.ifg.siseducar.vo.Professor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco {
    
    
        public static boolean verificaLogin(String user, String senha){
        try {
            String SQL = "SELECT * from usuario WHERE login = '" + user +"' AND senha = '" + senha + "';";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if(rs.next()){
                //id_logado = rs.getInt("id");
                //user_logado = rs.getString("login");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

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

    private static List<Aluno> alunos = new ArrayList<>();
    
    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public static void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
