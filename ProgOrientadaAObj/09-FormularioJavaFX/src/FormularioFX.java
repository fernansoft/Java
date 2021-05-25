import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormularioFX extends Application {
    @Override
    public void start(Stage stage){
        Pane painel = new Pane();
        Scene scn = new Scene(painel);

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

        Label id = new Label("Id");
        id.setStyle(styleLabel);
        id.relocate(20,20);
        Label nome = new Label("Nome");
        nome.setStyle(styleLabel);
        nome.relocate(20,60);
        Label telefone = new Label("Telefone");
        telefone.setStyle(styleLabel);
        telefone.relocate(20,100);

        TextField txtId = new TextField();
        txtId.relocate(120,20);
        txtId.setStyle(styleTextField);
        TextField txtNome = new TextField();
        txtNome.relocate(120,60);
        txtNome.setStyle(styleTextField);
        TextField txtTelefone = new TextField();
        txtTelefone.relocate(120,100);
        txtTelefone.setStyle(styleTextField);
        
        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(20,150);
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(80,150);
        
        painel.getChildren().add(id);
        painel.getChildren().add(nome);
        painel.getChildren().add(telefone);

        painel.getChildren().add(txtId);
        painel.getChildren().add(txtNome);
        painel.getChildren().add(txtTelefone);

        painel.getChildren().add(btnSalvar);
        painel.getChildren().add(btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Formulário JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(FormularioFX.class, args);
    }
}