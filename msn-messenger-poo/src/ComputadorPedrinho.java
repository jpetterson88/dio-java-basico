public class ComputadorPedrinho {
    public static void main(String[] args) {
        // // abrindo o MSN Messenger
        // System.out.println("\nMSN:");
        // MSNMessenger msn = new MSNMessenger();
        // msn.enviarMensagem();
        // msn.receberMensagem();
        
        // System.out.println("\nFacebook:");
        // // abrindo o Facebook Messenger
        // FacebookMessenger fcb = new FacebookMessenger();
        // fcb.enviarMensagem();
        // fcb.receberMensagem();
        
        // System.out.println("\nTelegram:");
        // // abrindo o  Telegram
        // Telegram tlg = new Telegram();
        // tlg.enviarMensagem();
        // tlg.receberMensagem();

        // System.out.println("\n");

        ServicoMensagemInstantanea smi = null;
        /*
         * NAO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        System.out.println("\n");
        
        smi.enviarMensagem();
        smi.receberMensagem();
        
        System.out.println("\n");
    }
}
