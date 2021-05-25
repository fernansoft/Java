package Classes;

import interfaces.Transportador;

public class Turista {
    Transportador transp;

    void irAoMuseu() {
        transp.transportar();
        transp.cobrar();
    }

    public void setTransportador(Transportador t){
        this.transp = t;
    }
}