package org.halform.action.impl;

import org.halform.Property;
import org.halform.action.Action;

/**
 * Created by deinf.osvaldo on 24/06/2016.
 */
public class BaseAction implements Action {

    private Property property;

    public BaseAction(Property property) {
        this.property = property;
    }

    public Property getProperty() {
        return property;
    }
}
