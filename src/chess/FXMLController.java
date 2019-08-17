/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import chessproject.Models.Player;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Launcher
 */
public class FXMLController implements Initializable {
    public static Player player1,player2;
    public static Stage mystage;
    @FXML
    private TextField name_txt1;
    @FXML
    private TextField name_txt2;
    @FXML
    private Button StartBtn;
    @FXML
    private Button exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onStart(MouseEvent event) throws IOException {
        if (name_txt1.getText().length() < 2) {
            return;
        }

        if (name_txt2.getText().length() < 2) {
            return;
        }
        player1 = new Player(name_txt1.getText());
        player2 = new Player(name_txt2.getText());
        Parent p = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Chess");
        stage.setScene(new Scene(p));
        stage.show();
        FXMLDocumentController.mystage = stage;
        mystage.hide();
    }

    @FXML
    private void onExit(MouseEvent event) {
        System.exit(1);
    }

}
