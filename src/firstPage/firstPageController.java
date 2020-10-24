package firstPage;

import Settings.Settings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class firstPageController extends ControllerPage
{
    public BorderPane firstPane;
    private Settings settings;

    @Override
    public void initPageSize(BorderPane pane) {
        super.initPageSize(pane);
    }

    public void initialize()
    {
        settings = Settings.getInstance();
        //double height = settings.getPref_height();
        //double width = settings.getInstance().getPref_width();
        //firstPane.setPrefWidth(width);
        //firstPane.setPrefHeight(height);
        initPageSize(firstPane);
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

    @Override
    public void menuActionSettings() throws IOException {
        super.menuActionSettings();
    }
}
