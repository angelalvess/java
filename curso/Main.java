package curso;

public class Main {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        numbers[0] = 10;

        System.out.println(numbers[0]);

        int[] numbers2 = new int[5];
        System.out.println(numbers2[0]);

        int idade = 17;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}