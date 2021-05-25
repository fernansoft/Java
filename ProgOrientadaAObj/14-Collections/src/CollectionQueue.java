import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        // PriorityQueue chama os elementos organizados
        // LinkedList chama os elementos na ordem que foi adicionado
        // Por ser uma fila, só é possível acessar os elementos do inicio ou final

        fila.add("B");
        fila.add("C");
        fila.add("A");
        fila.add("X");
        fila.add("J");

        // String letra;
        // System.out.println("\nLista Letras:");
        // while ((letra = fila.poll()) != null) {
        //     System.out.println("Letra => " + letra);
        // }
        
        System.out.println("\nLista Elementos:");
        for (String elementos : fila) {
            System.out.println("Elemento => " + elementos);
        }

        System.out.println("Tamanho da fila: " + fila.size());
        // pool = Remove o elemento da fila.
        // peek = Apenas mostra o elemento, sem remover.
        System.out.println("\nPeek =>" + fila.peek());
        System.out.println("Pool =>" + fila.poll());
        System.out.println("Pool =>" + fila.poll());
        System.out.println("Peek =>" + fila.peek());
        System.out.println("\nTamanho da fila: " + fila.size());
    }
}
