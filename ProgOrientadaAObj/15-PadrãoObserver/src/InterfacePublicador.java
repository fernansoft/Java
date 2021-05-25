public interface InterfacePublicador {
    void adicionar(InterfaceAssinante a);

    void remover(InterfaceAssinante a);

    void notificar(String mensagem);
}