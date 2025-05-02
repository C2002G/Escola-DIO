package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            //System.out.println(e.getSigla() + " - " + e.getNome());
        }
                  //       declara enums
        EstadoBrasileiro escolhe = EstadoBrasileiro.RIO_GRANDE_DO_SUL;

        System.out.println(escolhe.getSigla());
        System.out.println(escolhe.getNome());
        System.out.println(escolhe.getNomeMaiusculo());
        System.out.println(escolhe.getIbge());
    }
}
