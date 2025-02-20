packages MyJavaFXApplication;

import java.io.FileInputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBox extends Application
{
@Override
public void start (Stage primaryStage)throws Exception
{
    HBox root = new HBox();
    Label L=new Label ("Select Your Colour");
    CheckBox ch1 = new CheckBox("Red");
    Scene scene = new Scene(root,400,100);
    root.getChildren().addAll(L,ch1);
    primaryStage.setTitle("CheckBox Demo");
    primaryStage.setScene(scene);
    primaryStage.show();   
}
public static void main(String[]args){
    launch(args);
}
}