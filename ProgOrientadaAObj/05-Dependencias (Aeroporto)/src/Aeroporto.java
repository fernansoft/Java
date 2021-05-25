public class Aeroporto {
    String nome;
    double area;
    String cidade;

    boolean isAberto;

    public Aeroporto(String nome, double area, String cidade) {
        System.out.println("Gerando aeroporto '" + nome + "'...");
        this.nome = nome;
        this.area = area;
        this.cidade = cidade;
    }

    public void abrir() {
        if (this.isAberto) {
            System.out.println("O aeroporto já está aberto!");
        } else if (!this.isAberto) {
            System.out.println("Abrindo aeroporto...");
            this.isAberto = true;
        }
    }

    public void fechar() {
        if (this.isAberto) {
            System.out.println("Fechando o aeroporto...");
            this.isAberto = false;
        } else if (!this.isAberto) {
            System.out.println("O aeroporto já está fechado!");
        }
    }
}