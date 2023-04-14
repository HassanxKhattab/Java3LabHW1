/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import View.ViewManager;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Hassan
 */
public class NewMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        ViewManager.openLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
