package chess;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import chessproject.Models.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    public static Stage mystage;
    public static ArrayList<Move> moves = new ArrayList<>();
    public static House[] houses = {null, new House(1, 1, 1), new House(2, 1, 2), new House(3, 1, 3), new House(4, 1, 4),
            new House(5, 1, 5), new House(6, 1, 6), new House(7, 1, 7), new House(8, 1, 8), new House(9, 2, 1),
            new House(10, 2, 2), new House(11, 2, 3), new House(12, 2, 4), new House(13, 2, 5), new House(14, 2, 6),
            new House(15, 2, 7), new House(16, 2, 8), new House(17, 3, 1), new House(18, 3, 2), new House(19, 3, 3),
            new House(20, 3, 4), new House(21, 3, 5), new House(22, 3, 6), new House(23, 3, 7), new House(24, 3, 8),
            new House(25, 4, 1), new House(26, 4, 2), new House(27, 4, 3), new House(28, 4, 4), new House(29, 4, 5),
            new House(30, 4, 6), new House(31, 4, 7), new House(32, 4, 8), new House(33, 5, 1), new House(34, 5, 2),
            new House(35, 5, 3), new House(36, 5, 4), new House(37, 5, 5), new House(38, 5, 6), new House(39, 5, 7),
            new House(40, 5, 8), new House(41, 6, 1), new House(42, 6, 2), new House(43, 6, 3), new House(44, 6, 4),
            new House(45, 6, 5), new House(46, 6, 6), new House(47, 6, 7), new House(48, 6, 8), new House(49, 7, 1),
            new House(50, 7, 2), new House(51, 7, 3), new House(52, 7, 4), new House(53, 7, 5), new House(54, 7, 6),
            new House(55, 7, 7), new House(56, 7, 8), new House(57, 8, 1), new House(58, 8, 2), new House(59, 8, 3),
            new House(60, 8, 4), new House(61, 8, 5), new House(62, 8, 6), new House(63, 8, 7), new House(64, 8, 8),};
    public static String[] backs = new String[]{"white_house.jpg", "black_house.jpg"};
    public static Player[] players = new Player[]{FXMLController.player1, FXMLController.player2};
    public static int turn = 0;
    private String base_images_path = "../images/";
    public static String[][][] images = {{{"pawn_white_white.jpg", "pawn_white_black.jpg"},
            {"pawn_black_white.jpg", "pawn_black_black.jpg"}}, {{"knight_white_white.jpg", "knight_white_black.jpg"},
            {"knight_black_white.jpg", "knight_black_black.jpg"}}, {{"bishop_white_white.jpg", "bishop_white_black.jpg"},
            {"bishop_black_white.jpg", "bishop_black_black.jpg"}}, {{"rock_white_white.jpg", "rock_white_black.jpg"},
            {"rock_black_white.jpg", "rock_black_black.jpg"}}, {{"queen_white_white.jpg", "Queen_white_black.jpg"},
            {"Queen_black_white.jpg", "Queen_black_black.jpg"}}, {{"King_white_white.jpg", "king_white_black.jpg"},
            {"King_black_white.jpg", "King_black_black.jpg"}}};

    //    public static boolean isCheck(){}
//    public static boolean CanCheckRemoved(){}
//    public static boolean Origin_Destination_Check(){}
//    public static boolean hasMated(){}
    public static boolean isAchsen(Piece piece) {
        return false;
    }

    //    public static boolean canRivalMove(//    public static boolean isAchsen(){}
