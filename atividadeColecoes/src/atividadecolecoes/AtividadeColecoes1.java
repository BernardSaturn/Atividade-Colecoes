package atividadecolecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeColecoes1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> digitandoCor = new ArrayList<String>();
		for (int numeroDeCores = 0; numeroDeCores < 5; numeroDeCores++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.nextLine();
			digitandoCor.add(cor);
		}
		System.out.println("\nCores digitadas: \n");
		for (String cor : digitandoCor) {
			System.out.println(cor);
		}
		digitandoCor.sort(null);
		System.out.println("\nCores em ordem alfabetica:");
		for (String cor : digitandoCor) {
			System.out.println(cor);
		}
	}
}