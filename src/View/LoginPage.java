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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hassan
 */
public class LoginPage extends Stage {

    public LoginPage() {

        Image image = new Image("file:src/imgs/user.png");
        ImageView logoImageView = new ImageView(image);

        logoImageView.setFitWidth(250);
        logoImageView.setFitHeight(250);

        Label nlabel = new Label("user name");
        TextField nametxt = new TextField();

        Label plabel = new Label("password");
        PasswordField passwordtxt = new PasswordField();

        Label erdr = new Label("");
        erdr.getStyleClass().add("err");

        Button btn = new Button("Login");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (nametxt.getText().equals("user") && passwordtxt.getText().equals("userpass")) {
                        nametxt.setText("");
                        passwordtxt.setText("");
                        erdr.setText("");
                        ViewManager.openConvertionPage();
                        ViewManager.closeLoginPage();
                    } else {
                        nametxt.setText("");
                        passwordtxt.setText("");
                        erdr.setText("ERROR IN USER NAME OR PASSWORD !!");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        nametxt.getStyleClass().add("textfld");
        passwordtxt.getStyleClass().add("textfld");

        VBox v1 = new VBox();
        v1.setSpacing(10);
        v1.setAlignment(Pos.CENTER);
        v1.setPadding(new Insets(20, 70, 40, 70));

        v1.getChildren().addAll(logoImageView, nlabel, nametxt, plabel, passwordtxt, btn, erdr);

        Scene scene = new Scene(v1, 500, 580);
        scene.getStylesheets().add("file:src/css/LoginStyle.css");
        this.setScene(scene);
        this.setTitle("LOGIN");
        this.show();
    }
}
