public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String tipoCombustível;
    private int ano;
    private int qtdePortas;
    private double potenciaMotorEmCavalos;
    private boolean isEmMovimento = false;

    public void porEmMovimento() {
        if (isEmMovimento == true) {
            System.out.println("O carro já está em movimento!");
        } else if (isEmMovimento == false) {
            System.out.println("O carro começou a se movimentar!");
            isEmMovimento = true;
        }
    }

    public void imobilzar() {
        if (isEmMovimento == true) {
            System.out.println("O carro foi imobilizado!");
            isEmMovimento = false;
        } else if (isEmMovimento == false) {
            System.out.println("O carro já está imobilizado!");
        }
    }

    public void ligarIgnição() {
        System.out.println("Ignição ligada!");
    }
}