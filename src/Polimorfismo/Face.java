package Polimorfismo;

public class Face extends MensagemInstantanea {


    public void enviarMensagem() {
        validarInternet();
        System.out.println("Enviando mensagem Face");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendp mensagem Face");
        salvarHistorico();
    }
}
