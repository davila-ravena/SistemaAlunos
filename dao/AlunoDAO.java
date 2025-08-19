package dao;

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos;

    public AlunoDAO() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(a -> a.getMatricula().equals(matricula));
        System.out.println("Aluno removido (se encontrado).");
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println(a);
            }
        }
    }
}
