package TestBCE;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class BoundaryJogo extends Application implements EventHandler<ActionEvent> {

    private TextField txtId = new TextField();
    private TextField txtTitulo = new TextField();
    private TextField txtGenero = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private List<EntityJogo> lista = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 600, 400);

        Label lblId = new Label("Id");
        Label lblTitulo = new Label("Titulo");
        Label lblGenero = new Label("Genero");

        gp.add(lblId, 0, 0);
        gp.add(txtId, 1, 0);
        gp.add(lblTitulo, 0, 1);
        gp.add(txtTitulo, 1, 1);
        gp.add(lblGenero, 0, 2);
        gp.add(txtGenero, 1, 2);
        gp.add(btnAdicionar, 0, 3);
        gp.add(btnPesquisar, 1, 3);

        btnAdicionar.setOnAction(this);
        btnPesquisar.setOnAction(this);

        stage.setScene(scn);
        stage.setTitle("Teste BCE");
        stage.show();
    }

    public EntityJogo boundaryToEntity() {
        EntityJogo j = new EntityJogo();
        j.setId(Long.parseLong(txtId.getText()));
        j.setTitulo(txtTitulo.getText());
        j.setGenero(txtGenero.getText());
        return j;
    }

    public void entityToBoundary(EntityJogo j) {
        txtTitulo.setText(j.getTitulo());
        txtGenero.setText(j.getGenero());
        txtId.setText(String.valueOf(j.getId()));
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btnAdicionar) {
            EntityJogo j = boundaryToEntity();
            lista.add(j);
        } else if (event.getSource() == btnPesquisar) {
            for (EntityJogo j : lista) {
                if (j.getTitulo().equals(txtTitulo.getText())) {
                    entityToBoundary(j);
                }
            }
        }
    }
}
