package org.halform.value.impl;

import org.halform.Property;
import org.halform.PropertyList;
import org.halform.impl.PropertyImpl;
import org.halform.impl.PropertyListImpl;
import org.halform.value.ArrayPropertyValue;
import org.halform.value.ListPropertyValue;
import org.halform.value.PropertyValue;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PropertyValueFactoryTest {

    private PropertyValueFactory propertyValueFactory = new PropertyValueFactory();


    @Test
    public void createPropertyValueSimpleProperty() {

        Property property = new PropertyImpl("name", "prompt");

        PropertyValue propertyValue = propertyValueFactory.create(property);

        assertEquals("name", propertyValue.getProperty().getName());
        assertEquals("prompt", propertyValue.getProperty().getPrompt());

    }

    @Test
    public void createPropertyValueEmptyPropertyList() {

        PropertyList propertyList = new PropertyListImpl("property-list", "Property List", Collections.EMPTY_LIST, false);

        PropertyValue propertyValue = propertyValueFactory.create(propertyList);

        assertEquals("property-list", propertyValue.getProperty().getName());
        assertEquals("Property List", propertyValue.getProperty().getPrompt());

    }

    @Test
    public void createPropertyValuePropertyListOneSubproperty() {

        PropertyList propertyList = new PropertyListImpl(
                "property-list",
                "Property List",
                Arrays.asList((Property) new PropertyImpl("property", "Property")), false);

        PropertyValue propertyValue = propertyValueFactory.create(propertyList);

        assertEquals("property-list", propertyValue.getProperty().getName());
        assertEquals("Property List", propertyValue.getProperty().getPrompt());

        assertTrue(propertyValue instanceof ListPropertyValue);

        ListPropertyValue listPropertyValue = (ListPropertyValue) propertyValue;

        assertEquals(1, listPropertyValue.getPropertiesValues().size());
        assertEquals("property", listPropertyValue.getPropertiesValues().get(0).getProperty().getName());
        assertEquals("Property", listPropertyValue.getPropertiesValues().get(0).getProperty().getPrompt());

    }

    @Test
    public void createPropertyValuePropertyListSubPropertyListWithOneSubproperty() {

        PropertyList propertyList = new PropertyListImpl(
                "property-list",
                "Property List",
                 Arrays.asList((Property) new PropertyListImpl(
                        "sub-property",
                        "Sub Property",
                        Arrays.asList((Property) new PropertyImpl("property", "Property")),
                        false)),
                false);

        PropertyValue propertyValue = propertyValueFactory.create(propertyList);

        assertEquals("property-list", propertyValue.getProperty().getName());
        assertEquals("Property List", propertyValue.getProperty().getPrompt());

        assertTrue(propertyValue instanceof ListPropertyValue);

        ListPropertyValue listPropertyValue = (ListPropertyValue) propertyValue;

        assertEquals(1, listPropertyValue.getPropertiesValues().size());

        assertEquals("sub-property", listPropertyValue.getPropertiesValues().get(0).getProperty().getName());
        assertEquals("Sub Property", listPropertyValue.getPropertiesValues().get(0).getProperty().getPrompt());

        assertTrue(listPropertyValue.getPropertiesValues().get(0) instanceof ListPropertyValue);

        listPropertyValue =  (ListPropertyValue) listPropertyValue.getPropertiesValues().get(0);

        assertEquals("property", listPropertyValue.getPropertiesValues().get(0).getProperty().getName());
        assertEquals("Property", listPropertyValue.getPropertiesValues().get(0).getProperty().getPrompt());

    }

    @Test
    public void createPropertyValuePropertyListMultiOneSubproperty() {

        PropertyList propertyList = new PropertyListImpl(
                "property-list",
                "Property List",
                Arrays.asList((Property) new PropertyImpl("property", "Property")), true);

        PropertyValue propertyValue = propertyValueFactory.create(propertyList);

        assertEquals("property-list", propertyValue.getProperty().getName());
        assertEquals("Property List", propertyValue.getProperty().getPrompt());

        assertTrue(propertyValue instanceof ArrayPropertyValue);

        ArrayPropertyValue arrayPropertyValue = (ArrayPropertyValue) propertyValue;
    }

}