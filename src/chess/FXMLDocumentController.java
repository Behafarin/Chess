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
    private ImageView btn7;
    @FXML
    private ImageView btn63;
    @FXML
    private ImageView btn45;
    @FXML
    private ImageView btn59;
    @FXML
    private ImageView btn20;
    @FXML
    private ImageView btn16;
    @FXML
    private ImageView btn31;
    @FXML
    private ImageView btn64;
    @FXML
    private ImageView btn32;
    @FXML
    private ImageView btn62;
    @FXML
    private ImageView btn19;
    @FXML
    private ImageView btn34;
    @FXML
    private ImageView btn27;
    @FXML
    private ImageView btn29;
    @FXML
    private ImageView btn10;
    @FXML
    private ImageView btn44;
    @FXML
    private ImageView btn11;
    @FXML
    private ImageView btn22;
    @FXML
    private ImageView btn47;
    @FXML
    private ImageView btn28;
    @FXML
    private ImageView btn37;
    @FXML
    private ImageView btn54;
    @FXML
    private ImageView btn26;
    @FXML
    private ImageView btn33;
    @FXML
    private ImageView btn12;
    @FXML
    private ImageView btn48;
    @FXML
    private ImageView btn51;
    @FXML
    private ImageView btn61;
    @FXML
    private ImageView btn38;
    @FXML
    private ImageView btn42;
    @FXML
    private ImageView btn58;
    @FXML
    private ImageView btn49;
    @FXML
    private ImageView btn46;
    @FXML
    private ImageView btn56;
    @FXML
    private ImageView btn43;
    @FXML
    private ImageView btn60;
    @FXML
    private ImageView btn41;
    @FXML
    private ImageView btn17;
    @FXML
    private ImageView btn36;
    @FXML
    private ImageView btn50;
    @FXML
    private ImageView btn52;
    @FXML
    private ImageView btn23;
    @FXML
    private ImageView btn18;
    @FXML
    private ImageView btn13;
    @FXML
    private ImageView btn15;
    @FXML
    private ImageView btn25;
    @FXML
    private ImageView btn30;
    @FXML
    private ImageView btn55;
    @FXML
    private ImageView btn57;
    @FXML
    private ImageView btn9;
    @FXML
    private ImageView btn53;
    @FXML
    private ImageView btn39;
    @FXML
    private ImageView btn40;
    @FXML
    private ImageView btn14;
    @FXML
    private ImageView btn21;
    @FXML
    private ImageView btn24;
    @FXML
    private ImageView btn35;
 
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

    @FXML
    private void onBtn63(MouseEvent event) {
    }

    @FXML
    private void onBtn45(MouseEvent event) {
    }

    @FXML
    private void onBtn59(MouseEvent event) {
    }

    @FXML
    private void onBtn20(MouseEvent event) {
    }

    @FXML
    private void onBtn16(MouseEvent event) {
    }

    @FXML
    private void onBtn31(MouseEvent event) {
    }

    @FXML
    private void onBtn64(MouseEvent event) {
    }

    @FXML
    private void onBtn32(MouseEvent event) {
    }

    @FXML
    private void onBtn62(MouseEvent event) {
    }

    @FXML
    private void onBtn19(MouseEvent event) {
    }

    @FXML
    private void onBtn34(MouseEvent event) {
    }

    @FXML
    private void onBtn27(MouseEvent event) {
    }

    @FXML
    private void onBtn29(MouseEvent event) {
    }

    @FXML
    private void onBtn10(MouseEvent event) {
    }

    @FXML
    private void onBtn44(MouseEvent event) {
    }

    @FXML
    private void onBtn11(MouseEvent event) {
    }

    @FXML
    private void onBtn22(MouseEvent event) {
    }

    @FXML
    private void onBtn47(MouseEvent event) {
    }

    @FXML
    private void onBtn28(MouseEvent event) {
    }

    @FXML
    private void onBtn37(MouseEvent event) {
    }

    @FXML
    private void onBtn54(MouseEvent event) {
    }

    @FXML
    private void onBtn26(MouseEvent event) {
    }

    @FXML
    private void onBtn33(MouseEvent event) {
    }

    @FXML
    private void onBtn12(MouseEvent event) {
    }

    @FXML
    private void onBtn48(MouseEvent event) {
    }

    @FXML
    private void onBtn51(MouseEvent event) {
    }

    @FXML
    private void onBtn61(MouseEvent event) {
    }

    @FXML
    private void onBtn38(MouseEvent event) {
    }

    @FXML
    private void onBtn42(MouseEvent event) {
    }

    @FXML
    private void onBtn58(MouseEvent event) {
    }

    @FXML
    private void onBtn49(MouseEvent event) {
    }

    @FXML
    private void onBtn46(MouseEvent event) {
    }

    @FXML
    private void onBtn56(MouseEvent event) {
    }

    @FXML
    private void onBtn43(MouseEvent event) {
    }

    @FXML
    private void onBtn60(MouseEvent event) {
    }

    @FXML
    private void onBtn41(MouseEvent event) {
    }

    @FXML
    private void onBtn17(MouseEvent event) {
    }

    @FXML
    private void onBtn36(MouseEvent event) {
    }

    @FXML
    private void onBtn50(MouseEvent event) {
    }

    @FXML
    private void onBtn52(MouseEvent event) {
    }

    @FXML
    private void onBtn23(MouseEvent event) {
    }

    @FXML
    private void onBtn18(MouseEvent event) {
    }

    @FXML
    private void onBtn13(MouseEvent event) {
    }

    @FXML
    private void onBtn15(MouseEvent event) {
    }

    @FXML
    private void onBtn25(MouseEvent event) {
    }

    @FXML
    private void onBtn30(MouseEvent event) {
    }

    @FXML
    private void onBtn55(MouseEvent event) {
    }

    @FXML
    private void onBtn57(MouseEvent event) {
    }

    @FXML
    private void onBtn9(MouseEvent event) {
    }

    @FXML
    private void onBtn53(MouseEvent event) {
    }

    @FXML
    private void onBtn39(MouseEvent event) {
    }

    @FXML
    private void onBtn40(MouseEvent event) {
    }

    @FXML
    private void onBtn14(MouseEvent event) {
    }

    @FXML
    private void onBtn21(MouseEvent event) {
    }

    @FXML
    private void onBtn24(MouseEvent event) {
    }

    @FXML
    private void onBtn35(MouseEvent event) {
    }
    
 
 
    
}
