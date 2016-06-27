package org.halform.impl;

import org.halform.FormInstance;
import org.halform.FormTemplate;
import org.halform.Property;
import org.halform.PropertyList;
import org.halform.action.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormTemplateImpl implements FormTemplate {

    private String name;

    private String title;

    private List<Property> properties;

    public FormTemplateImpl(String name, String title, List<Property> properties) {
        this.name = name;
        this.title = title;
        this.properties = new ArrayList<Property>(properties);
    }

    public String getName() {
        return name;
    }

    public String title() {
        return title;
    }

    public List<Property> getProperties() {
        return Collections.unmodifiableList(properties);
    }

    public FormInstance createInstance() {
        return new FormInstanceImpl(this);
    }

}
