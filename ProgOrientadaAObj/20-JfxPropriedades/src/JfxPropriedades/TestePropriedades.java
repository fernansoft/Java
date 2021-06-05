package JfxPropriedades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TestePropriedades {
    public static void main(String[] args) {
        StringProperty titulo = new SimpleStringProperty("");

//        titulo.addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                System.out.println("O titulo foi mudado de: " + oldValue + " -- Para: " + newValue);
//            }
//        });

        titulo.addListener((observable, antigo, novo) -> {
            System.out.println("O titulo foi mudado de: " + antigo + " -- Para: " + novo);
        });

        titulo.set("Green Mile");
        titulo.set("Código Limpo");
        titulo.set("O Guia do Mochileiro das Galáxias");
    }
}
