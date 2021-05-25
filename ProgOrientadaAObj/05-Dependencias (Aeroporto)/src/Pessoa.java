public class Pessoa {
    String nome;
    String rg;
    int idade;
    String cpf;

    public Pessoa() {
        this("", "", 0, "");
    }

    public Pessoa(String nome) {
        this(nome, "", 0, "");
    }

    public Pessoa(String nome, String rg) {
        this(nome, rg, 0, "");
    }

    public Pessoa(String nome, String rg, int idade) {
        this(nome, rg, idade, "");
    }

    public Pessoa(String nome, String rg, int idade, String cpf) {
        System.out.println("Gerando pessoa...");
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void andar() {
        System.out.println("A pessoa está andando...");
    }
}