package org.halform.value;

import org.halform.action.Action;

import java.util.Collections;
import java.util.List;

public interface ListPropertyValue extends PropertyValue {

    List<PropertyValue> getPropertiesValues();

    void addPropertyValue(PropertyValue propertyValue);

}
