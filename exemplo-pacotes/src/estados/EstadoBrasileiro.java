package estados;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicacao
public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão");

    private String sigla;
    private String nome;

    public String getSigla() {
        return sigla;
    }
    
    public String getNome() {
        return nome;
    }

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
}
