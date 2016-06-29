package org.halform.value;

import java.util.Collections;
import java.util.List;

public interface ArrayPropertyValue extends PropertyValue {


    List<ListPropertyValue> getElements();

    void createElement();
}
