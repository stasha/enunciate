package org.codehaus.enunciate.examples.objc.schema.structures;

import com.webcohesion.enunciate.metadata.qname.XmlQNameEnum;
import com.webcohesion.enunciate.metadata.qname.XmlUnknownQNameEnumValue;

/**
 * @author Ryan Heaton
 */
@XmlQNameEnum ( base = XmlQNameEnum.BaseType.URI )
public enum HouseColor {

  blue,

  red,

  yellow,

  @XmlUnknownQNameEnumValue
  unknown
}
