package POO;
//encapsulamento
public class Facebook extends ServicoMensagem {

    @Override
    public void enviarMensagem() {
        System.out.println("enviando face");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo face");
    }
}
