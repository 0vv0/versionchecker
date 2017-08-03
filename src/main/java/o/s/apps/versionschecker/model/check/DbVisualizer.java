package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public class DbVisualizer extends App {
    private final String url = "https://www.dbvis.com/download/";
    private final String tag = "h1";
    @Override
    public Boolean reCheck() {
        String version = WebReader.getVersionByTag(url, tag);
        if(version.length()>0){
            currentVersion = version;
            return true;
        }
        return false;
    }
}
