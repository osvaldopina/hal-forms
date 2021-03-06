package org.halform.value.impl;

import org.halform.Property;
import org.halform.action.Action;
import org.halform.action.impl.BaseAction;
import org.halform.action.impl.GetValueActionImpl;
import org.halform.action.impl.SetValueActionImpl;
import org.halform.value.PropertyValue;
import org.halform.value.StringPropertyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPropertyValueImpl extends BasePropertyValue implements StringPropertyValue {

    private String value;

    private List<Action> actions = new ArrayList<Action>();

    public StringPropertyValueImpl(Property property) {
        super(property);
        actions.add(new GetValueActionImpl(property, this));
        actions.add(new SetValueActionImpl(property, this));
    }

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }

    public List<Action> getActions() {
        return Collections.unmodifiableList(actions);
    }

    public PropertyValue duplicate() {
        return new StringPropertyValueImpl(getProperty());
    }
}
