package org.halform.value;

import java.util.List;

public interface ArrayPropertyValue extends PropertyValue {


    List<ArrayElementPropertyValue> getElements();

    void addElement();



}
