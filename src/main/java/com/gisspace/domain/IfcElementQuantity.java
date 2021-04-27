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
 *         &lt;element name="IfcPhysicalComplexQuantity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcQuantityLength" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Discrimination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}IfcQuantityLength" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IfcQuantityArea" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AreaValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IfcQuantityVolume" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VolumeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
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
    "ifcPhysicalComplexQuantity",
    "ifcQuantityLength",
    "ifcQuantityArea",
    "ifcQuantityVolume"
})
@XmlRootElement(name = "IfcElementQuantity")
public class IfcElementQuantity {

    @XmlElement(name = "IfcPhysicalComplexQuantity")
    protected List<IfcElementQuantity.IfcPhysicalComplexQuantity> ifcPhysicalComplexQuantity;
    @XmlElement(name = "IfcQuantityLength")
    protected List<IfcQuantityLength> ifcQuantityLength;
    @XmlElement(name = "IfcQuantityArea")
    protected List<IfcElementQuantity.IfcQuantityArea> ifcQuantityArea;
    @XmlElement(name = "IfcQuantityVolume")
    protected List<IfcElementQuantity.IfcQuantityVolume> ifcQuantityVolume;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;

    /**
     * Gets the value of the ifcPhysicalComplexQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcPhysicalComplexQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcPhysicalComplexQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcElementQuantity.IfcPhysicalComplexQuantity }
     * 
     * 
     */
    public List<IfcElementQuantity.IfcPhysicalComplexQuantity> getIfcPhysicalComplexQuantity() {
        if (ifcPhysicalComplexQuantity == null) {
            ifcPhysicalComplexQuantity = new ArrayList<IfcElementQuantity.IfcPhysicalComplexQuantity>();
        }
        return this.ifcPhysicalComplexQuantity;
    }

    /**
     * Gets the value of the ifcQuantityLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcQuantityLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcQuantityLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcQuantityLength }
     * 
     * 
     */
    public List<IfcQuantityLength> getIfcQuantityLength() {
        if (ifcQuantityLength == null) {
            ifcQuantityLength = new ArrayList<IfcQuantityLength>();
        }
        return this.ifcQuantityLength;
    }

    /**
     * Gets the value of the ifcQuantityArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcQuantityArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcQuantityArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcElementQuantity.IfcQuantityArea }
     * 
     * 
     */
    public List<IfcElementQuantity.IfcQuantityArea> getIfcQuantityArea() {
        if (ifcQuantityArea == null) {
            ifcQuantityArea = new ArrayList<IfcElementQuantity.IfcQuantityArea>();
        }
        return this.ifcQuantityArea;
    }

    /**
     * Gets the value of the ifcQuantityVolume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcQuantityVolume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcQuantityVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcElementQuantity.IfcQuantityVolume }
     * 
     * 
     */
    public List<IfcElementQuantity.IfcQuantityVolume> getIfcQuantityVolume() {
        if (ifcQuantityVolume == null) {
            ifcQuantityVolume = new ArrayList<IfcElementQuantity.IfcQuantityVolume>();
        }
        return this.ifcQuantityVolume;
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
     * 获取href属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置href属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }


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
     *         &lt;element ref="{}IfcQuantityLength" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Discrimination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcQuantityLength"
    })
    public static class IfcPhysicalComplexQuantity {

        @XmlElement(name = "IfcQuantityLength")
        protected List<IfcQuantityLength> ifcQuantityLength;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Discrimination")
        protected String discrimination;

        /**
         * Gets the value of the ifcQuantityLength property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcQuantityLength property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcQuantityLength().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcQuantityLength }
         * 
         * 
         */
        public List<IfcQuantityLength> getIfcQuantityLength() {
            if (ifcQuantityLength == null) {
                ifcQuantityLength = new ArrayList<IfcQuantityLength>();
            }
            return this.ifcQuantityLength;
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
         * 获取discrimination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscrimination() {
            return discrimination;
        }

        /**
         * 设置discrimination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscrimination(String value) {
            this.discrimination = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AreaValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IfcQuantityArea {

        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "AreaValue")
        protected String areaValue;

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
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * 获取areaValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaValue() {
            return areaValue;
        }

        /**
         * 设置areaValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaValue(String value) {
            this.areaValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VolumeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IfcQuantityVolume {

        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "VolumeValue")
        protected String volumeValue;

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
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * 获取volumeValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVolumeValue() {
            return volumeValue;
        }

        /**
         * 设置volumeValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVolumeValue(String value) {
            this.volumeValue = value;
        }

    }

}
