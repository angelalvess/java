package curso;

public class Main8 {

    public static void main(String[] args) {

        int idade = 17;
        int quantidadePessoas = 1;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 || acompanhado) {
            System.out.println("You can enter the party");
        } else {
            System.out.println("You are not an adult and alone");
        }
    }
}
