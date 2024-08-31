package cadastro;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
