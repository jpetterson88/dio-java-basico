package veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("7891011");
        // z400.ligar();

        // exemplo de polimorfismo
        Veiculo coringa = z400;
        coringa.ligar();
    }
}
