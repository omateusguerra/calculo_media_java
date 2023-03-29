package com.example.soft_media;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public void start (Stage primaryStage) throws Exception{
        AnchorPane layout = new AnchorPane();
        layout.setPrefSize(400, 300);
        TextField tfNome = new TextField();
        TextField tfNota1 = new TextField();
        TextField tfNota2 = new TextField();
        Label lbNome = new Label("Nome: ");
        Label lbMedia = new Label("Média: ");
        Label lbSituacao = new Label("Situação");

        Button btnCalcular = new Button("Calcular");

        layout.getChildren().addAll(tfNome, tfNota1, tfNota2, lbNome, lbMedia, lbSituacao, btnCalcular);

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();

        tfNome.setLayoutX(10);
        tfNome.setLayoutY(10);

        tfNota1.setLayoutX(10);
        tfNota1.setLayoutY(tfNome.getHeight() + tfNome.getLayoutY() + 10);

        tfNota2.setLayoutX(10);
        tfNota2.setLayoutY(tfNota1.getHeight() + tfNota1.getLayoutY() + 10);

        lbNome.setLayoutY(tfNome.getLayoutY());
        lbNome.setLayoutX(tfNome.getLayoutX() + tfNome.getWidth() + 10);

        lbMedia.setLayoutY(tfNota1.getLayoutY());
        lbMedia.setLayoutX(tfNota1.getLayoutX() + tfNota1.getWidth() + 10);

        lbSituacao.setLayoutY(tfNota2.getLayoutY());
        lbSituacao.setLayoutX(tfNota2.getLayoutX() + tfNota2.getWidth() + 10);

        btnCalcular.setLayoutX(10);
        btnCalcular.setLayoutY(tfNota2.getHeight() + tfNota2.getLayoutY() + 10);

        btnCalcular.setOnAction(e -> {
            String nome = tfNome.getText();
            float n1 = Float.parseFloat(tfNota1.getText());
            float n2 = Float.parseFloat(tfNota2.getText());

            float media = (n1+n2)/2;

            String situacao = "";
            if (media<4){
                situacao = "Reprovado!";
            }else if(media<7){
                situacao = "Recuperação!";
            }else{
                situacao = "Aprovado!";
            }

            lbNome.setText("Nome: " + nome);
            lbMedia.setText("Media: " + media);
            lbSituacao.setText("Situação: " + situacao);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}