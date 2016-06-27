package org.halform.action.impl;

import org.halform.Property;
import org.halform.action.SetValueAction;
import org.halform.value.StringPropertyValue;

public class SetValueActionImpl extends  BaseAction implements SetValueAction {

    private StringPropertyValue stringPropertyValue;

    public SetValueActionImpl(Property property, StringPropertyValue stringPropertyValue) {
        super(property);
        this.stringPropertyValue = stringPropertyValue;
    }

    public void setValue(String value) {
        stringPropertyValue.set(value);
    }
}
