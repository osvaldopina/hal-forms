package org.halform.value.impl;

import org.halform.action.Action;
import org.halform.value.ArrayPropertyValue;
import org.halform.value.ListPropertyValue;
import org.halform.value.PropertyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPropertyValueImpl extends BasePropertyValue implements ArrayPropertyValue {

    ListPropertyValue template;

    List<ListPropertyValue> elements = new ArrayList<ListPropertyValue>();

    public ArrayPropertyValueImpl(ListPropertyValue template) {
        super(template.getProperty());
    }

    public List<ListPropertyValue> getElements() {
        return Collections.unmodifiableList(elements);
    }

    public void createElement() {
        elements.add((ListPropertyValue) template.duplicate());
    }

    public void removeElement(int pos) {
        elements.remove(pos);
    }

    public List<Action> getActions() {
        return Collections.EMPTY_LIST;
    }

    public PropertyValue duplicate() {
        throw new IllegalStateException("To be implemented!");
    }
}
