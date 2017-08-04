package o.s.apps.versionschecker.model;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Component
public @interface MyCheck {
}
