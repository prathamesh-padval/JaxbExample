package com.dev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name="action")
    private String action;

    @XmlElement(name = "Gender")
    private String gender;

    @XmlElement(name = "NameDetails")
    private NameDetails nameDetails;

    @XmlElement(name = "BirthPlace")
    private BirthPlace birthPlace;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NameDetails getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(NameDetails nameDetails) {
        this.nameDetails = nameDetails;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(BirthPlace birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", action='" + action + '\'' +
                ", gender='" + gender + '\'' +
                ", nameDetails=" + nameDetails +
                ", birthPlace=" + birthPlace +
                '}';
    }
}
