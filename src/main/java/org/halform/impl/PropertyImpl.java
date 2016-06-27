package org.halform.impl;

import org.halform.FormInstance;
import org.halform.Property;
import org.halform.action.Action;

import java.util.List;

public class PropertyImpl implements Property {

    private String name;

    private String prompt;


    public PropertyImpl(String name, String prompt) {
        this.name = name;
        this.prompt = prompt;
    }

    public String getName() {
        return name;
    }

    public String getPrompt() {
        return prompt;
    }

}
