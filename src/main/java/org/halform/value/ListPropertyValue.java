package org.halform.value;

import java.util.List;

public interface ListPropertyValue extends PropertyValue {

    List<PropertyValue> getPropertiesValues();
}
