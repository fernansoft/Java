package Classes;

public class TesteInterface {
    public static void main(String[] args) {
        Turista t1 = new Turista();
        Riquixa r1 = new Riquixa();
        Uber u1 = new Uber();

        t1.setTransportador(r1);

        t1.irAoMuseu();
    }
}