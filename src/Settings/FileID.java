package Settings;

import java.util.Locale;

public class FileID {
    private int ID;
    private String fileName;
    private String fileNameWithoutExtension;
    private String filePackagePath;


    public FileID(String fileName, String filePackagePath, int id) {
        this.ID = id; //generateID();
        this.fileName = fileName;
        setFileNameWithoutExtension(fileName);
        this.filePackagePath = filePackagePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileNameWithoutExtension() {
        return fileNameWithoutExtension;
    }

    public String getFilePackagePath() {
        return filePackagePath;
    }

    private void setFileNameWithoutExtension(String fileName) {
        StringBuilder builder = new StringBuilder();

        if (fileName.contains(".fxml"))
        {
            for (int i = 0; i < fileName.length() - 5; i++)
            {
                builder.append(fileName.charAt(i));
            }
            this.fileNameWithoutExtension = builder.toString();

        }
    }

    private int generateID() {
        return Settings.getInstance().assignFileID();
    }

    protected int getID() {
        return this.ID;
    }
}
