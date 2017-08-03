package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public class JavaCheck extends App {
    private String url = "https://java.com/en/download/";
    private String tag = "h4";

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
