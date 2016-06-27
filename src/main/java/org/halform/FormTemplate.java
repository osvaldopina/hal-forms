package org.halform;

import org.halform.action.Action;

import java.util.List;

public interface FormTemplate {

    String getName();

    String title();

    List<Property> getProperties();

    FormInstance createInstance();

}
