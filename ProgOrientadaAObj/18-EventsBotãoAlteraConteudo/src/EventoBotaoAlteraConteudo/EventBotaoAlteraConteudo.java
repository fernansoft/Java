package EventoBotaoAlteraConteudo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventBotaoAlteraConteudo extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 600, 400);

        Button btn = new Button("Me aperte");
        Label lbl = new Label("Label");

        lbl.setFont(new Font(35));
        btn.setFont(new Font(35));

        btn.setOnAction(event -> lbl.setText("Botão Pressionado!"));

        BorderPane.setAlignment(btn, Pos.CENTER);
        BorderPane.setAlignment(lbl, Pos.CENTER);

        bp.setTop(lbl);
        bp.setCenter(btn);

        stage.setScene(scn);
        stage.setTitle("Teste de Evento com Botão Alterando o Label");
        stage.show();
    }
}
