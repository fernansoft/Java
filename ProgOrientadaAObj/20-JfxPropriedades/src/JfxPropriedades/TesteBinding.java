package JfxPropriedades;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TesteBinding extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane bp = new FlowPane();
        Scene scn = new Scene(bp, 200, 200);

        StringProperty texto = new SimpleStringProperty("");

        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
        TextField txt3 = new TextField();
        Button btn = new Button("Pressione!");

        btn.setOnAction((e)-> System.out.println(texto.get()));

//        txt1.textProperty().addListener((observable, antigo, novo) -> {
//            System.out.println("Valor alterado de: " + antigo + " -- Para: " + novo);
//            txt2.setText(antigo);
//            txt3.setText(novo);
//        });

//        Bindings.bindBidirectional(txt1.textProperty(), txt2.textProperty());
//        txt1.textProperty().bind(txt2.textProperty());
        Bindings.bindBidirectional(txt1.textProperty(), texto);

        bp.getChildren().addAll(txt1, txt2, txt3, btn);

        stage.setTitle("Teste de Binding");
        stage.setScene(scn);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TesteBinding.class, args);
    }
}