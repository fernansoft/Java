import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) throws Exception {
        Set<String> alunos = new HashSet<>();

        alunos.add("Carlos Eduardo");
        alunos.add("João Pedro");
        alunos.add("Maria Silva");
        alunos.add("Fernando Oliveira");
        // Não é possível adicionar duplicados

        System.out.println("Carlos está no grupo -> "+ alunos.contains("Carlos Eduardo"));
        System.out.println("Alfredo está no grupo -> "+ alunos.contains("Alfredo"));

        System.out.println("\nMembros do grupo:");
        for (String membro : alunos) {
            System.out.println(membro);
        }

        System.out.println("\nIterator:");
        Iterator<String> alunosIt = alunos.iterator();
        while (alunosIt.hasNext()) {
            System.out.println("Elemento => "+ alunosIt.next());
        }
    }
}