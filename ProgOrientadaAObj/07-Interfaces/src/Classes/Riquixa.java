package Classes;

import interfaces.Transportador;

public class Riquixa implements Transportador {
    @Override
    public void transportar() {
        System.out.println("Riquixa transportando cliente");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrar com dinheiro ou cartão");
    }
}