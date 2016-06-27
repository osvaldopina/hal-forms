package org.halform.impl;

import org.halform.Property;
import org.halform.PropertyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PropertyListImpl extends PropertyImpl implements PropertyList{

    private List<Property> properties;

    private boolean multi;

    public PropertyListImpl(String name, String prompt, List<Property> properties, boolean multi) {
        super(name, prompt);
        this.properties = new ArrayList<Property>(properties);
        this.multi = multi;
    }

    public List<Property> getProperties() {
        return Collections.unmodifiableList(properties);
    }

    public boolean isMulti() {
        return multi;
    }
}
