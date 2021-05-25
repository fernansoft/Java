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
        if (getIsEmMovimento()) {
            System.out.println("O carro já está em movimento!");
        } else if (!getIsEmMovimento()) {
            System.out.println("O carro começou a se movimentar!");
            setIsEmMovimento(true);
        }
    }

    public void imobilzar() {
        if (getIsEmMovimento()) {
            System.out.println("O carro foi imobilizado!");
            setIsEmMovimento(false);
        } else if (!getIsEmMovimento()) {
            System.out.println("O carro já está imobilizado!");
        }
    }

    public void ligarIgnição() {
        System.out.println("Ignição ligada!");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCombustível() {
        return this.tipoCombustível;
    }

    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdePortas() {
        return this.qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public double getPotenciaMotorEmCavalos() {
        return this.potenciaMotorEmCavalos;
    }

    public void setPotenciaMotorEmCavalos(double potenciaMotorEmCavalos) {
        this.potenciaMotorEmCavalos = potenciaMotorEmCavalos;
    }

    public boolean getIsEmMovimento() {
        return this.isEmMovimento;
    }

    public void setIsEmMovimento(boolean isEmMovimento) {
        this.isEmMovimento = isEmMovimento;
    }
}