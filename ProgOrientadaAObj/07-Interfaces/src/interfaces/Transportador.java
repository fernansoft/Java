package interfaces;

public interface Transportador {
    void transportar();

    default void cobrar() {
        System.out.println("Cobrando com dinheiro");
    }
}