package curso;

public class Main3 {
    String nome;

    static String sobrenome;

    public static void main(String[] args) {
        System.out.println(sobrenome);

    }

    void declaraNome() {

        nome = "Angels";
    }

    String retornaNome() {
        return nome;
    }

}