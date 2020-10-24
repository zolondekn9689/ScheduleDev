package Settings;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class PackageDirectory
{
    private int lastKey = 1;
    private HashMap<Integer, FileID> directory;
    private ArrayList<Integer> keys;


    public PackageDirectory() {
         directory = new HashMap<Integer, FileID>();
         keys = new ArrayList<>();
    }


    public void printAllInfo()
    {
        for (int i = 0; i < keys.size(); i++) {
            String fileName = directory.get(keys.get(i)).getFileNameWithoutExtension();
            System.out.println(fileName + " - key: " + keys.get(i));
        }
    }

    /**
     *
     * @return
     */
    public FileID[] getAllFiles()
    {
        final int SIZE = keys.size();
        FileID files[] = new FileID[SIZE];


        for (int i = 0; i < keys.size(); i++)
        {
            files[i] = directory.get(keys.get(i));
        }


        return files;
    }

    public void addFile(String name, String path)
    {
        FileID fileID = new FileID(name, path, lastKey);
        lastKey++;
        keys.add(fileID.getID());
        directory.put(fileID.getID(), fileID);
    }

    /**
     *
     * @param fullPageName full name of the fxml file with extension.
     * @return directory. Null if there does not exist a file in the directory.
     */
    public FileID find(String fullPageName)
    {
        for (int i = 1; i < keys.size(); i++) {
            if(directory.get(i).getFileName().equals(fullPageName)) {
                return directory.get(i);
            }
        }
        return null;
    }

    public FileID getFileByID(int id) {
        return directory.get(id);
    }


    public Scene getScene(int id)
    {
        try {


            String location = getFileByID(id).getFilePackagePath();
            Parent pane = FXMLLoader.load(getClass().getResource(location));
            Scene scene = new Scene(pane);
            return scene;
        } catch (IOException e) {

        }
        return null;
    }

}
