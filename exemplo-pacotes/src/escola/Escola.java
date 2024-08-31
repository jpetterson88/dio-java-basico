package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("John");
        aluno.setIdade(36);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos de idade.");
    }
}
