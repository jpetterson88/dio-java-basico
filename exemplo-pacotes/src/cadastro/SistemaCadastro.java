package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sitema
        Pessoa marcos = new Pessoa("Marcos", "123.456.789-00");
        Pessoa pessoa = new Pessoa("John");

        // definimos o endereco de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        // e como definir o nome e cpf de marcos?

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
        System.out.println("Nome da segunda pessoa: " + pessoa.getNome());
    }
}
