package Polimorfismo;

public class MSNmensager extends MensagemInstantanea {

    public void enviarMensagem() {
        validarInternet();
        System.out.println("Enviando mensagem MSN");
    }


    public void receberMensagem() {
        System.out.println("recebendp mensagem MSN");
        salvarHistorico();
    }
}
