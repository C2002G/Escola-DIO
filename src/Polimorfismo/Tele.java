package Polimorfismo;

public class Tele extends MensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("Enviando mensagem TEle");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendp mensagem tele");
        salvarHistorico();
    }
}
