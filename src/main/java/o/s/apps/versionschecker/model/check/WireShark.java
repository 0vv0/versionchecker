package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by Oleksii.Sergiienko on 08.08.2017.
 */
public class WireShark extends App {
    private final String url = "https://www.wireshark.org/#download";
    private final String text ="Stable Release (";

    @Override
    public Boolean reCheck() {
        String page = WebReader.readPage(url);
        page = page.substring(page.indexOf(text) + text.length());
        page = page.substring(0, page.indexOf(")"));
        String version = page;
        if(version.length()>0){
            currentVersion = version;
            return true;
        }
        return false;
    }
}
