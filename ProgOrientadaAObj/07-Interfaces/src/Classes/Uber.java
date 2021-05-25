package Classes;

import interfaces.Transportador;

public class Uber implements Transportador {
    @Override
    public void transportar() {
        System.out.println("Indo ao destino de Uber");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrar pelo app ou com dinheiro");
    }
}