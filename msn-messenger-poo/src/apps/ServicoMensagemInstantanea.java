package apps;
// a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
    // public void enviarMensagem() {
    //     // primeiro confirmar se esta conectado a internet
    //     validarConectadoInternet();
    //     System.out.println("Enviando mensagem");
    //     // depois de enviada, salva o historico da mensagem
    //     salvarHistoricoMensagem();
    // }
    // public void receberMensagem() {
    //     System.out.println("Recebendo mensagem");
    // }

    // // metodos privados, visiveis somente na classe
    // private void validarConectadoInternet() {
    //     System.out.println("Validando se está conectado a internet");
    // }
    // private void salvarHistoricoMensagem() {
    //     System.out.println("Salvando o histórico da mensagem");
    // }

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // mais um metodo que todos os filhos deverao implementar
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }

    // somente os filhos conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet...");
    }
}
