
package com.soa.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addStudent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addStudent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="student" type="{http://soap.soa.com/}studentEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addStudent", propOrder = {
        "student"
})
public class AddStudent {

    protected StudentEntity student;

    /**
     * Gets the value of the student property.
     *
     * @return possible object is
     * {@link StudentEntity }
     */
    public StudentEntity getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     *
     * @param value allowed object is
     *              {@link StudentEntity }
     */
    public void setStudent(StudentEntity value) {
        this.student = value;
    }

}
