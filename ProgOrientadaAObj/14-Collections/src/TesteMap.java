import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TesteMap {
    public static void main(String[] args) {

        // Map<String, Pessoa> timeVolei = new HashMap<>();
        Map<String, Pessoa> timeVolei = new TreeMap<>();

        Pessoa p1 = new Pessoa("João", 32);
        Pessoa p2 = new Pessoa("Maria", 23);
        Pessoa p3 = new Pessoa("Pedro", 27);
        Pessoa p4 = new Pessoa("William", 19);
        Pessoa p5 = new Pessoa("Laura", 38);
        Pessoa p6 = new Pessoa("Juliana", 20);

        timeVolei.put("Levantador", p1);
        timeVolei.put("Libero", p2);
        timeVolei.put("Ponta1", p3);
        timeVolei.put("Armador", p4);
        timeVolei.put("Ponta2", p5);
        timeVolei.put("Centro", p6);

        Pessoa p = timeVolei.get("Armador");
        System.out.println(p.nome + "---" + p.idade);

        // Já que o valor não pode se repetir, é usado Set
        Set<String> chaves = timeVolei.keySet();
        for (String c : chaves) {
            System.out.println("Chave => " + c);
        }

        // Já que o valor pode se repetir, é usado Collection
        Collection<Pessoa> values = timeVolei.values();

        for (Pessoa pessoa : values) {
            System.out.println("Nome => " + pessoa.nome);
        }

        Stream<String> valuesTransformados = values.stream().map((item) -> {
            return "*" + item.nome + "*";
        });

        // Forma compacta do foreach
        valuesTransformados.forEach(System.out::println);
    }
}