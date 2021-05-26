package CRUDAlunosBCE;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BoundaryAluno extends Application implements EventHandler<ActionEvent> {

    private final TextField txtId = new TextField();
    private final TextField txtRa = new TextField();
    private final TextField txtNome = new TextField();
    private final TextField txtNascimento = new TextField();

    private final Button btnAdicionar = new Button("Adicionar");
    private final Button btnPesquisar = new Button("Pesquisar");

    private final List<EntityAluno> lista = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 600, 400);

        Label lblId = new Label("Id");
        Label lblRa = new Label("Ra");
        Label lblNome = new Label("Nome");
        Label lblNascimento = new Label("Nascimento");

        gp.add(lblId, 0, 0);
        gp.add(lblRa, 0, 1);
        gp.add(lblNome, 0, 2);
        gp.add(lblNascimento, 0, 3);
        gp.add(txtId, 1, 0);
        gp.add(txtRa, 1, 1);
        gp.add(txtNome, 1, 2);
        gp.add(txtNascimento, 1, 3);
        gp.add(btnAdicionar, 0, 4);
        gp.add(btnPesquisar, 1, 4);

        btnAdicionar.setOnAction(this);
        btnPesquisar.setOnAction(this);

        stage.setScene(scn);
        stage.setTitle("Teste BCE");
        stage.show();
    }

    public EntityAluno boundaryToEntity() throws ParseException {
        EntityAluno j = new EntityAluno();
        j.setId(Long.parseLong(txtId.getText()));
        j.setRa(Long.parseLong(txtRa.getText()));
        j.setNome(txtNome.getText());

        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        j.setNascimento(dateFor.parse(txtNascimento.getText()));

        return j;
    }

    public void entityToBoundary(EntityAluno j) {
        txtId.setText(String.valueOf(j.getId()));
        txtRa.setText(String.valueOf(j.getRa()));
        txtNome.setText(j.getNome());

        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        txtNascimento.setText(dateFor.format(j.getNascimento()));
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btnAdicionar) {
            EntityAluno j = null;
            try {
                j = boundaryToEntity();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            lista.add(j);
        } else if (event.getSource() == btnPesquisar) {
            for (EntityAluno j : lista) {
                if (j.getNome().contains(txtNome.getText())) {
                    entityToBoundary(j);
                }
            }
        }
    }
}
