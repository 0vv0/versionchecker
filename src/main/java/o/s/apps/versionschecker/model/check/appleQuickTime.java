package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by admin on 8/4/2017.
 */
public class appleQuickTime extends App {
    private final String url = "https://support.apple.com/en-us/HT201222";
    private final String tag = "table";
    private final String text ="QuickTime ";

    @Override
    public Boolean reCheck() {
        String table = WebReader.readPage(url);
        table = table.substring(table.indexOf("<" + tag));
        table = table.substring(table.indexOf(">"));
        table = table.substring(table.indexOf(text) + text.length());
        table = table.substring(0, table.indexOf("</"));
        String version = table;
        if(version.length()>0){
            currentVersion = version;
            return true;
        }
        return false;
    }
}
