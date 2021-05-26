package EventBotaoHello;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JanelaComBotaoHello extends Application {

    static class AssinanteMouse implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            System.out.println("Hello World!");
        }
    }

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 600, 400);

        Button btn = new Button("Ok");
        Label lbl = new Label("Pressione o botão para ver a mensagem Hello!");

        AssinanteMouse a = new AssinanteMouse();

        btn.addEventFilter(ActionEvent.ACTION, a);

        BorderPane.setAlignment(btn, Pos.CENTER);
        BorderPane.setAlignment(lbl, Pos.CENTER);

        bp.setTop(lbl);
        bp.setCenter(btn);

        stage.setScene(scn);
        stage.setTitle("Teste de Evento com Botão e Texto");
        stage.show();
    }
}
