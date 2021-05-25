import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalculadoraFX extends Application {
    @Override
    public void start(Stage stage){
        Pane painel = new Pane();
        Scene scn = new Scene(painel);

        String styleButtonCE =
        "-fx-border-color: #039ED3;" +
        "-fx-min-width: 50px;" +
        "-fx-border-radius: 5px;" +
        "-fx-background-radius: 5px;" +
        "-fx-font-weight: bold";
        String styleButtonNum =
        "-fx-border-color: #039ED3;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-min-width: 38px;" +
        "-fx-min-height: 38px;" +
        "-fx-font-weight: bold";
        String styleButtonChar =
        "-fx-border-color: #35A64A;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-min-width: 38px;" +
        "-fx-min-height: 38px;" +
        "-fx-font-weight: bold";
        String styleTextField =
        "-fx-alignment: center-right;";

        TextField txtId = new TextField("0"); txtId.relocate(20,21); txtId.setStyle(styleTextField);
        
        Button btnCE = new Button("CE"); btnCE.relocate(175,20); btnCE.setStyle(styleButtonCE);
        
        Button btnNum1 = new Button("1"); btnNum1.relocate(25,55);   btnNum1.setStyle(styleButtonNum);
        Button btnNum2 = new Button("2"); btnNum2.relocate(75,55);   btnNum2.setStyle(styleButtonNum);
        Button btnNum3 = new Button("3"); btnNum3.relocate(125,55);  btnNum3.setStyle(styleButtonNum);
        Button btnNum4 = new Button("4"); btnNum4.relocate(25,100);  btnNum4.setStyle(styleButtonNum);
        Button btnNum5 = new Button("5"); btnNum5.relocate(75,100);  btnNum5.setStyle(styleButtonNum);
        Button btnNum6 = new Button("6"); btnNum6.relocate(125,100); btnNum6.setStyle(styleButtonNum);
        Button btnNum7 = new Button("7"); btnNum7.relocate(25,145);  btnNum7.setStyle(styleButtonNum);
        Button btnNum8 = new Button("8"); btnNum8.relocate(75,145);  btnNum8.setStyle(styleButtonNum);
        Button btnNum9 = new Button("9"); btnNum9.relocate(125,145); btnNum9.setStyle(styleButtonNum);
        Button btnNum0 = new Button("0"); btnNum0.relocate(75,190);  btnNum0.setStyle(styleButtonNum);
        
        Button btnPlus = new Button("+");    btnPlus.relocate(175,55);     btnPlus.setStyle(styleButtonChar);
        Button btnMinus = new Button("-");   btnMinus.relocate(175,100);   btnMinus.setStyle(styleButtonChar);
        Button btnTimes = new Button("*");   btnTimes.relocate(175,145);   btnTimes.setStyle(styleButtonChar);
        Button btnComma = new Button(",");   btnComma.relocate(25,190);    btnComma.setStyle(styleButtonChar);
        Button btnEquals = new Button("=");  btnEquals.relocate(125,190);  btnEquals.setStyle(styleButtonChar);
        Button btnDivided = new Button("/"); btnDivided.relocate(175,190); btnDivided.setStyle(styleButtonChar);

        painel.getChildren().add(txtId);

        painel.getChildren().add(btnCE);
        
        painel.getChildren().add(btnNum1);
        painel.getChildren().add(btnNum2);
        painel.getChildren().add(btnNum3);
        painel.getChildren().add(btnNum4);
        painel.getChildren().add(btnNum5);
        painel.getChildren().add(btnNum6);
        painel.getChildren().add(btnNum7);
        painel.getChildren().add(btnNum8);
        painel.getChildren().add(btnNum9);
        painel.getChildren().add(btnNum0);
        
        painel.getChildren().add(btnPlus);
        painel.getChildren().add(btnMinus);
        painel.getChildren().add(btnTimes);
        painel.getChildren().add(btnComma);
        painel.getChildren().add(btnEquals);
        painel.getChildren().add(btnDivided);

        stage.setScene(scn); stage.setTitle("Calculadora JavaFX"); stage.show();
    }

    public static void main(String[] args) {
        Application.launch(CalculadoraFX.class, args);
    }
}