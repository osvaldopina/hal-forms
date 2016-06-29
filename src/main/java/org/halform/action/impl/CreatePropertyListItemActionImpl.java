package org.halform.action.impl;

import org.halform.Property;
import org.halform.action.CreatePropertyListItemAction;
import org.halform.value.ArrayPropertyValue;
import org.halform.value.StringPropertyValue;

/**
 * Created by deinf.osvaldo on 29/06/2016.
 */
public class CreatePropertyListItemActionImpl extends BaseAction implements CreatePropertyListItemAction {

    ArrayPropertyValue arrayPropertyValue;

    public CreatePropertyListItemActionImpl(Property property, ArrayPropertyValue arrayPropertyValue) {
        super(property);
        this.arrayPropertyValue = arrayPropertyValue;
    }

    public void create() {
        arrayPropertyValue.createElement();
    }
}
