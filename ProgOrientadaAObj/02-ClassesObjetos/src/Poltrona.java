public class Poltrona {
    private String marca;
    private String modelo;
    private String cor;
    private double altura;
    private double largura;
    private boolean isOcupada = false;

    public void sentar() {
        if (isOcupada == true) {
            System.out.println("A poltrona já está ocupada!");
        } else if (isOcupada == false) {
            System.out.println("A poltrona foi ocupada!");
            isOcupada = true;
        }
    }

    public void levantar() {
        if (isOcupada == true) {
            System.out.println("A poltrona foi desocupada!");
            isOcupada = false;
        } else if (isOcupada == false) {
            System.out.println("A poltrona já está desocupada!");
        }
    }

    public void ajustarInclinacaoDoEncosto() {
        System.out.println("Inclinação ajustada!");
    }
}