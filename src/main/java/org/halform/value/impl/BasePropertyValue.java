package org.halform.value.impl;

import org.halform.Property;
import org.halform.value.PropertyValue;

public abstract class BasePropertyValue implements PropertyValue {

    private Property property;

    public BasePropertyValue(Property property) {
        this.property = property;
    }

    public Property getProperty() {
        return property;
    }
}
