package o.s.apps.versionschecker.model.check;

import o.s.apps.versionschecker.model.App;
import o.s.apps.versionschecker.model.WebReader;

/**
 * Created by admin on 8/4/2017.
 */
public class SevenZip extends App{
        private final String url = "http://www.7-zip.org/download.html";
        private final String text = "Download 7-Zip ";

        @Override
        public Boolean reCheck() {
            String page = WebReader.readPage(url);
            page = page.substring(page.indexOf(text)+text.length());
            page = page.substring(0, page.indexOf("</"));
            if(page.length()>0){
                currentVersion = page;
                return true;
            }
            return false;
        }


}
