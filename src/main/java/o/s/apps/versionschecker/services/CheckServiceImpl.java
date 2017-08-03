package o.s.apps.versionschecker.services;

import o.s.apps.versionschecker.model.*;
import o.s.apps.versionschecker.model.check.DbVisualizer;
import o.s.apps.versionschecker.model.check.JavaCheck;
import o.s.apps.versionschecker.model.check.CDBurnerXP;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
@Service
public class CheckServiceImpl implements CheckService {
    @Bean
    Checkable java(){
        return new JavaCheck();
    }
    @Bean
    Checkable cdburnerXP(){
        return new CDBurnerXP();
    }
    @Bean
    Checkable dbvisualizer(){return new DbVisualizer();}

    @Override
    public Map<String, Checkable> getAll() {
        Map<String, Checkable> checkList = new HashMap<>();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.getBeansWithAnnotation(MyCheck.class).forEach((x,y)->checkList.put(x, (Checkable)y));
        return checkList;
    }
}
