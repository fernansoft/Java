public class Aeronave {
    String nome;
    double peso;
    int quantAssentos;
    double comprimento;

    boolean isVoando;

    public Aeronave(String nome, double peso, int quantAssentos, double comprimento) {
        System.out.println("Gerando aeronave '" + nome + "'...");
        this.nome = nome;
        this.peso = peso;
        this.quantAssentos = quantAssentos;
        this.comprimento = comprimento;
    }

    public void voar() {
        if (this.isVoando) {
            System.out.println("A aeronave já está voando!");
        } else if (!this.isVoando) {
            System.out.println("Iniciando decolagem...");
            this.isVoando = true;
        }
    }

    public void aterrizar() {
        if (this.isVoando) {
            System.out.println("Aterrizando a aeronave...");
            this.isVoando = false;
        } else if (!this.isVoando) {
            System.out.println("A aeronave já está em solo!");
        }
    }
}