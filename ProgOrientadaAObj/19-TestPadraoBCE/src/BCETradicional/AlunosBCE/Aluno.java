package BCETradicional.AlunosBCE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
    private long id;
    private long ra;
    private String nome = "";
    private LocalDate nascimento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
