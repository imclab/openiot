/**
 *    Copyright (c) 2011-2014, OpenIoT
 *   
 *    This file is part of OpenIoT.
 *
 *    OpenIoT is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, version 3 of the License.
 *
 *    OpenIoT is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
 *
 *     Contact: OpenIoT mailto: info@openiot.eu
 */

package org.openiot.ui.request.definition.web.model.nodes.impl.comparators;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.openiot.ui.request.commons.annotations.Endpoint;
import org.openiot.ui.request.commons.annotations.Endpoints;
import org.openiot.ui.request.commons.annotations.GraphNodeClass;
import org.openiot.ui.request.commons.annotations.NodeProperties;
import org.openiot.ui.request.commons.annotations.NodeProperty;
import org.openiot.ui.request.commons.nodes.base.DefaultGraphNode;
import org.openiot.ui.request.commons.nodes.enums.AnchorType;
import org.openiot.ui.request.commons.nodes.enums.EndpointType;
import org.openiot.ui.request.commons.nodes.enums.PropertyType;
import org.openiot.ui.request.commons.nodes.interfaces.GraphNodeProperty;

/**
 *
 * @author Achilleas Anagnostopoulos (aanag) email: aanag@sensap.eu
 */
@GraphNodeClass(label = "BetweenDateTime", type = "COMPARATOR", scanProperties = true)
@Endpoints({
    @Endpoint(type = EndpointType.Input, anchorType = AnchorType.Left, scope = "cmp_sensor_Date", label = "IN", required = true),
})
@NodeProperties({
    @NodeProperty(type = PropertyType.Writable, javaType = java.util.Date.class, name = "CMP_VALUE1", required = true),
    @NodeProperty(type = PropertyType.Writable, javaType = java.util.Date.class, name = "CMP_VALUE2", required = true)
})
public class BetweenDateTime extends DefaultGraphNode implements Serializable, Observer {
	private static final long serialVersionUID = 1L;

    public BetweenDateTime() {
        super();

        // Listen for property change events
        addPropertyChangeObserver(this);
    }

    public void update(Observable o, Object arg) {
        // Mutate our label
        Map<String, Object> propertyMap = getPropertyValueMap();
        if (propertyMap.get("CMP_VALUE1") != null && propertyMap.get("CMP_VALUE2") != null) {
        	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        	String lValue = sdf.format(propertyMap.get("CMP_VALUE1"));
        	GraphNodeProperty prop =getPropertyByName("CMP_VALUE1"); 
        	if( prop.isVariable()){
        		lValue = prop.getVariableName();
        	}
        	String rValue = sdf.format(propertyMap.get("CMP_VALUE2"));
        	prop = getPropertyByName("CMP_VALUE2"); 
        	if( prop.isVariable()){
        		rValue = prop.getVariableName();        	
    		}
        	
        	setLabel(lValue + "<br/> &lt;= IN &lt;= <br/>" + rValue);
        } else {
            setLabel("BetweenDateTime");
        }
    }
}
