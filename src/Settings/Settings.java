package Settings;

/**
 * @author Zolondek
 * Add all settings in here.
 */
public class Settings {

    /**
     * This will store the single instance.
     */
    private static Settings single_instance = null;


    private Settings()
    {
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


}
