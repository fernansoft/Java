import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculadoraFXLayouts extends Application {
    @Override
    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        HBox topHB = new HBox();
        Scene scn = new Scene(borderPane);

        String styleButtonCE =
        "-fx-border-color: #039ED3;" +
        "-fx-border-radius: 5px;" +
        "-fx-background-radius: 5px;" +
        "-fx-font-weight: bold";
        String styleButtonNum =
        "-fx-border-color: #039ED3;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-font-weight: bold";
        String styleButtonChar =
        "-fx-border-color: #35A64A;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-font-weight: bold";
        String styleTextField =
        "-fx-alignment: center-right;"+
        "-fx-font-size: 2em;";

        TextField textField = new TextField("0"); textField.setStyle(styleTextField);
        textField.setPrefSize(300.0, 50.0);
        Button btnCE = new Button("CE"); btnCE.setStyle(styleButtonCE);
        btnCE.setPrefSize(60.0, 50.0);

        Button btnNum1 = new Button("1"); btnNum1.setStyle(styleButtonNum); btnNum1.setPrefSize(80.0, 80.0);
        Button btnNum2 = new Button("2"); btnNum2.setStyle(styleButtonNum); btnNum2.setPrefSize(80.0, 80.0);
        Button btnNum3 = new Button("3"); btnNum3.setStyle(styleButtonNum); btnNum3.setPrefSize(80.0, 80.0);
        Button btnNum4 = new Button("4"); btnNum4.setStyle(styleButtonNum); btnNum4.setPrefSize(80.0, 80.0);
        Button btnNum5 = new Button("5"); btnNum5.setStyle(styleButtonNum); btnNum5.setPrefSize(80.0, 80.0);
        Button btnNum6 = new Button("6"); btnNum6.setStyle(styleButtonNum); btnNum6.setPrefSize(80.0, 80.0);
        Button btnNum7 = new Button("7"); btnNum7.setStyle(styleButtonNum); btnNum7.setPrefSize(80.0, 80.0);
        Button btnNum8 = new Button("8"); btnNum8.setStyle(styleButtonNum); btnNum8.setPrefSize(80.0, 80.0);
        Button btnNum9 = new Button("9"); btnNum9.setStyle(styleButtonNum); btnNum9.setPrefSize(80.0, 80.0);
        Button btnNum0 = new Button("0"); btnNum0.setStyle(styleButtonNum); btnNum0.setPrefSize(80.0, 80.0);
        
        Button btnPlus = new Button("+");    btnPlus.setStyle(styleButtonChar); btnPlus.setPrefSize(80.0, 80.0);
        Button btnMinus = new Button("-");   btnMinus.setStyle(styleButtonChar); btnMinus.setPrefSize(80.0, 80.0);
        Button btnTimes = new Button("*");   btnTimes.setStyle(styleButtonChar); btnTimes.setPrefSize(80.0, 80.0);
        Button btnComma = new Button(",");   btnComma.setStyle(styleButtonChar); btnComma.setPrefSize(80.0, 80.0);
        Button btnEquals = new Button("=");  btnEquals.setStyle(styleButtonChar); btnEquals.setPrefSize(80.0, 80.0);
        Button btnDivided = new Button("/"); btnDivided.setStyle(styleButtonChar); btnDivided.setPrefSize(80.0, 80.0);

        gridPane.add(textField, 0, 0);
        gridPane.add(btnCE, 1, 0);
        
        gridPane.add(btnNum1, 0, 1);
        gridPane.add(btnNum2, 1, 1);
        gridPane.add(btnNum3, 2, 1);
        gridPane.add(btnNum4, 0, 2);
        gridPane.add(btnNum5, 1, 2);
        gridPane.add(btnNum6, 2, 2);
        gridPane.add(btnNum7, 0, 3);
        gridPane.add(btnNum8, 1, 3);
        gridPane.add(btnNum9, 2, 3);
        gridPane.add(btnNum0, 1, 4);
        
        gridPane.add(btnPlus,    3, 1);
        gridPane.add(btnMinus,   3, 2);
        gridPane.add(btnTimes,   3, 3);
        gridPane.add(btnDivided, 3, 4);
        gridPane.add(btnComma,   0, 4);
        gridPane.add(btnEquals,  2, 4);

        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        topHB.getChildren().addAll(textField, btnCE);
        topHB.setAlignment(Pos.TOP_CENTER);

        borderPane.setTop(topHB);
        borderPane.setCenter(gridPane);

        stage.setScene(scn); stage.setTitle("Calculadora JavaFX"); stage.show();
    }

    public static void main(String[] args) {
        Application.launch(CalculadoraFXLayouts.class, args);
    }
}