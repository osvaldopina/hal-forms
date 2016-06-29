package org.halform.value.impl;

import org.halform.Property;
import org.halform.PropertyList;
import org.halform.value.PropertyValue;

public class PropertyValueFactory {

    public PropertyValue create(Property property) {
        return createPropertyValue(property);
    }

    private PropertyValue createPropertyValue(Property property) {
        PropertyValue propertyValue;
        if (property instanceof PropertyList) {
            PropertyList propertyList = (PropertyList) property;
            ListPropertyValueImpl listPropertyValue = new ListPropertyValueImpl(propertyList);
            for(Property childProperty:propertyList.getProperties()) {
                listPropertyValue.addPropertyValue(createPropertyValue(childProperty));
            }
            if (propertyList.isMulti()) {
                return new ArrayPropertyValueImpl(listPropertyValue);
            }
            else {
                return listPropertyValue;
            }
        }
        else {
            propertyValue = new StringPropertyValueImpl(property);
        }
        return propertyValue;
    }

}
