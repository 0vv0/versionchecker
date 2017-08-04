package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by admin on 8/4/2017.
 */
public class chrome extends App {
    private final String url = "http://feeds.feedburner.com/GoogleChromeReleases";
    private final String text = "Stable Channel Update for Desktop";
    private final String text2 = "has been updated to ";
    private final String text3 = " for Windows";



    @Override
    public Boolean reCheck() {
        String page = WebReader.readPage(url);
        page = page.substring(page.indexOf(text) + text.length());
        page = page.substring(page.indexOf(text2) + text2.length());
        page = page.substring(0, page.indexOf(text3));
        if(page.length()>0){
            currentVersion = page;
            return true;
        }
        return false;
    }
}

