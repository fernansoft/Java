import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FormularioFXLayouts extends Application {
    @Override
    public void start(Stage stage){
        GridPane gridPane = new GridPane();
        HBox buttonHB = new HBox();
        Scene scn = new Scene(gridPane, 300, 200);

        String styleLabel =
        "-fx-border-color: black;" +
        "-fx-border-width: 1px;" +
        "-fx-padding: 5px 10px 5px 10px;" +
        "-fx-min-width: 90px;" +
        "-fx-border-radius: 5px;" +
        "-fx-font-weight: bold";
        String styleTextField =
        "-fx-border-width: 2px;" +
        "-fx-padding: 5px 10px 5px 10px;" +
        "-fx-border-radius: 5px;";

        Label id = new Label("Id");             id.setStyle(styleLabel);
        Label nome = new Label("Nome");         nome.setStyle(styleLabel);
        Label telefone = new Label("Telefone"); telefone.setStyle(styleLabel);
        gridPane.add(id, 0, 0);
        gridPane.add(nome, 0, 1);
        gridPane.add(telefone, 0, 2);

        TextField txtId = new TextField();       txtId.setStyle(styleTextField);
        TextField txtNome = new TextField();     txtNome.setStyle(styleTextField);
        TextField txtTelefone = new TextField(); txtTelefone.setStyle(styleTextField);
        gridPane.add(txtId, 1, 0);
        gridPane.add(txtNome, 1, 1);
        gridPane.add(txtTelefone, 1, 2);

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");
        gridPane.add(buttonHB, 0, 3);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(10);

        buttonHB.setAlignment(Pos.BOTTOM_LEFT);
        buttonHB.getChildren().addAll(btnSalvar, btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Formulário JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(FormularioFXLayouts.class, args);
    }
}