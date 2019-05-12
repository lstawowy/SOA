
package com.soa.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudentsByGender complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getStudentsByGender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gender" type="{http://soap.soa.com/}gender" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStudentsByGender", propOrder = {
        "gender"
})
public class GetStudentsByGender {

    @XmlSchemaType(name = "string")
    protected Gender gender;

    /**
     * Gets the value of the gender property.
     *
     * @return possible object is
     * {@link Gender }
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value allowed object is
     *              {@link Gender }
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

}
