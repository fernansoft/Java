package BCETradicional.AlunosBCE;

import javafx.beans.property.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
    private List<Aluno> alunos = new ArrayList<>();

    private LongProperty id = new SimpleLongProperty(0);
    private LongProperty ra = new SimpleLongProperty(0);
    private StringProperty nome = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());

    public void setEntity(Aluno a) {
        if (a != null) {
            id.set(a.getId());
            ra.set(a.getRa());
            nome.set(a.getNome());
            nascimento.set(a.getNascimento());
        }
    }

    public Aluno getEntity() {
        Aluno a = new Aluno();
        a.setId(id.get());
        a.setRa(ra.get());
        a.setNome(nome.get());
        a.setNascimento(nascimento.get());
        return a;
    }

    public void adicionar() {
        Aluno a = getEntity();
        alunos.add(a);

        Aluno aEmpty = new Aluno();
        setEntity(aEmpty);
    }

    public void pesquisarPorNome() {
        for (Aluno l : alunos) {
            if (l.getNome().contains(nome.get())) {
                this.setEntity(l);
            }
        }
    }

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public long getRa() {
        return ra.get();
    }

    public LongProperty raProperty() {
        return ra;
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento.get();
    }

    public ObjectProperty<LocalDate> nascimentoProperty() {
        return nascimento;
    }
}