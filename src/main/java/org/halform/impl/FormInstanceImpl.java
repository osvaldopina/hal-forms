package org.halform.impl;

import org.halform.FormInstance;
import org.halform.FormTemplate;
import org.halform.Property;
import org.halform.PropertyList;
import org.halform.value.PropertyValue;
import org.halform.value.StringPropertyValue;
import org.halform.value.impl.StringPropertyValueImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormInstanceImpl implements FormInstance {

    List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();


    public FormInstanceImpl(FormTemplate template) {
        for(Property property :template.getProperties()) {
            addProperty(propertyValues, property);
        }
    }

    private void addProperty(List<PropertyValue> propertyValues, Property property) {
        if (property instanceof PropertyList) {
            throw new IllegalStateException("Not yet implemented!");
        }
        else {
            propertyValues.add(new StringPropertyValueImpl(property));
        }
    }

    public List<PropertyValue> getPropertiesValues() {
        return Collections.unmodifiableList(propertyValues);
    }
}
