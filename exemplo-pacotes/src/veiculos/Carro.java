package veiculos;

public class Carro extends Veiculo {
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO!");
    }
    
    // exemplo de encapsulamento: mostrar apenas os metodos ou atributos relevantes
    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
    private void confereCambio() {
        System.out.println("Conferindo câmbio");
    }
}