package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
    void entregarIngredientes() { // pode tirar o public que ele ficara no modo default, ou seja, visivel para as classes do mesmo pacote
        System.out.println("ENTREGANDO INGREDIENTES");
        //...?
        controlarSaida();
    }
    void trocarGas() { // modo default
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}