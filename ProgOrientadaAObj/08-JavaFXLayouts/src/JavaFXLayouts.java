import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXLayouts extends Application {
    @Override
    public void start(Stage stage){
        AnchorPane pane = new AnchorPane();
        Scene scn = new Scene(pane, 640, 480);

        Label lbl = new Label("Xablau");
        TextField tfield = new TextField();
        Button btn = new Button("Só Clika!");

        pane.getChildren().addAll(lbl, tfield, btn);

        AnchorPane.setBottomAnchor(btn, 15.0);
        AnchorPane.setRightAnchor(btn, 15.0);
        AnchorPane.setTopAnchor(lbl, 15.0);
        AnchorPane.setLeftAnchor(lbl, 15.0);
        AnchorPane.setTopAnchor(tfield, 50.0);
        AnchorPane.setLeftAnchor(tfield, 15.0);
        AnchorPane.setRightAnchor(tfield, 15.0);
        AnchorPane.setBottomAnchor(tfield, 50.0);

//        AnchorPane pane = new AnchorPane();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.getChildren().addAll(lbl, tfield, btn);
//        AnchorPane.setBottomAnchor(btn, 15.0);
//        AnchorPane.setRightAnchor(btn, 15.0);
//        AnchorPane.setTopAnchor(lbl, 15.0);
//        AnchorPane.setLeftAnchor(lbl, 15.0);
//        AnchorPane.setTopAnchor(tfield, 50.0);
//        AnchorPane.setLeftAnchor(tfield, 15.0);
//        AnchorPane.setRightAnchor(tfield, 15.0);
//        AnchorPane.setBottomAnchor(tfield, 50.0);

//        HBox pane = new HBox();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.getChildren().addAll(lbl, tfield, btn);

//        VBox pane = new VBox();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.getChildren().addAll(lbl, tfield, btn);

//        GridPane pane = new GridPane();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.add(lbl, 0, 0);
//        pane.add(tfield, 1, 0);
//        pane.add(btn, 0, 1);
//        pane.setHgap(15);
//        pane.setVgap(15);

//        TilePane pane = new TilePane();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.getChildren().addAll(lbl, tfield, btn);
//        pane.setPrefColumns(2);
//        pane.setHgap(15);
//        pane.setVgap(10);

//        BorderPane pane = new BorderPane();
//        FlowPane pane2 = new FlowPane();
//        Scene scn = new Scene(pane, 640, 480);
//        pane2.getChildren().addAll(lbl, tfield);
//        pane.setTop(pane2);
//        pane.setBottom(btn);

//        FlowPane pane = new FlowPane();
//        Scene scn = new Scene(pane, 640, 480);
//        pane.setHgap(20);
//        pane.setVgap(50);
//        pane.getChildren().addAll(lbl, tfield, btn);

//        Pane pane = new Pane();
//        Scene scn = new Scene(pane, 640, 480);
//        lbl.relocate(10,20);
//        tfield.relocate(150,20);
//        btn.relocate(10,70);

        stage.setScene(scn);
        stage.setTitle("Formulario JavaFX com Layouts");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(JavaFXLayouts.class, args);
    }
}