//    public static boolean canRival){}
//    public static void whichAreAchsen(){}
//    public static void changePlayer(){}
    public static ArrayList<Piece> player1_pieces = new ArrayList<>();
    public static ArrayList<Piece> player2_pieces = new ArrayList<>();
    int bar_aval = 0;
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
    @FXML
    private Label Notify;
    @FXML
    private Button undo_btn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void onBtn5(MouseEvent event) {
        houses[5].imageView = btn5;
        process(houses[5]);
    }

    @FXML
    private void onBtn6(MouseEvent event) {
        houses[6].imageView = btn6;
        process(houses[6]);
    }

    @FXML
    private void onBtn4(MouseEvent event) {
        houses[4].imageView = btn4;
        process(houses[4]);
    }

    @FXML
    private void onBtn2(MouseEvent event) {
        houses[2].imageView = btn2;
        process(houses[2]);
    }

    @FXML
    private void onBtn8(MouseEvent event) {
        houses[8].imageView = btn8;
        process(houses[8]);
    }

    @FXML
    private void onBtn1(MouseEvent event) {
        houses[1].imageView = btn1;
        process(houses[1]);
    }

    @FXML
    private void onBtn7(MouseEvent event) {
        houses[7].imageView = btn7;
        process(houses[7]);
    }

    @FXML
    private void onBtn3(MouseEvent event) {
        houses[3].imageView = btn3;
        process(houses[3]);
    }

    @FXML
    private void onBtn63(MouseEvent event) {
        houses[63].imageView = btn63;
        process(houses[63]);
    }

    @FXML
    private void onBtn45(MouseEvent event) {
        houses[45].imageView = btn45;
        process(houses[45]);
    }

    @FXML
    private void onBtn59(MouseEvent event) {
        houses[59].imageView = btn59;
        process(houses[59]);
    }

    @FXML
    private void onBtn20(MouseEvent event) {
        houses[20].imageView = btn20;
        process(houses[20]);
    }

    @FXML
    private void onBtn16(MouseEvent event) {
        houses[16].imageView = btn16;
        process(houses[16]);
    }

    @FXML
    private void onBtn31(MouseEvent event) {
        houses[31].imageView = btn31;
        process(houses[31]);
    }

    @FXML
    private void onBtn64(MouseEvent event) {
        houses[64].imageView = btn64;
        process(houses[64]);
    }

    @FXML
    private void onBtn32(MouseEvent event) {
        houses[32].imageView = btn32;
        process(houses[32]);
    }

    @FXML
    private void onBtn62(MouseEvent event) {
        houses[62].imageView = btn62;
        process(houses[62]);
    }

    @FXML
    private void onBtn19(MouseEvent event) {
        houses[19].imageView = btn19;
        process(houses[19]);
    }

    @FXML
    private void onBtn34(MouseEvent event) {
        houses[34].imageView = btn34;
        process(houses[34]);
    }

    @FXML
    private void onBtn27(MouseEvent event) {
        houses[27].imageView = btn27;
        process(houses[27]);
    }

    @FXML
    private void onBtn29(MouseEvent event) {
        houses[29].imageView = btn29;
        process(houses[29]);
    }

    @FXML
    private void onBtn10(MouseEvent event) {
        houses[10].imageView = btn10;
        process(houses[10]);
    }

    @FXML
    private void onBtn44(MouseEvent event) {
        houses[44].imageView = btn44;
        process(houses[44]);
    }

    @FXML
    private void onBtn11(MouseEvent event) {
        houses[11].imageView = btn11;
        process(houses[11]);
    }

    @FXML
    private void onBtn22(MouseEvent event) {
        houses[22].imageView = btn22;
        process(houses[22]);
    }

    @FXML
    private void onBtn47(MouseEvent event) {
        houses[47].imageView = btn47;
        process(houses[47]);
    }

    @FXML
    private void onBtn28(MouseEvent event) {
        houses[28].imageView = btn28;
        process(houses[28]);
    }

    @FXML
    private void onBtn37(MouseEvent event) {
        houses[37].imageView = btn37;
        process(houses[37]);
    }

    @FXML
    private void onBtn54(MouseEvent event) {
        houses[54].imageView = btn54;
        process(houses[54]);
    }

    @FXML
    private void onBtn26(MouseEvent event) {
        houses[26].imageView = btn26;
        process(houses[26]);
    }

    @FXML
    private void onBtn33(MouseEvent event) {
        houses[33].imageView = btn33;
        process(houses[33]);
    }

    @FXML
    private void onBtn12(MouseEvent event) {
        houses[12].imageView = btn12;
        process(houses[12]);
    }

    @FXML
    private void onBtn48(MouseEvent event) {
        houses[48].imageView = btn48;
        process(houses[48]);
    }

    @FXML
    private void onBtn51(MouseEvent event) {
        houses[51].imageView = btn51;
        process(houses[51]);
    }

    @FXML
    private void onBtn61(MouseEvent event) {
        houses[61].imageView = btn61;
        process(houses[61]);
    }

    @FXML
    private void onBtn38(MouseEvent event) {
        houses[38].imageView = btn38;
        process(houses[38]);
    }

    @FXML
    private void onBtn42(MouseEvent event) {
        houses[42].imageView = btn42;
        process(houses[42]);
    }

    @FXML
    private void onBtn58(MouseEvent event) {
        houses[58].imageView = btn58;
        process(houses[58]);
    }

    @FXML
    private void onBtn49(MouseEvent event) {
        houses[49].imageView = btn49;
        process(houses[49]);
    }

    @FXML
    private void onBtn46(MouseEvent event) {
        houses[46].imageView = btn46;
        process(houses[46]);
    }

    @FXML
    private void onBtn56(MouseEvent event) {
        houses[56].imageView = btn56;
        process(houses[56]);
    }

    @FXML
    private void onBtn43(MouseEvent event) {
        houses[43].imageView = btn43;
        process(houses[43]);
    }

    @FXML
    private void onBtn60(MouseEvent event) {
        houses[60].imageView = btn60;
        process(houses[60]);
    }

    @FXML
    private void onBtn41(MouseEvent event) {
        houses[41].imageView = btn41;
        process(houses[41]);
    }

    @FXML
    private void onBtn17(MouseEvent event) {
        houses[17].imageView = btn17;
        process(houses[17]);
    }

    @FXML
    private void onBtn36(MouseEvent event) {
        houses[36].imageView = btn36;
        process(houses[36]);
    }

    @FXML
    private void onBtn50(MouseEvent event) {
        houses[50].imageView = btn50;
        process(houses[50]);
    }

    @FXML
    private void onBtn52(MouseEvent event) {
        houses[52].imageView = btn52;
        process(houses[52]);
    }

    @FXML
    private void onBtn23(MouseEvent event) {
        houses[23].imageView = btn23;
        process(houses[23]);
    }

    @FXML
    private void onBtn18(MouseEvent event) {
        houses[18].imageView = btn18;
        process(houses[18]);
    }

    @FXML
    private void onBtn13(MouseEvent event) {
        houses[13].imageView = btn13;
        process(houses[13]);
    }

    @FXML
    private void onBtn15(MouseEvent event) {
        houses[15].imageView = btn15;
        process(houses[15]);
    }

    @FXML
    private void onBtn25(MouseEvent event) {
        houses[25].imageView = btn25;
        process(houses[25]);
    }

    @FXML
    private void onBtn30(MouseEvent event) {
        houses[30].imageView = btn30;
        process(houses[30]);
    }

    @FXML
    private void onBtn55(MouseEvent event) {
        houses[55].imageView = btn55;
        process(houses[55]);
    }

    @FXML
    private void onBtn57(MouseEvent event) {
        houses[57].imageView = btn57;
        process(houses[57]);
    }

    @FXML
    private void onBtn9(MouseEvent event) {
        houses[9].imageView = btn9;
        process(houses[9]);
    }

    @FXML
    private void onBtn53(MouseEvent event) {
        houses[53].imageView = btn53;
        process(houses[53]);
    }

    @FXML
    private void onBtn39(MouseEvent event) {
        houses[39].imageView = btn39;
        process(houses[39]);
    }

    @FXML
    private void onBtn40(MouseEvent event) {
        houses[40].imageView = btn40;
        process(houses[40]);
    }

    @FXML
    private void onBtn14(MouseEvent event) {
        houses[14].imageView = btn14;
        process(houses[14]);
    }

    @FXML
    private void onBtn21(MouseEvent event) {
        houses[21].imageView = btn21;
        process(houses[21]);
    }

    @FXML
    private void onBtn24(MouseEvent event) {
        houses[24].imageView = btn24;
        process(houses[24]);
    }

    @FXML
    private void onBtn35(MouseEvent event) {
        houses[35].imageView = btn35;
        process(houses[35]);
    }

    private void process(House house) {
        if (bar_aval == 0) {
            Initalize();
            bar_aval = 1;
        }
        if (players[turn % 2].ChosenPiece == null) {
            if (house.piece != null && house.piece.owner == players[turn % 2] && !isAchsen(house.piece)) {
                System.out.println("Chosen 1 e");
                if (!check_can_move(house.piece)) {
                    return;
                }
                players[turn % 2].ChosenPiece = house.piece;
            }
//            else if (house.piece == null) {
//                System.out.println("Chosen 2 e");
//                players[turn % 2].ChosenPiece = house.piece;
//            }
        } else {
            House origin = players[turn % 2].ChosenPiece.house;
            if (Player.Mate(players[turn % 2])) {
                System.out.println("You are mated");
                return;
            }
            System.out.println(Player.iskish(players[turn % 2]));
            if (!Player.iskish(players[turn % 2]).isEmpty()) {
                System.out.println("You are checked");
            }

            if (origin.piece.Move(origin, house) &&
                    Player.iskish(players[turn % 2]).isEmpty()) {
                if (house.piece == null || house.piece.index != 5) {
                    origin.piece.replace(origin, house);
                    return;
                } else {
                    System.out.println("can't remove king");
                }
            } else if (origin.piece.Move(origin, house) && !Player.iskish(players[turn % 2]).isEmpty()) {
                origin.piece.replace(origin, house);
                if (!Player.iskish(players[turn % 2]).isEmpty()) {
                    System.out.println("undo");
                }
            }else{
                players[turn % 2].ChosenPiece = null;
            }
            System.out.println("Dar Move");
            for (int i = 1; i <= 64; i++) {
                if (houses[i].piece != null) {
                    System.out.print(houses[i].piece.index + " ");
                } else {

                    System.out.print("-1 ");
                }
                if (i % 8 == 0) {
                    System.out.println();
                }
            }
//            for (int i = 1; i < 65; i++) {
//                if (i % 8 == 0) {
//                    System.out.println("");
//                }
//                if (houses[i].imageView == null) {
//                    System.out.print("0 ");
//                } else {
//                    System.out.print(1 + " ");
//                }
//            }
//            turn++;
//            if (Player.iskish(players[turn % 2])) {
//                //Invalid Movement
//
//                Board.Undo(temp);
//            } else {
//                Board.States.add(temp);
//                turn++;
//                //check is Rival's King has mated?
//                if (Player.iskish(FXMLDocumentController.players[turn % 2])) {
//                    //Rivals'King has checked!
//                    if (true) {
//
//                    }
//
//                } else {
//                    //No problem, Go ahead!:)
//                }
//
//            }
        }
    }

    //     private boolean check_can_removed(Player checked_player) {
