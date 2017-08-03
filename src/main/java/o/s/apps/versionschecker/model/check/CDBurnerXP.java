package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public class CDBurnerXP extends App {
    private final String url = "https://cdburnerxp.se/en/download";
    private final String tag = "small";

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
