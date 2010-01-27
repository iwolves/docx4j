/*
 *  Copyright 2007-2009, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.vml.officedrawing;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.docx4j.vml.STExt;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Extrusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Extrusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{urn:schemas-microsoft-com:vml}ext"/>
 *       &lt;attribute name="on" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="type" type="{urn:schemas-microsoft-com:office:office}ST_ExtrusionType" default="parallel" />
 *       &lt;attribute name="render" type="{urn:schemas-microsoft-com:office:office}ST_ExtrusionRender" default="solid" />
 *       &lt;attribute name="viewpointorigin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="viewpoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="plane" type="{urn:schemas-microsoft-com:office:office}ST_ExtrusionPlane" default="XY" />
 *       &lt;attribute name="skewangle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="skewamt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="foredepth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="backdepth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orientationangle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="lockrotationcenter" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="autorotationcenter" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="rotationcenter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rotationangle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colormode" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shininess" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="specularity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diffusity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="metal" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="edge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="facet" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightface" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="brightness" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightposition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightlevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightharsh" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *       &lt;attribute name="lightposition2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightlevel2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lightharsh2" type="{urn:schemas-microsoft-com:office:office}ST_TrueFalse" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Extrusion")
public class CTExtrusion
    implements Child
{

    @XmlAttribute(namespace = "urn:schemas-microsoft-com:vml")
    protected STExt ext;
    @XmlAttribute
    protected String on;
    @XmlAttribute
    protected STExtrusionType type;
    @XmlAttribute
    protected STExtrusionRender render;
    @XmlAttribute
    protected String viewpointorigin;
    @XmlAttribute
    protected String viewpoint;
    @XmlAttribute
    protected STExtrusionPlane plane;
    @XmlAttribute
    protected Float skewangle;
    @XmlAttribute
    protected String skewamt;
    @XmlAttribute
    protected Float foredepth;
    @XmlAttribute
    protected String backdepth;
    @XmlAttribute
    protected String orientation;
    @XmlAttribute
    protected Float orientationangle;
    @XmlAttribute
    protected String lockrotationcenter;
    @XmlAttribute
    protected String autorotationcenter;
    @XmlAttribute
    protected String rotationcenter;
    @XmlAttribute
    protected String rotationangle;
    @XmlAttribute
    protected String colormode;
    @XmlAttribute
    protected String color;
    @XmlAttribute
    protected Float shininess;
    @XmlAttribute
    protected String specularity;
    @XmlAttribute
    protected String diffusity;
    @XmlAttribute
    protected String metal;
    @XmlAttribute
    protected String edge;
    @XmlAttribute
    protected String facet;
    @XmlAttribute
    protected String lightface;
    @XmlAttribute
    protected String brightness;
    @XmlAttribute
    protected String lightposition;
    @XmlAttribute
    protected String lightlevel;
    @XmlAttribute
    protected String lightharsh;
    @XmlAttribute
    protected String lightposition2;
    @XmlAttribute
    protected String lightlevel2;
    @XmlAttribute
    protected String lightharsh2;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link STExt }
     *     
     */
    public STExt getExt() {
        if (ext == null) {
            return STExt.VIEW;
        } else {
            return ext;
        }
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link STExt }
     *     
     */
    public void setExt(STExt value) {
        this.ext = value;
    }

    /**
     * Gets the value of the on property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOn() {
        return on;
    }

    /**
     * Sets the value of the on property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOn(String value) {
        this.on = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link STExtrusionType }
     *     
     */
    public STExtrusionType getType() {
        if (type == null) {
            return STExtrusionType.PARALLEL;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link STExtrusionType }
     *     
     */
    public void setType(STExtrusionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the render property.
     * 
     * @return
     *     possible object is
     *     {@link STExtrusionRender }
     *     
     */
    public STExtrusionRender getRender() {
        if (render == null) {
            return STExtrusionRender.SOLID;
        } else {
            return render;
        }
    }

    /**
     * Sets the value of the render property.
     * 
     * @param value
     *     allowed object is
     *     {@link STExtrusionRender }
     *     
     */
    public void setRender(STExtrusionRender value) {
        this.render = value;
    }

    /**
     * Gets the value of the viewpointorigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewpointorigin() {
        return viewpointorigin;
    }

    /**
     * Sets the value of the viewpointorigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewpointorigin(String value) {
        this.viewpointorigin = value;
    }

    /**
     * Gets the value of the viewpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewpoint() {
        return viewpoint;
    }

    /**
     * Sets the value of the viewpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewpoint(String value) {
        this.viewpoint = value;
    }

    /**
     * Gets the value of the plane property.
     * 
     * @return
     *     possible object is
     *     {@link STExtrusionPlane }
     *     
     */
    public STExtrusionPlane getPlane() {
        if (plane == null) {
            return STExtrusionPlane.XY;
        } else {
            return plane;
        }
    }

    /**
     * Sets the value of the plane property.
     * 
     * @param value
     *     allowed object is
     *     {@link STExtrusionPlane }
     *     
     */
    public void setPlane(STExtrusionPlane value) {
        this.plane = value;
    }

    /**
     * Gets the value of the skewangle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSkewangle() {
        return skewangle;
    }

    /**
     * Sets the value of the skewangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSkewangle(Float value) {
        this.skewangle = value;
    }

    /**
     * Gets the value of the skewamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkewamt() {
        return skewamt;
    }

    /**
     * Sets the value of the skewamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkewamt(String value) {
        this.skewamt = value;
    }

    /**
     * Gets the value of the foredepth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getForedepth() {
        return foredepth;
    }

    /**
     * Sets the value of the foredepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setForedepth(Float value) {
        this.foredepth = value;
    }

    /**
     * Gets the value of the backdepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackdepth() {
        return backdepth;
    }

    /**
     * Sets the value of the backdepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackdepth(String value) {
        this.backdepth = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the orientationangle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrientationangle() {
        return orientationangle;
    }

    /**
     * Sets the value of the orientationangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrientationangle(Float value) {
        this.orientationangle = value;
    }

    /**
     * Gets the value of the lockrotationcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockrotationcenter() {
        return lockrotationcenter;
    }

    /**
     * Sets the value of the lockrotationcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockrotationcenter(String value) {
        this.lockrotationcenter = value;
    }

    /**
     * Gets the value of the autorotationcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorotationcenter() {
        return autorotationcenter;
    }

    /**
     * Sets the value of the autorotationcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorotationcenter(String value) {
        this.autorotationcenter = value;
    }

    /**
     * Gets the value of the rotationcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationcenter() {
        return rotationcenter;
    }

    /**
     * Sets the value of the rotationcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationcenter(String value) {
        this.rotationcenter = value;
    }

    /**
     * Gets the value of the rotationangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationangle() {
        return rotationangle;
    }

    /**
     * Sets the value of the rotationangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationangle(String value) {
        this.rotationangle = value;
    }

    /**
     * Gets the value of the colormode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColormode() {
        return colormode;
    }

    /**
     * Sets the value of the colormode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColormode(String value) {
        this.colormode = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the shininess property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShininess() {
        return shininess;
    }

    /**
     * Sets the value of the shininess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShininess(Float value) {
        this.shininess = value;
    }

    /**
     * Gets the value of the specularity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecularity() {
        return specularity;
    }

    /**
     * Sets the value of the specularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecularity(String value) {
        this.specularity = value;
    }

    /**
     * Gets the value of the diffusity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffusity() {
        return diffusity;
    }

    /**
     * Sets the value of the diffusity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffusity(String value) {
        this.diffusity = value;
    }

    /**
     * Gets the value of the metal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetal() {
        return metal;
    }

    /**
     * Sets the value of the metal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetal(String value) {
        this.metal = value;
    }

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdge(String value) {
        this.edge = value;
    }

    /**
     * Gets the value of the facet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacet() {
        return facet;
    }

    /**
     * Sets the value of the facet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacet(String value) {
        this.facet = value;
    }

    /**
     * Gets the value of the lightface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightface() {
        return lightface;
    }

    /**
     * Sets the value of the lightface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightface(String value) {
        this.lightface = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrightness(String value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the lightposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightposition() {
        return lightposition;
    }

    /**
     * Sets the value of the lightposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightposition(String value) {
        this.lightposition = value;
    }

    /**
     * Gets the value of the lightlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightlevel() {
        return lightlevel;
    }

    /**
     * Sets the value of the lightlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightlevel(String value) {
        this.lightlevel = value;
    }

    /**
     * Gets the value of the lightharsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightharsh() {
        return lightharsh;
    }

    /**
     * Sets the value of the lightharsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightharsh(String value) {
        this.lightharsh = value;
    }

    /**
     * Gets the value of the lightposition2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightposition2() {
        return lightposition2;
    }

    /**
     * Sets the value of the lightposition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightposition2(String value) {
        this.lightposition2 = value;
    }

    /**
     * Gets the value of the lightlevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightlevel2() {
        return lightlevel2;
    }

    /**
     * Sets the value of the lightlevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightlevel2(String value) {
        this.lightlevel2 = value;
    }

    /**
     * Gets the value of the lightharsh2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightharsh2() {
        return lightharsh2;
    }

    /**
     * Sets the value of the lightharsh2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightharsh2(String value) {
        this.lightharsh2 = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}