package org.halform.value;

import org.halform.Property;
import org.halform.action.Action;

import java.util.List;

public interface PropertyValue {

    Property getProperty();

    List<Action> getActions();
}
