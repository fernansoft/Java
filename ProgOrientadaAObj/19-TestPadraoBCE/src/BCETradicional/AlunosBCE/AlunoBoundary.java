package BCETradicional.AlunosBCE;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LongStringConverter;

public class AlunoBoundary extends Application {

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) {
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 600, 400);

        gp.add(new Label("Id"), 0, 0);
        gp.add(new Label("Ra"), 0, 1);
        gp.add(new Label("Nome"), 0, 2);
        gp.add(new Label("Nascimento"), 0, 3);

        gp.add(txtId, 1, 0);
        gp.add(txtRa, 1, 1);
        gp.add(txtNome, 1, 2);
        gp.add(txtNascimento, 1, 3);

        gp.add(btnAdicionar, 0, 7);
        gp.add(btnPesquisar, 1, 7);

        StringConverter localDateToStringConverter = new LocalDateStringConverter();

        btnAdicionar.setOnAction((e) -> {
            Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(), localDateToStringConverter);
            control.adicionar();
        });
        btnPesquisar.setOnAction((e) -> control.pesquisarPorNome());

        StringConverter longToStringConverter = new LongStringConverter();

        Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(), longToStringConverter);
        Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty(), longToStringConverter);
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());

        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(AlunoBoundary.class, args);
    }
}
