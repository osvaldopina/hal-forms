package org.halform.value.impl;

import org.halform.Property;
import org.halform.action.Action;
import org.halform.action.impl.GetValueActionImpl;
import org.halform.action.impl.SetValueActionImpl;
import org.halform.value.StringPropertyValue;

import java.util.ArrayList;
import java.util.List;

public class StringPropertyActionFactory {

    List<Action> create(Property property, StringPropertyValue stringPropertyValue) {
        List<Action> actions = new ArrayList<Action>();
        actions.add(new GetValueActionImpl(property, stringPropertyValue));
        actions.add(new SetValueActionImpl(property, stringPropertyValue));
        return actions;
    }

}
