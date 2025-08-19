package model;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private boolean bolsa;
    private boolean cursoFinalizado;
    private boolean tccConcluido;

    public Aluno(String nome, String matricula, String curso, boolean bolsa) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.bolsa = bolsa;
        this.cursoFinalizado = false;
        this.tccConcluido = false;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    public boolean isCursoFinalizado() {
        return cursoFinalizado;
    }

    public void setCursoFinalizado(boolean cursoFinalizado) {
        this.cursoFinalizado = cursoFinalizado;
    }

    public boolean isTccConcluido() {
        return tccConcluido;
    }

    public void setTccConcluido(boolean tccConcluido) {
        this.tccConcluido = tccConcluido;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", bolsa=" + bolsa +
                ", cursoFinalizado=" + cursoFinalizado +
                ", tccConcluido=" + tccConcluido +
                '}';
    }
}
