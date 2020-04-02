package com.dev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BirthPlace
{
    @XmlElement(name="Place")
    private Place Place;

    public Place getPlace ()
    {
        return Place;
    }

    public void setPlace (Place Place)
    {
        this.Place = Place;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Place = "+Place+"]";
    }
}

