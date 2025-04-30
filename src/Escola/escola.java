package Escola;

public class escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 8;

        System.out.println("o " + felipe.nome + " tem " + felipe.idade + " anos");
    }
}
