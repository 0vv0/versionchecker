package o.s.apps.versionschecker.model;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public interface Checkable {
    String getCurrentVersion();
    Boolean reCheck();
}
