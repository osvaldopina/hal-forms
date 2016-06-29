package org.halform.action.impl;

import org.halform.Property;
import org.halform.action.CreatePropertyListItemAction;
import org.halform.action.DeletePropertyListItemAction;
import org.halform.value.ArrayPropertyValue;

/**
 * Created by deinf.osvaldo on 29/06/2016.
 */
public class DeletePropertyListItemActionImpl extends BaseAction implements DeletePropertyListItemAction {

    ArrayPropertyValue arrayPropertyValue;

    int index;

    public DeletePropertyListItemActionImpl(Property property, ArrayPropertyValue arrayPropertyValue, int index) {
        super(property);
        this.arrayPropertyValue = arrayPropertyValue;
        this.index = index;
    }

    public void delete() {
        arrayPropertyValue.createElement();

    }
}
