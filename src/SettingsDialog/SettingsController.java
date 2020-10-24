package SettingsDialog;

import Settings.Settings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class SettingsController {
    public BorderPane settingsPane;
    public TextField curScene;
    public Label appName;
    private Settings settings;
    public Label titleName;

    public void initialize()
    {
        settings = Settings.getInstance();
        appName.setText(settings.app_name);

    }

    @FXML
    public void onClose()
    {
        Settings.getInstance().currentPopUpWindow.close();
    }




}
