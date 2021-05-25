public class Passageiro extends Pessoa {
    int codigoVoo;
    String horarioVoo;
    String dataVoo;
    int numAssento;

    public Passageiro() {
        this(0, "", "", 0);
    }

    public Passageiro(int codigoVoo) {
        this(codigoVoo, "", "", 0);
    }

    public Passageiro(int codigoVoo, String horarioVoo) {
        this(codigoVoo, horarioVoo, "", 0);
    }

    public Passageiro(int codigoVoo, String horarioVoo, String dataVoo) {
        this(codigoVoo, horarioVoo, dataVoo, 0);
    }

    public Passageiro(int codigoVoo, String horarioVoo, String dataVoo, int numAssento) {
        System.out.println("Gerando passageiro...");
        this.codigoVoo = codigoVoo;
        this.horarioVoo = horarioVoo;
        this.dataVoo = dataVoo;
        this.numAssento = numAssento;
    }

    public boolean fazerCheckIn() {
        System.out.println("Check-In realizado com sucesso!");
        return true;
    }

    public void embarcarNoVoo() {
        if (fazerCheckIn()) {
            System.out.println("Passageiro embarcando...");
        } else {
            System.out.println("Favor realizar o check-in antes de embarcar!");
        }
    }
}