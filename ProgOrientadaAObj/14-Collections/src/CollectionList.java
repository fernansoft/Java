import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        // Polimorfismo, assume a forma de List e passa como o tipo de lista que quer
        // Sem precisar alterar em todos métodos.
        List<String> clientes = new ArrayList<>();
        adicionarClientes(clientes);
        listarClientes(clientes);
        
        // As posições são preservadas e podem ser alteradas diretamente
        clientes.set(3, "Bradesco");
        System.out.println("\nElemento 3 => "+ clientes.get(3));
        listarClientes(clientes);
    }
    
    public static void adicionarClientes(List<String> lista) {
        lista.add("IBM");
        lista.add("Microsoft");
        lista.add("Banco do Brasil");
        lista.add("Itau");
        lista.add("Volkswagen");
    }

    public static void listarClientes(List<String> lista) {
        System.out.println("\nListando Clientes:");
        for (String cliente : lista) {
            System.out.println("Cliente => "+ cliente);
        }
    }
}
