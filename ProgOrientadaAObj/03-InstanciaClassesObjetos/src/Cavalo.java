public class Cavalo {
    private int idade;
    private String raça;
    private double altura;
    private double peso;
    private double comprimento;
    private boolean temFerradura = false;
    private boolean isCorrendo = false;

    public void correr() {
        if (getIsCorrendo()) {
            System.out.println("O cavalo já está correndo!");
        } else if (!getIsCorrendo()) {
            System.out.println("O cavalo começou a correr!");
            setIsCorrendo(true);
        }
    }

    public void colocarFerradura() {
        if (getTemFerradura()) {
            System.out.println("O cavalo já tem ferradura!");
        } else if (!getTemFerradura()) {
            System.out.println("Ferradura colocada!");
            setTemFerradura(true);
        }
    }

    public void comerCapim() {
        System.out.println("O cavalo começou a comer o capim!");
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return this.raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isTemFerradura() {
        return this.temFerradura;
    }

    public boolean getTemFerradura() {
        return this.temFerradura;
    }

    public void setTemFerradura(boolean temFerradura) {
        this.temFerradura = temFerradura;
    }

    public boolean getIsCorrendo() {
        return this.isCorrendo;
    }

    public void setIsCorrendo(boolean isCorrendo) {
        this.isCorrendo = isCorrendo;
    }
}