package org.halform.impl;

import org.halform.FormInstance;
import org.halform.FormTemplate;
import org.halform.Property;
import org.halform.action.Action;
import org.halform.action.GetValueAction;
import org.halform.action.SetValueAction;
import org.halform.value.PropertyValue;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FormInstanceImplTest {

    private Property property;

    private FormTemplate formTemplate;

    private FormInstance formInstance;

    @Test
    public void verifyActionListSingleProperty() {
        formTemplate = new FormTemplateImpl("Form-Template", "Form template",
                Arrays.asList((Property) new PropertyImpl("single-property", "Single Property:")));

        formInstance = formTemplate.createInstance();

        assertEquals(1, formInstance.getPropertiesValues().size());
        PropertyValue propertyValue = formInstance.getPropertiesValues().get(0);

        assertEquals("single-property", propertyValue.getProperty().getName());
        assertEquals("Single Property:", propertyValue.getProperty().getPrompt());

        List<Action> actions = propertyValue.getActions();

        assertEquals(2, actions.size());
        assertEquals("single-property", actions.get(0).getProperty().getName());
        assertTrue(GetValueAction.class.isAssignableFrom(actions.get(0).getClass()));
        assertTrue(SetValueAction.class.isAssignableFrom(actions.get(1).getClass()));

    }

    @Test
    public void verifyActionListTwoProperties() {
        formTemplate = new FormTemplateImpl("Form-Template", "Form template",
                Arrays.asList(
                        (Property) new PropertyImpl("first-property", "First Property:"),
                        (Property) new PropertyImpl("second-property", "Second Property:")));

        formInstance = formTemplate.createInstance();

        assertEquals(2, formInstance.getPropertiesValues().size());

        PropertyValue propertyValue = formInstance.getPropertiesValues().get(0);

        assertEquals("first-property", propertyValue.getProperty().getName());
        assertEquals("First Property:", propertyValue.getProperty().getPrompt());

        List<Action> actions = propertyValue.getActions();

        assertEquals(2, actions.size());
        assertEquals("first-property", actions.get(0).getProperty().getName());
        assertTrue(GetValueAction.class.isAssignableFrom(actions.get(0).getClass()));
        assertTrue(SetValueAction.class.isAssignableFrom(actions.get(1).getClass()));

        propertyValue = formInstance.getPropertiesValues().get(1);

        assertEquals("second-property", propertyValue.getProperty().getName());
        assertEquals("Second Property:", propertyValue.getProperty().getPrompt());

        actions = propertyValue.getActions();

        assertEquals(2, actions.size());
        assertEquals("second-property", actions.get(0).getProperty().getName());
        assertTrue(GetValueAction.class.isAssignableFrom(actions.get(0).getClass()));
        assertTrue(SetValueAction.class.isAssignableFrom(actions.get(1).getClass()));
    }

    @Test
    public void verifyActionListPropertyListOneProperty() {
        formTemplate = new FormTemplateImpl("Form-Template", "Form template",
                Arrays.asList(
                        (Property) new PropertyListImpl("property-list", "Property List:",
                                Arrays.asList((Property) new PropertyImpl("property", "Property:")), false)));

        formInstance = formTemplate.createInstance();

        assertEquals(1, formInstance.getPropertiesValues().size());

        PropertyValue propertyValue = formInstance.getPropertiesValues().get(0);

        assertEquals("property-list", propertyValue.getProperty().getName());
        assertEquals("Property List:" , propertyValue.getProperty().getPrompt());

        List<Action> actions = propertyValue.getActions();

        assertEquals(1, actions.size());
//        assertEquals("first-property", actions.get(0).getProperty().getName());
//        assertTrue(GetValueAction.class.isAssignableFrom(actions.get(0).getClass()));
//        assertTrue(SetValueAction.class.isAssignableFrom(actions.get(1).getClass()));
//
//        propertyValue = formInstance.getPropertiesValues().get(1);
//
//        assertEquals("second-property", propertyValue.getProperty().getName());
//        assertEquals("Second Property:", propertyValue.getProperty().getPrompt());
//
//        actions = propertyValue.getActions();
//
//        assertEquals(2, actions.size());
//        assertEquals("second-property", actions.get(0).getProperty().getName());
//        assertTrue(GetValueAction.class.isAssignableFrom(actions.get(0).getClass()));
//        assertTrue(SetValueAction.class.isAssignableFrom(actions.get(1).getClass()));
    }




}