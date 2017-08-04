package o.s.apps.versionschecker.model;

import java.io.Serializable;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
@MyCheck
public abstract class App implements Checkable,Serializable {
    protected String currentVersion = "";

    @Override
    public String getCurrentVersion() {
        return currentVersion;
    }

}
