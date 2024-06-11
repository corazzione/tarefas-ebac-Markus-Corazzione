import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciarPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        lerOrdenarESepare(scanner);
        
        scanner.close();
    }

    public static void lerOrdenarESepare(Scanner scanner) {
        List<String> nomes = new ArrayList<>();
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        

        System.out.println("Digite os nomes de 5 pessoas");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Sexo (DIGITE M PARA MASCULINO E F PARA FEMININO) " + (i + 1) + ": ");
            String sexo = scanner.nextLine().trim().toUpperCase();
            
            nomes.add(nome);
            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("INVÁLIDO, DIGITE APENAS M OU F.");
                nomes.remove(nome);
                i--;
            }
        }
        

        Collections.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}
