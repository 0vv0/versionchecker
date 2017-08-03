package o.s.apps.versionschecker.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public class WebReader {
    private String url;


    public WebReader(String url){
        this.url = url;
    }

    public String read(){
        return read(url);
    }
    public static String read(String url){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String inputLine;
            StringBuilder buffer = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                buffer.append(inputLine);
            }
            in.close();
            return buffer.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String getVersionByTag(String url, String tag){
        String version = "";
        String html = read(url);

        if (html.contains("<" + tag)) {
            html = html.substring(html.indexOf("<" + tag) + 1 + tag.length());
            html = html.substring(html.indexOf(">"));
            version = html.substring(1, html.indexOf("</"));
        }
        return version;
    }
}
