package firstPage;

import Settings.Settings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Settings.FileID;

import java.awt.*;
import java.io.IOException;

/**
 * Purpose of this class is to outline all the methods that are
 * shared with each of the controllers.
 */
public class ControllerPage {
    private Settings settings;




    protected ControllerPage()
    {
        settings = Settings.getInstance();
    }



    public void initPageSize(BorderPane pane)
    {
        pane.setPrefHeight(settings.getPref_height());
        pane.setPrefWidth(settings.getPref_width());
    }

    /**
     * Menu action for employee info.
     * @param event
     * @throws IOException
     */
    public void menuActionEmployeeInfo(ActionEvent event) throws IOException {
        // The location of the calendarBuilderPage.fxml.
        String location = "/EmployeeInfoPage/EmployeeInfoPage.fxml";
        settings.setScene(settings.getDirectory().getFileByID(3));
    }


    /**
     * Changes to the calendar development page.
     * @param e
     * @throws IOException
     */
    public void menuActionCal(Event e) throws IOException
    {
        settings.setScene(settings.getDirectory().getFileByID(2));
    }

    /**
     * Changes to the Employee Chart page.
     * @param event
     * @throws IOException
     */
    public void menuActionEmployeeChart(ActionEvent event) throws IOException {
        // The location of the calendarBuilderPage.fxml.
        String location = "/EmployeeRelationPage/EmployeeRelationPage.fxml";

        settings.setScene(settings.getDirectory().getFileByID(4));
    }


    /**
     * Changes to the home page.
     * @param event
     * @throws IOException
     */
    public void menuActionHome(ActionEvent event)  throws IOException
    {
        settings.setScene(settings.getDirectory().getFileByID(1));
    }

    public void menuActionSettings() throws IOException
    {
        final Stage dialog = new Stage(StageStyle.DECORATED);
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(settings.getStage());
        Scene scene = settings.getDirectory().getScene(5);

        settings.currentPopUpWindow = dialog;
        dialog.setScene(scene);
        dialog.show();
    }


}
