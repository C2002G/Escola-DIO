package POO;
//encapsulamento
public class MSN extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        System.out.println("enviando msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebe msn");
    }
}
