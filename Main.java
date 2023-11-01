import java.util.Scanner;
import java.util.TreeSet;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> nomes = new TreeSet<>();

        System.out.println("Digite os nomes (digite 'sair' para finalizar):");
        while (true) {
            String nome = scanner.nextLine();
            if ("sair".equalsIgnoreCase(nome)) {
                break;
            }
            nomes.add(nome);
        }

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}