import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        Integer numWrapper = num;

        System.out.println("Valor do tipo primitivo: " + num);
        System.out.println("Valor do tipo wrapper: " + numWrapper);

        scanner.close();
        
    }
}
