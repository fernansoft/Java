public class Piloto extends Pessoa {
    int anosExperiencia;
    String turnoDeTrabalho;
    String tipoAeronave;

    public Piloto() {
        this(0, "", "");
    }

    public Piloto(int anosExperiencia) {
        this(anosExperiencia, "", "");
    }

    public Piloto(int anosExperiencia, String turnoDeTrabalho) {
        this(anosExperiencia, turnoDeTrabalho, "");
    }

    public Piloto(int anosExperiencia, String turnoDeTrabalho, String tipoAeronave) {
        System.out.println("Gerando piloto...");
        this.anosExperiencia = anosExperiencia;
        this.turnoDeTrabalho = turnoDeTrabalho;
        this.tipoAeronave = tipoAeronave;
    }
}