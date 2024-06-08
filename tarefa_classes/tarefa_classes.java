/**
 * Classe carro celtinha
 * @author <a href="mailto:corazzione@gmail.com">Corazzione</a>
 * Tabnine eh mior que eu
 */
public class tarefa_classes {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private double velocidade;
    private double combustivel;

    public tarefa_classes(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O carro ligou");
    }

    public void desligar() {
        ligado = false;
        velocidade = 0;
        System.out.println("O carro foi desligado.");
    }

    public void acelerar(double velocidade) {
        if (ligado) {
            this.velocidade += velocidade;
            System.out.println("Velocidade atual de " + this.velocidade + " km");
        } else {
            System.out.println("O carro precisa ligar pra acelerar");
        }
    }

    public void frear(double velocidade) {
        if (this.velocidade >= velocidade) {
            this.velocidade -= velocidade;
            System.out.println("Velocidade atual de " + this.velocidade + " km");
        } else {
            System.out.println("O carro está parado.");
        }
    }

    public void dirigir(double distancia) {
        System.out.println("Você dirigiu um total de " + distancia + " km.");
    }

    public static void main(String[] args) {
        tarefa_classes carro = new tarefa_classes("chevrolet", "Corsinha", 2009);
        carro.ligar();
        carro.acelerar(50);
        carro.dirigir(100);
        carro.frear(30);
        carro.desligar();
    }
}
