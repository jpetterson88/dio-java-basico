public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();

        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        // smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(11);

        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}