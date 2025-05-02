package POO;
//herança
public class Telegram extends ServicoMensagem {

    @Override
    public void enviarMensagem() {
        System.out.println("enviando tele");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo tele");
    }
}