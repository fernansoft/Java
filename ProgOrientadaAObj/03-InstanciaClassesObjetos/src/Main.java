public class Main {
    public static void main(String[] args) {
        // Class Carro
        System.out.println("*************************************************");
        Carro opala = new Carro();
        System.out.println("Instancia de carro 'opala' criada!");
        opala.setCor("Preto");
        opala.setPlaca("ABC-1234");
        opala.setMarca("Chevrolet");
        
        System.out.println("Cor do carro: " + opala.getCor() + ".");
        System.out.println("Placa do carro: " + opala.getPlaca() + ".");
        System.out.println("Marca do carro: " + opala.getMarca() + ".");
        
        opala.ligarIgnição();
        opala.porEmMovimento();
        opala.imobilzar();
        
        // Class Cavalo
        System.out.println("*************************************************");
        Cavalo peDePano = new Cavalo();
        System.out.println("\nInstancia de Cavalo 'peDePano' criada!");
        peDePano.setIdade(20);
        peDePano.setPeso(500);
        peDePano.setRaça("Quarto de Milha");

        System.out.println("Idade do cavalo: " + peDePano.getIdade() + " anos.");
        System.out.println("Peso do cavalo: " + peDePano.getPeso() + "kg.");
        System.out.println("Raça do cavalo: " + peDePano.getRaça() + ".");

        peDePano.comerCapim();
        peDePano.colocarFerradura();
        peDePano.correr();

        // Class Poltrona
        System.out.println("*************************************************");
        Poltrona confortavel = new Poltrona();
        System.out.println("\nInstancia de Poltrona 'confortavel' criada!");
        confortavel.setCor("verde");
        confortavel.setAlturaDoAssento(37);
        confortavel.setLargura(42);

        System.out.println("Cor da poltrona " + confortavel.getCor() + ".");
        System.out.println("Altura do assento da poltrona " + confortavel.getAlturaDoAssento() + "cm.");
        System.out.println("Largura da poltrona " + confortavel.getLargura() + "cm.");

        confortavel.sentar();
        confortavel.ajustarInclinacaoDoEncosto();
        confortavel.levantar();
    }
}