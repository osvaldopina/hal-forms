package org.halform;

import java.util.List;

public interface PropertyList extends Property {

    List<Property> getProperties();

    boolean isMulti();

}
