package curso;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(17);
        idades.add(18);
        idades.add(19);
        idades.add(20);

        System.out.println(idades.get(0));
    }
}
