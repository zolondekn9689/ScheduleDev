package calendarBuilderPage;

import Settings.Settings;
import Settings.Settings.*;
import firstPage.ControllerPage;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class calendarBuilderPage extends ControllerPage
{
    @FXML
    public BorderPane calendarPane;

    // The settings are available for this page.
    private Settings settings;

    public void initialize()
    {
        settings = Settings.getInstance();
        calendarPane.setPrefHeight(settings.getPref_height());
        calendarPane.setPrefWidth(settings.getPref_width());
    }

    @Override
    public void menuActionEmployeeInfo(ActionEvent event) throws IOException {
        super.menuActionEmployeeInfo(event);
    }

    @Override
    public void menuActionCal(Event e) throws IOException {
        super.menuActionCal(e);
    }

    @Override
    public void menuActionEmployeeChart(ActionEvent event) throws IOException {
        super.menuActionEmployeeChart(event);
    }

    @Override
    public void menuActionHome(ActionEvent event) throws IOException {
        super.menuActionHome(event);
    }
}
