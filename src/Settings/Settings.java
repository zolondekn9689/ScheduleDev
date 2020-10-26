package Settings;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Zolondek
 * Add all settings in here.
 */
public class Settings {


    // For keeping the name of the app.
    public static final String app_name = "Z-Neurith Tech Systems";
    private static Stage stage = null;
    private static int gen_file_id = 1;
    public Stage currentPopUpWindow;

    /**
     * This will store the single instance.
     */
    private static Settings single_instance = null;

    // Dimensions for the screen.
    private static final double SCREEN_WIDTH = Screen.getPrimary().getVisualBounds().getWidth();
    private static final double SCREEN_HEIGHT = Screen.getPrimary().getVisualBounds().getHeight();
    private static double pref_height = 700;
    private static double pref_width = 1000;
    private static PackageDirectory directory = new PackageDirectory();

    private Settings()
    {
        // id 1
        directory.addFile("firstPage.fxml", "/firstPage/firstPage.fxml");
        directory.addFile("calendarBuilderPage.fxml", "/calendarBuilderPage/calendarBuilderPage.fxml"); //id: 2
        directory.addFile("EmployeeInfoPage.fxml", "/EmployeeInfoPage/EmployeeInfoPage.fxml"); // id: 3
        directory.addFile("EmployeeRelationPage.fxml", "/EmployeeRelationPage/EmployeeRelationPage.fxml"); //id: 4
        directory.addFile("Settings.fxml", "/SettingsDialog/Settings.fxml"); // id: 5
    }



    /**
     * Gets the instance of Settings.Preference.
     * @return
     */
    public static Settings getInstance()
    {
        if (single_instance == null)
        {
            single_instance = new Settings();
        }
        return single_instance;
    }



    public void setPref_height(double height)
    {
        pref_height = height;
    }

    public void setPref_width(double width)
    {
        pref_width = width;
    }

    public double getPref_height()
    {
        return pref_height;
    }

    public double getPref_width()
    {
        return pref_width;
    }

    public void setStage(Stage window) {
        stage = window;
    }

    public Stage getStage()
    {
        return stage;
    }

    public void setScene(FileID file)
    {

        try {
            Parent pane = FXMLLoader.load(getClass().getResource(file.getFilePackagePath()));

            Scene scene = new Scene(pane);
            getStage().setScene(scene);
        } catch (IOException e) {

        }


    }




    /**
     * Used to generate a file Id for FileID class.
     * @return the id.
     */
    public int assignFileID()
    {
        gen_file_id = gen_file_id + 1;
        return gen_file_id - 1;
    }


    public static PackageDirectory getDirectory() {
        return directory;
    }




}
