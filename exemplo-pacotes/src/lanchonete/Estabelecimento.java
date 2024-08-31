package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
// import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // acoes que nao precisam estar disponiveis para toda a aplicacao
        // cozinheiro.lavarIngredientes();
        // cozinheiro.baterVitaminaLiquidificador();
        // cozinheiro.selecionarIngredientesVitamina();
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararVitamina();
        // cozinheiro.prepararVitamina();

        // acoes que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Almoxarife almoxarife = new Almoxarife();
        // acoes que nao precisam estar disponiveis
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();
        // acoes que somente o seu pacote cozinha precisa conhecer (default)
        // almoxarife.entregarIngredientes();
        // almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // acao que somente o seu pacote cozinha precisa conhecer (default)
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // nao deveria, mas o estabelecimento
        // ainda nao definiu normas de atendimento
        // cliente.pegarPedidoBalcao();

        // esta acao eh muito sigilosa, que tal ser privada?
        // cliente.consultarSaldoAplicativo();

        // ja pensou os clientes ouvindo que o gas acabou?
        // cozinheiro.pedirParaTrocarGas(atendente);
        // cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
