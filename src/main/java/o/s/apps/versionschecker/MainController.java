package o.s.apps.versionschecker;

import o.s.apps.versionschecker.model.Checkable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private Map<String, Checkable> checks;
    @RequestMapping("")
    @ResponseBody
    String index(){
        String temp = "<table border=2>";
        checks.forEach((x, y) -> {
            try {
                y.reCheck();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        });

        for (String s : checks.keySet()) {
            temp+= "<tr><td>" + s + "</td><td>" + checks.get(s).getCurrentVersion() + "</td></tr>";
        }
        temp+="</table>";

        return temp;
    }
}
