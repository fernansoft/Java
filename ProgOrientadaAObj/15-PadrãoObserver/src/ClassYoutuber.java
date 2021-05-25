import java.util.ArrayList;
import java.util.List;

public class ClassYoutuber implements InterfacePublicador {

    private String nome;

    public ClassYoutuber(String nome) {
        this.nome = nome;
    }

    private List<InterfaceAssinante> lista = new ArrayList<>();

    @Override
    public void adicionar(InterfaceAssinante a) {
        lista.add(a);
    }

    @Override
    public void remover(InterfaceAssinante a) {
        lista.remove(a);
    }

    @Override
    public void notificar(String mensagem) {
        for (InterfaceAssinante a : lista) {
            String texto = String.format("%s informa => %s", this.nome, mensagem);
            a.receberMensagem(texto);
        }
    }
}