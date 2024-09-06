package estados;

public class SistemaIbge {
    public static void main(String[] args) {
        EstadoBrasileiro estado = EstadoBrasileiro.RIO_DE_JANEIRO;
        EstadoBrasileiro estado2 = EstadoBrasileiro.SAO_PAULO;
        
        System.out.println(estado.getNome() + " - " + estado.getSigla());
        System.out.println(estado2.getNome() + " - " + estado2.getSigla());

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
