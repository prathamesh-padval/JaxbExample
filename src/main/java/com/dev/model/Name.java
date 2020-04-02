package com.dev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Name
{
    @XmlElement(name= "NameValue")
    private NameValue nameValue;

    @XmlAttribute(name="NameType")
    private String nameType;

    public NameValue getNameValue() {
        return nameValue;
    }

    public void setNameValue(NameValue nameValue) {
        this.nameValue = nameValue;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "Name{" +
                "nameValue=" + nameValue +
                ", nameType='" + nameType + '\'' +
                '}';
    }
}