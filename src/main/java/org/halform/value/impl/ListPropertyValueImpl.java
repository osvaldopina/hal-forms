package org.halform.value.impl;

import org.halform.Property;
import org.halform.PropertyList;
import org.halform.action.Action;
import org.halform.value.ListPropertyValue;
import org.halform.value.PropertyValue;

import java.util.Collections;
import java.util.List;

public class ListPropertyValueImpl extends BasePropertyValue implements ListPropertyValue {

    public ListPropertyValueImpl(PropertyList propertyList) {
        super(propertyList);

    }

    public List<PropertyValue> getPropertiesValues() {
        return null;
    }

    public List<Action> getActions() {
        return Collections.emptyList();
    }
}
