package chess;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import chessproject.Models.*;

public class FXMLDocumentController implements Initializable {
 
    public static Stage mystage;
    @FXML
    private ImageView btn5;
    @FXML
    private ImageView btn6;
    @FXML
    private ImageView btn4;
    @FXML
    private ImageView btn2;
    @FXML
    private ImageView btn8;
    @FXML
    private ImageView btn3;
    @FXML
    private ImageView btn1;
    @FXML
    private ImageView label;
    @FXML
    private ImageView btn7;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
//    public static boolean isCheck(){}
//    public static boolean CanCheckRemoved(){}
//    public static boolean Origin_Destination_Check(){}
//    public static boolean hasMated(){}
//    public static boolean isAchsen(){}
//    public static boolean canRivalMove(){}
//    public static void whichAreAchsen(){}
//    public static void changePlayer(){}
    ArrayList<Piece> pieces = new ArrayList<>();
    Piece p = new King();
    
    @FXML
    private void onBtn5(MouseEvent event) {
    }

    @FXML
    private void onBtn6(MouseEvent event) {
    }

    @FXML
    private void onBtn4(MouseEvent event) {
    }

    @FXML
    private void onBtn2(MouseEvent event) {
    }

    @FXML
    private void onBtn8(MouseEvent event) {
    }


    @FXML
    private void onBtn1(MouseEvent event) {
    }

    @FXML
    private void onBtn7(MouseEvent event) {
    }

    @FXML
    private void onBtn3(MouseEvent event) {
    }
    
 
 
    
}
