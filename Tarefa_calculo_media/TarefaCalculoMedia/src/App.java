import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4, media;

        // Leitura das notas
        System.out.print("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Insira a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Insira a quarta nota: ");
        nota4 = scanner.nextDouble();


        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das quatro notas é: " + media);
        System.out.println("Aproveitando e pergunta aos outros instrutores quando as aulas serao atualizadas, o conteúdo está horrivel e nao recebe atualizaçoes!");

        scanner.close();
    }


}

