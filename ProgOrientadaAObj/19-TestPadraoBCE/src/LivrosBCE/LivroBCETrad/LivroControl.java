package LivrosBCE.LivroBCETrad;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LivroControl {
    private List<Livro> livros = new ArrayList<>();

    private LongProperty id = new SimpleLongProperty(0);
    private StringProperty titulo = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> lancamento = new SimpleObjectProperty<>(LocalDate.now());
    private IntegerProperty edicao = new SimpleIntegerProperty(1);
    private StringProperty autor = new SimpleStringProperty("");
    private StringProperty editora = new SimpleStringProperty("");
    private StringProperty isbn = new SimpleStringProperty("");

    public void setEntity(Livro l) {
        if (l != null) {
            id.set(l.getId());
            titulo.set(l.getTitulo());
            lancamento.set(l.getLancamento());
            edicao.set(l.getEdicao());
            autor.set(l.getAutor());
            editora.set(l.getEditora());
            isbn.set(l.getIsbn());
        }
    }

    public Livro getEntity() {
        Livro l = new Livro();
        l.setId(id.get());
        l.setTitulo(titulo.get());
        l.setLancamento(lancamento.get());
        l.setEdicao(edicao.get());
        l.setAutor(autor.get());
        l.setEditora(editora.get());
        l.setIsbn(isbn.get());
        return l;
    }

    public void adicionar() {
        Livro l = getEntity();
        livros.add(l);
    }

    public void pesquisarPorTitulo() {
        for (Livro l : livros) {
            if (l.getTitulo().contains(titulo.get())) {
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

    public String getTitulo() {
        return titulo.get();
    }

    public StringProperty tituloProperty() {
        return titulo;
    }

    public LocalDate getLancamento() {
        return lancamento.get();
    }

    public ObjectProperty<LocalDate> lancamentoProperty() {
        return lancamento;
    }

    public int getEdicao() {
        return edicao.get();
    }

    public IntegerProperty edicaoProperty() {
        return edicao;
    }

    public String getAutor() {
        return autor.get();
    }

    public StringProperty autorProperty() {
        return autor;
    }

    public String getEditora() {
        return editora.get();
    }

    public StringProperty editoraProperty() {
        return editora;
    }

    public String getIsbn() {
        return isbn.get();
    }

    public StringProperty isbnProperty() {
        return isbn;
    }
}