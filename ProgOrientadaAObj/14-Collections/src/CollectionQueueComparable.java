import java.util.PriorityQueue;

class Pessoa implements Comparable<Pessoa> {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outra) {
        // return outra.idade - this.idade;
            // Organiza por idade decrescente
        return this.nome.compareTo(outra.nome);
            // Organiza por nome crescente
    }
}

public class CollectionQueueComparable {
    public static void main(String[] args) {
        // Por ser fila, só é possível usar os valores de inicio e final
        // Obs: O foreach não traz os valores com prioridade correta
        // Obs: Somente o poll usa os valores corretamente, os removando da lista.
        PriorityQueue<Pessoa> fila = new PriorityQueue<>();

        fila.add(new Pessoa("João", 32));
        fila.add(new Pessoa("Maria", 23));
        fila.add(new Pessoa("Pedro", 27));
        fila.add(new Pessoa("William", 19));
        fila.add(new Pessoa("Laura", 38));
        fila.add(new Pessoa("Fernando", 29));
        fila.add(new Pessoa("Juliana", 20));

        // fila.add("João");
        // fila.add("Maria");
        // fila.add("Pedro");
        // fila.add("William");
        // fila.add("Laura");
        // fila.add("Fernando");
        // fila.add("Juliana");

        System.out.println("\nTamanho da fila: " + fila.size());

        Pessoa p;
        System.out.println("\nFila com pool:");
        while ((p = fila.poll()) != null) {
            System.out.println("Nome: " + p.nome + "-- Idade: " + p.idade);
        }

        System.out.println("\nTamanho da fila: " + fila.size());
    }
}