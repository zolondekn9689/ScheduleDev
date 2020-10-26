package firstPage;

import Settings.Settings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;

import java.io.IOException;

public class firstPageController extends ControllerPage
{
    public GridPane calendarView;
    public BorderPane firstPane;
    private Settings settings;
    public ListView employeeListView;

    @Override
    public void initPageSize(BorderPane pane) {
        super.initPageSize(pane);
    }

    public void initialize()
    {
        settings = Settings.getInstance();
        initPageSize(firstPane);

        // Get dimensions.
        Rectangle2D primaryScreen = Screen.getPrimary().getVisualBounds();

        //Set up list view.
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");
        employeeListView.getItems().add("Nick");
        employeeListView.getItems().add("John");
        employeeListView.getItems().add("Ron");

        // Load the calendar view.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/CalendarAPI/CalendarView.fxml"));
        
        try {
            calendarView.setVisible(false);
            firstPane.setCenter(loader.load());
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }




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


    /**
     * @TODO Add the screen that will add the person to the panel.
     */
    public void actionAdd()
    {
    }



    public void actionRemove()
    {

        Object object = employeeListView.getSelectionModel().getSelectedItem();
        employeeListView.getItems().remove(object);
    }
}
