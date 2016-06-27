package org.halform.action.impl;

import org.halform.Property;
import org.halform.action.GetValueAction;
import org.halform.value.StringPropertyValue;

public class GetValueActionImpl extends  BaseAction implements GetValueAction {

    private StringPropertyValue stringPropertyValue;

    public GetValueActionImpl(Property property, StringPropertyValue stringPropertyValue) {
        super(property);
        this.stringPropertyValue = stringPropertyValue;
    }

    public String getValue() {
        return stringPropertyValue.get();
    }

}
