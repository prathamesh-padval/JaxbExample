package com.dev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class NameDetails
{
    @XmlElement(name="Name")
    private List<Name> name;


    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameDetails{" +
                "name=" + name +
                '}';
    }
}