//        Piece checked_king;
//        for (int i = 0; i < houses.length; i++) {
//            House house = houses[i];
//         }
//        return false;
//    }
    private boolean check_can_move(Piece piece) {
        // with attention to piece, choose columnar or... checking if it can moved?
        return true;
    }

    private void Initalize() {
        for (int i = 0; i < images.length; i++) {
            for (int j = 0; j < images[0].length; j++) {
                for (int k = 0; k < images[0][0].length; k++) {
                    images[i][j][k] = base_images_path + images[i][j][k];
                }
            }
        }
        ImageView imageView;
        for (int i = 49; i <= 56; i++) {
            imageView = new ImageView(new Image(new File(images[0][0][(i + 1) % 2]).toURI().toString()));
            Pawn p = new Pawn(7, i, players[0], imageView, houses[i]);
            houses[i].piece = p;
            player1_pieces.add(p);
        }
        Knight k2 = new Knight(8, 7, players[0], new ImageView(new Image(new File(images[1][0][1]).toURI().toString())), houses[58]);
        player1_pieces.add(k2);
        houses[58].piece = k2;
        System.out.println("OOOOPPP:" + houses[58].piece.index + "," + k2.index);
        System.out.println(houses[58].piece == k2);
        k2 = new Knight(8, 2, players[0], new ImageView(new Image(new File(images[1][0][1]).toURI().toString())), houses[63]);
        player1_pieces.add(k2);
        houses[63].piece = k2;
        Rock r2 = new Rock(8, 1, players[0], new ImageView(new Image(new File(images[3][0][0]).toURI().toString())), houses[64]);
        player1_pieces.add(r2);
        houses[64].piece = r2;
        r2 = new Rock(8, 8, players[0], new ImageView(new Image(new File(images[3][1][0]).toURI().toString())), houses[57]);
        player1_pieces.add(r2);
        houses[57].piece = r2;
        Bishop b2 = new Bishop(8, 3, players[0], new ImageView(new Image(new File(images[2][0][1]).toURI().toString())), houses[59]);
        player1_pieces.add(b2);
        houses[59].piece = b2;
        b2 = new Bishop(8, 6, players[0], new ImageView(new Image(new File(images[2][0][0]).toURI().toString())), houses[62]);
        player1_pieces.add(b2);
        houses[62].piece = b2;
        Queen q2 = new Queen(8, 4, players[0], new ImageView(new Image(new File(images[4][0][0]).toURI().toString())), houses[60]);
        player1_pieces.add(q2);
        houses[60].piece = q2;
        King king2 = new King(8, 5, players[0], new ImageView(new Image(new File(images[5][0][1]).toURI().toString())), houses[61]);
        player1_pieces.add(king2);
        houses[61].piece = king2;
        for (int i = 9; i <= 16; i++) {
            imageView = new ImageView(new Image(getClass()
                    .getResourceAsStream(images[0][1][(i) % 2])));
            Pawn p = new Pawn(2, i, players[1], imageView, houses[i]);
            houses[i].piece = p;
            player2_pieces.add(p);
        }
        Knight k = new Knight(1, 2, players[1], null, houses[2]);
        houses[2].piece = k;
        player2_pieces.add(k);
        k = new Knight(1, 7, players[1], null, houses[7]);
        houses[7].piece = k;
        player2_pieces.add(k);
        Rock r = new Rock(1, 1, players[1], null, houses[1]);
        player2_pieces.add(r);
        houses[1].piece = r;
        r = new Rock(1, 8, players[1], null, houses[8]);
        player2_pieces.add(r);
        houses[8].piece = r;
        Bishop b = new Bishop(1, 3, players[1], null, houses[3]);
        player2_pieces.add(b);
        houses[3].piece = b;
        b = new Bishop(1, 6, players[1], null, houses[6]);
        player2_pieces.add(b);
        houses[6].piece = b;
        Queen q = new Queen(1, 4, players[1], null, houses[4]);
        player2_pieces.add(q);
        houses[4].piece = q;
        King king = new King(1, 5, players[1], null, houses[5]);
        player2_pieces.add(king);
        houses[5].piece = king;
    }

    @FXML
    public void onUndo(MouseEvent event) {
        if (moves.size() < 1) {
            return;
        }
        Move move = moves.get(moves.size() - 1);
        Piece piece = move.des.piece;
        Image image = null;
        try {
            image = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[move.des.piece.index][(FXMLDocumentController.turn + 1) % 2][move.origin.color]));
        } catch (Exception e) {
            System.out.println("ERR:" + FXMLDocumentController.turn + 1 % 2);
        }
        move.origin.imageView.setImage(image);
        move.origin.piece = move.des.piece;
        move.origin.piece.house = move.origin;
        if (move.killed == null) {
            move.des.imageView.setImage(null);
        } else {
            move.killed.house = move.des;
            move.des.piece = move.killed;
            Image image2 = null;
            try {
                image2 = new Image(FXMLDocumentController.class.getResourceAsStream(FXMLDocumentController.images[move.killed.index][(FXMLDocumentController.turn) % 2][move.des.color]));
            } catch (Exception e) {
                System.out.println("ERR:" + FXMLDocumentController.turn + 1 % 2);
                ;
            }
            move.des.imageView.setImage(image2);
        }
        System.out.println("Dar Move");
        for (int i = 1; i <= 64; i++) {
            if (houses[i].piece != null) {
                System.out.print(houses[i].piece.index + " ");
            } else {
                System.out.print("-1 ");
            }
            if (i % 8 == 0) {
                System.out.println("");
            }
        }
        moves.remove(moves.size() - 1);
        turn++;
    }

}