package sample;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.stage.*;
import org.codehaus.groovy.runtime.dgmimpl.arrays.ObjectArrayPutAtMetaMethod;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        ObservableList list = root.getChildren();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
