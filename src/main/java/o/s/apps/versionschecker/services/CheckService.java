package o.s.apps.versionschecker.services;

import o.s.apps.versionschecker.model.Checkable;

import java.util.Map;

/**
 * Created by Oleksii.Sergiienko on 03.08.2017.
 */
public interface CheckService {
    Map<String, Checkable> getAll();
}
