/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hassan
 */
public class ConversionPage extends Stage {

    Label erdr = new Label();

    public ConversionPage() {
        Label title = new Label("Currency Conversion System");
        Button logout = new Button("Log out");
        HBox h1 = new HBox(200, title, logout);
        h1.setPadding(new Insets(20));
        h1.getStyleClass().add("t1");
        h1.setAlignment(Pos.CENTER);
        logout.getStyleClass().add("lo");
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewManager.openLoginPage();
                ViewManager.closeConvertionPage();

            }

        });

        Label usd = new Label("USD");
        Label nis = new Label("NIS");
        HBox h2 = new HBox(190, usd, nis);
        h2.setPadding(new Insets(5));
        h2.setAlignment(Pos.CENTER);

        TextField usdtext = new TextField();
        Label to = new Label("TO");
        TextField nistext = new TextField();
        HBox h3 = new HBox(20, usdtext, to, nistext);
        h3.setPadding(new Insets(5));
        h3.setAlignment(Pos.CENTER);

        VBox hs = new VBox(h2, h3);

        erdr.getStyleClass().add("err");
        HBox er = new HBox(erdr);
        er.setAlignment(Pos.CENTER);
        Button convert = new Button("Convert");
        Button reset = new Button("Reset");
        HBox hbtn = new HBox(10, convert, reset);
        hbtn.setAlignment(Pos.CENTER);

        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                usdtext.setText("");
                nistext.setText("");
                erdr.setText("");
            }
        });

        convert.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(usdtext.getText().isEmpty()) && nistext.getText().isEmpty()) {

                    Double usd = Double.parseDouble(usdtext.getText());
                    Double nis = usd * 3.66;
                    String x = String.valueOf(nis);
                    nistext.setText(x);
                } else if (!(nistext.getText().isEmpty()) && usdtext.getText().isEmpty()) {

                    Double nis = Double.parseDouble(nistext.getText());
                    Double usd = nis * 0.273224044;
                    String x = String.valueOf(usd);
                    usdtext.setText(x);
                } else if (!(nistext.getText().isEmpty()) && !(usdtext.getText().isEmpty())) {
                    erdr.setText("Please Enter Number Just in One Field");

                }
            }
        });

        VBox v1 = new VBox(50, h1, hs, hbtn, er);

        Scene scene = new Scene(v1, 500, 400);
        scene.getStylesheets().add("file:src/css/conversionStyle.css");
        this.setScene(scene);
        this.setTitle("Currency Change System");
        this.show();
    }
}
