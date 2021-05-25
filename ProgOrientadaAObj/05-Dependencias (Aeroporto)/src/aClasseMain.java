public class aClasseMain {
    public static void main(String[] args) {
        Aeroporto aeroporto01 = new Aeroporto("Guarulhos", 11905056.52, "São Paulo");
        Aeroporto aeroporto02 = new Aeroporto("Congonhas", 1600000, "São Paulo");
        System.out.println();
        Aeronave boeing777 = new Aeronave("boeing777", 297550, 305, 63.7);
        Aeronave airbusA330 = new Aeronave("airbusA330", 70000, 335, 59);
        System.out.println();
        Piloto pilotoFabio = new Piloto(15, "Noturno", "Boing777");
        Piloto pilotoCarlos = new Piloto(30, "Matutino", "AirbusA330");
        System.out.println();
        Passageiro passageiroJulia = new Passageiro();
        Passageiro passageiroFernando = new Passageiro();
    }
}