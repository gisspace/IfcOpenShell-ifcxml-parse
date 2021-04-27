//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.04.26 时间 03:14:32 PM CST 
//


package com.gisspace.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IfcElementQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IfcPresentationLayerAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PredefinedType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ifcWindow",
    "ifcElementQuantity",
    "ifcPresentationLayerAssignment",
    "ifcPropertySet"
})
@XmlRootElement(name = "IfcOpeningElement")
public class IfcOpeningElement {

    @XmlElement(name = "IfcWindow")
    protected List<IfcWindow> ifcWindow;
    @XmlElement(name = "IfcElementQuantity")
    protected List<IfcElementQuantity> ifcElementQuantity;
    @XmlElement(name = "IfcPresentationLayerAssignment")
    protected List<IfcPresentationLayerAssignment> ifcPresentationLayerAssignment;
    @XmlElement(name = "IfcPropertySet")
    protected List<IfcPropertySet> ifcPropertySet;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ObjectType")
    protected String objectType;
    @XmlAttribute(name = "ObjectPlacement")
    protected String objectPlacement;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "PredefinedType")
    protected String predefinedType;

    /**
     * Gets the value of the ifcWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcWindow }
     * 
     * 
     */
    public List<IfcWindow> getIfcWindow() {
        if (ifcWindow == null) {
            ifcWindow = new ArrayList<IfcWindow>();
        }
        return this.ifcWindow;
    }

    /**
     * Gets the value of the ifcElementQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcElementQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcElementQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcElementQuantity }
     * 
     * 
     */
    public List<IfcElementQuantity> getIfcElementQuantity() {
        if (ifcElementQuantity == null) {
            ifcElementQuantity = new ArrayList<IfcElementQuantity>();
        }
        return this.ifcElementQuantity;
    }

    /**
     * Gets the value of the ifcPresentationLayerAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcPresentationLayerAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcPresentationLayerAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcPresentationLayerAssignment }
     * 
     * 
     */
    public List<IfcPresentationLayerAssignment> getIfcPresentationLayerAssignment() {
        if (ifcPresentationLayerAssignment == null) {
            ifcPresentationLayerAssignment = new ArrayList<IfcPresentationLayerAssignment>();
        }
        return this.ifcPresentationLayerAssignment;
    }

    /**
     * Gets the value of the ifcPropertySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcPropertySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcPropertySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcPropertySet }
     * 
     * 
     */
    public List<IfcPropertySet> getIfcPropertySet() {
        if (ifcPropertySet == null) {
            ifcPropertySet = new ArrayList<IfcPropertySet>();
        }
        return this.ifcPropertySet;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取objectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * 获取objectPlacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPlacement() {
        return objectPlacement;
    }

    /**
     * 设置objectPlacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPlacement(String value) {
        this.objectPlacement = value;
    }

    /**
     * 获取tag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置tag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * 获取predefinedType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedType() {
        return predefinedType;
    }

    /**
     * 设置predefinedType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedType(String value) {
        this.predefinedType = value;
    }

}