package Polimorfismo;

public abstract class MensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarInternet(){
        System.out.println("validando conexão");
    }

    protected void salvarHistorico(){
        System.out.println("salvando historico");
    }
}
