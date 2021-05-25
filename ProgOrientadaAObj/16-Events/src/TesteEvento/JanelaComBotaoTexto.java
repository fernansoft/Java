package TesteEvento;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.security.x509.IssuerAlternativeNameExtension;

public class JanelaComBotaoTexto extends Application {

    class AssinanteMouse implements EventHandler<MouseEvent>{
        public void handle(MouseEvent e) {
//            System.out.println("Botão Pressionado!");
            System.out.print("Type=>"+ e.getEventType());
            System.out.print("\tType=>"+ e.getSource());
            System.out.println("\tType=>"+ e.getTarget());
        }
    }

    class AssinanteEvento implements EventHandler<MouseEvent>{
        private String nome;
        private boolean consumo;

        public AssinanteEvento(String nome, boolean consumo){
            this.nome = nome;
            this.consumo = consumo;
        }

        public void handle(MouseEvent e) {
            System.out.println(this.nome+ "Evento acionado!");
            if(this.consumo){
                e.consume();
            }
        }
    }

    class AssinanteTecla implements EventHandler<KeyEvent>{

        @Override
        public void handle(KeyEvent event) {
            if (event.getCharacter().equals("a")){
                event.consume();
            }
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 600,400);

        Button btn = new Button("Me aperte");
        Label lbl = new Label("Label");

        TextField txt = new TextField();
        txt.addEventFilter(KeyEvent.ANY, new AssinanteTecla());

//        AssinanteMouse a = new AssinanteMouse();

//        Se o parâmetro for true, ele consome o evento e não propaga mais.
        stage.addEventFilter(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("STAGE CAPTURING", false));
        stage.addEventHandler(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("STAGE BUBBLING", false));

        scn.addEventFilter(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("SCENE CAPTURING", false));
        scn.addEventHandler(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("SCENE BUBBLING", false));

        bp.addEventFilter(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("PANE CAPTURING", false));
        bp.addEventHandler(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("PANE BUBBLING", false));

        btn.addEventFilter(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("BUTTON CAPTURING", false));
        btn.addEventHandler(MouseEvent.MOUSE_PRESSED, new AssinanteEvento("BUTTON BUBBLING", false));

//        EventFilter: Evento ocorre na Capturing Phase
//        EventHandler: Evento ocorre na Bubbling Phase

//        btn.addEventFilter(MouseEvent.ANY, a);

        BorderPane.setAlignment(btn, Pos.CENTER);
        BorderPane.setAlignment(lbl, Pos.CENTER);
        BorderPane.setAlignment(txt, Pos.CENTER);

        bp.setCenter(txt);
        bp.setTop(lbl);
        bp.setBottom(btn);

        stage.setScene(scn);
        stage.setTitle("Teste de Evento com Botão e Texto");
        stage.show();
    }
}
