package firstPage;

import Settings.Settings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        Parent root = FXMLLoader.load(getClass().getResource("firstPage.fxml"));
        primaryStage.setTitle(Settings.getInstance().app_name);

        primaryStage.setScene(new Scene(root, Settings.getInstance().getPref_width(), Settings.getInstance().getPref_height()));
        Settings.getInstance().setStage(primaryStage);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }



}
