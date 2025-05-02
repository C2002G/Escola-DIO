package Polimorfismo;

public class ComputadorPC {
    public static void main(String[] args) {
        MensagemInstantanea smi =null;


        String appEscolhido ="face";
        if (appEscolhido.equals("msn"))
            smi = new MSNmensager();
        else if (appEscolhido.equals("face"))
            smi = new Face();
        else if (appEscolhido.equals("tlg"))
            smi = new Tele();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
