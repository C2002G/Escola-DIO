package POO;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSN msn = new MSN();

        //msn.validandoConexao(); encapsulado
        msn.enviarMensagem();
        //msn.salvarHistorico();
        msn.receberMensagem();
        System.out.println("FACEBOOK");
        Facebook face = new Facebook();
        face.enviarMensagem();
        face.receberMensagem();
        System.out.println("TELEGRAM");
        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();
    }
}
