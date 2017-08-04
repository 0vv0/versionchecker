package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by admin on 8/4/2017.
 */
public class VLC extends App {
    private final String url = "http://www.videolan.org/vlc/download-windows.html";
    private final String id = "downloadVersion";

    @Override
    public Boolean reCheck(){
        String page = WebReader.readPage(url);
        page = page.substring(page.indexOf(id));
        page = page.substring(page.indexOf(">"));
        page = page.substring(1, page.indexOf("</"));

        String version = page;
        if (version.length() > 0) {
            currentVersion = version;
            return true;
        }
        return false;
    }
}
