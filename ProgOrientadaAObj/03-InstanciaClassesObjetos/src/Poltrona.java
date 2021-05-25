public class Poltrona {
    private String marca;
    private String modelo;
    private String cor;
    private double alturaDoAssento;
    private double largura;
    private boolean isOcupada = false;

    public void sentar() {
        if (getIsOcupada()) {
            System.out.println("A poltrona já está ocupada!");
        } else if (!getIsOcupada()) {
            System.out.println("A poltrona foi ocupada!");
            setIsOcupada(true);
        }
    }

    public void levantar() {
        if (getIsOcupada()) {
            System.out.println("A poltrona foi desocupada!");
            setIsOcupada(false);
        } else if (!getIsOcupada()) {
            System.out.println("A poltrona já está desocupada!");
        }
    }

    public void ajustarInclinacaoDoEncosto() {
        System.out.println("Inclinação ajustada!");
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

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAlturaDoAssento() {
        return this.alturaDoAssento;
    }

    public void setAlturaDoAssento(double altura) {
        this.alturaDoAssento = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public boolean getIsOcupada() {
        return this.isOcupada;
    }

    public void setIsOcupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }
}