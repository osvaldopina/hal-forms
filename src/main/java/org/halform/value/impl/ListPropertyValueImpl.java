package org.halform.value.impl;

import org.halform.Property;
import org.halform.PropertyList;
import org.halform.action.Action;
import org.halform.value.ListPropertyValue;
import org.halform.value.PropertyValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPropertyValueImpl extends BasePropertyValue implements ListPropertyValue {

    private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();

    public ListPropertyValueImpl(PropertyList propertyList) {
        super(propertyList);
    }

    public List<PropertyValue> getPropertiesValues() {
        return Collections.unmodifiableList(propertyValues);
    }

    public List<Action> getActions() {
        return Collections.emptyList();
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValues.add(propertyValue);
    }

    public PropertyValue duplicate() {
        ListPropertyValue replicated = new ListPropertyValueImpl((PropertyList) getProperty());
        for(PropertyValue propertyValue:getPropertiesValues()) {
            replicated.addPropertyValue(propertyValue.duplicate());
        }
        return replicated;
    }
}
