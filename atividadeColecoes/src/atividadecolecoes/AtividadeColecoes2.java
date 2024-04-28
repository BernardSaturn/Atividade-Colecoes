package atividadecolecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeColecoes2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();
        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int contador = 0; contador < 10; contador++) {
            int valor = leia.nextInt();
            conjunto.add(valor);
        }
        System.out.println("Listar dados do Set:");
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        leia.close();
    }
}