package EmployeeInfoPage;

import Settings.Settings;
import firstPage.ControllerPage;
import javafx.event.ActionEvent;
import javafx.event.Event;

import java.io.IOException;

public class EmployeeInfoPageController extends ControllerPage {
    // Will be used for alot of things.
    private Settings settings;


    public void initialize() {
        settings = Settings.getInstance();

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
