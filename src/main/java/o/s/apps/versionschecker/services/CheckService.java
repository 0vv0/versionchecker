package o.s.apps.versionschecker.services;

import o.s.apps.versionschecker.model.Checkable;
import o.s.apps.versionschecker.model.MyCheck;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public interface CheckService {
    default Map<String, Checkable> getAll(){
        Map<String, Checkable> checkList = new HashMap<>();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.getBeansWithAnnotation(MyCheck.class).forEach((x, y)->checkList.put(x, (Checkable)y));
        return checkList;
    };
}
