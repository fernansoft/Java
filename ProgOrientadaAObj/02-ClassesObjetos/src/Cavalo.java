public class Cavalo {
    private int idade;
    private String raça;
    private double altura;
    private double peso;
    private double comprimento;
    private boolean temFerradura = false;
    private boolean isCorrendo = false;

    public void correr() {
        if (isCorrendo == true) {
            System.out.println("O cavalo já está correndo!");
        } else if (isCorrendo == false) {
            System.out.println("O cavalo começou a correr!");
            isCorrendo = true;
        }
    }

    public void colocarFerradura() {
        if (temFerradura == true) {
            System.out.println("O cavalo já tem ferradura!");
        } else if (temFerradura == false) {
            System.out.println("Ferradura colocada!");
            temFerradura = true;
        }
    }

    public void comerCapim() {
        System.out.println("O cavalo começou a comer o capim!");
    }
}