
package com.soa.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for studentEntity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="studentEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="avatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://soap.soa.com/}gender" minOccurs="0"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentEntity", propOrder = {
        "avatar",
        "email",
        "firstName",
        "gender",
        "lastName"
})
public class StudentEntity {

    protected String avatar;
    protected String email;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "last_name")
    protected String lastName;

    /**
     * Gets the value of the avatar property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAvatar(String value) {
        this.avatar = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

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

    /**
     * Gets the value of the lastName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
