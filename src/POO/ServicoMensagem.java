package POO;
//herança
//public class ServicoMensagem {
//    public void enviarMensagem(){
//        validaConexao();
//        System.out.println("enviado mensagem");
//        salvarHistorico();
//    }
//    public void receberMensagem(){
//        System.out.println("recebendo mensagem");
//    }
//
//    private void validaConexao(){
//        System.out.println("validando a conexao");
//    }
//    private void salvarHistorico(){
//        System.out.println("salvando historico");
//    }
//}
//herança
public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}