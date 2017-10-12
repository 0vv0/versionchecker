package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by admin on 8/4/2017.
 */
public class Ghostscript extends App {
    private final String url = "ghostscript.com/Releases.html";
    private final String text = "Ghostscript_";
    private final String text2 = "Ghostscript ";

    @Override
    public Boolean reCheck(){
        String page = WebReader.readPage(url);
        System.out.println(page.length());
        page = page.substring(page.indexOf(text));
        page = page.substring(page.indexOf(text2) + text2.length());
        page = page.substring(0, page.indexOf("</"));

        String version = page;
        if (version.length() > 0) {
            currentVersion = version;
            return true;
        }
        return false;
    }
}
