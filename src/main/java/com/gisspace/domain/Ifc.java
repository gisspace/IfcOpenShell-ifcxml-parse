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
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}IfcPropertySet"/>
 *         &lt;element ref="{}IfcElementQuantity"/>
 *         &lt;element ref="{}IfcQuantityLength"/>
 *         &lt;element ref="{}IfcAlarmType"/>
 *         &lt;element ref="{}IfcBuildingElementProxyType"/>
 *         &lt;element ref="{}IfcDuctSegmentType"/>
 *         &lt;element ref="{}IfcAirTerminalType"/>
 *         &lt;element ref="{}IfcDuctFittingType"/>
 *         &lt;element ref="{}IfcCableCarrierSegmentType"/>
 *         &lt;element ref="{}IfcCableCarrierFittingType"/>
 *         &lt;element ref="{}IfcLightFixtureType"/>
 *         &lt;element ref="{}IfcBeamType"/>
 *         &lt;element ref="{}IfcElectricApplianceType"/>
 *         &lt;element ref="{}IfcWindowType"/>
 *         &lt;element ref="{}IfcWallType"/>
 *         &lt;element ref="{}IfcFireSuppressionTerminalType"/>
 *         &lt;element ref="{}IfcPresentationLayerAssignment"/>
 *         &lt;element ref="{}IfcBuildingElementProxy"/>
 *         &lt;element ref="{}IfcDistributionPort"/>
 *         &lt;element ref="{}IfcMaterial"/>
 *         &lt;element ref="{}IfcMaterialConstituentSet"/>
 *         &lt;element ref="{}IfcDuctSegment"/>
 *         &lt;element ref="{}IfcAirTerminal"/>
 *         &lt;element ref="{}IfcLightFixture"/>
 *         &lt;element ref="{}IfcCableCarrierFitting"/>
 *         &lt;element ref="{}IfcDuctFitting"/>
 *         &lt;element ref="{}IfcCableCarrierSegment"/>
 *         &lt;element ref="{}IfcWall"/>
 *         &lt;element ref="{}IfcOpeningElement"/>
 *         &lt;element ref="{}IfcWindow"/>
 *         &lt;element ref="{}IfcAlarm"/>
 *         &lt;element ref="{}IfcBeam"/>
 *         &lt;element ref="{}IfcElectricAppliance"/>
 *         &lt;element ref="{}IfcFireSuppressionTerminal"/>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file_description" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="implementation_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="file_name" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="time_stamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preprocessor_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originating_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="file_schema" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="schema_identifiers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="units">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IfcSIUnit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IfcConversionBasedUnit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="properties">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="quantities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcElementQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="types">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcAlarmType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcBuildingElementProxyType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcDuctSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcAirTerminalType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcDuctFittingType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcCableCarrierSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcCableCarrierFittingType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcLightFixtureType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcBeamType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcElectricApplianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcWindowType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcWallType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcFireSuppressionTerminalType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="layers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcPresentationLayerAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groups">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IfcGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcOpeningElement" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IfcSystem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{}IfcDistributionPort" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="materials">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}IfcMaterialConstituentSet" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}IfcMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="decomposition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IfcProject" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IfcSite" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IfcBuilding" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="IfcBuildingStorey" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RefLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RefLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RefElevation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Phase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
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
    "ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength"
})
@XmlRootElement(name = "ifc")
public class Ifc {

    @XmlElements({
        @XmlElement(name = "IfcPropertySet", type = IfcPropertySet.class),
        @XmlElement(name = "IfcElementQuantity", type = IfcElementQuantity.class),
        @XmlElement(name = "IfcQuantityLength", type = IfcQuantityLength.class),
        @XmlElement(name = "IfcAlarmType", type = IfcAlarmType.class),
        @XmlElement(name = "IfcBuildingElementProxyType", type = IfcBuildingElementProxyType.class),
        @XmlElement(name = "IfcDuctSegmentType", type = IfcDuctSegmentType.class),
        @XmlElement(name = "IfcAirTerminalType", type = IfcAirTerminalType.class),
        @XmlElement(name = "IfcDuctFittingType", type = IfcDuctFittingType.class),
        @XmlElement(name = "IfcCableCarrierSegmentType", type = IfcCableCarrierSegmentType.class),
        @XmlElement(name = "IfcCableCarrierFittingType", type = IfcCableCarrierFittingType.class),
        @XmlElement(name = "IfcLightFixtureType", type = IfcLightFixtureType.class),
        @XmlElement(name = "IfcBeamType", type = IfcBeamType.class),
        @XmlElement(name = "IfcElectricApplianceType", type = IfcElectricApplianceType.class),
        @XmlElement(name = "IfcWindowType", type = IfcWindowType.class),
        @XmlElement(name = "IfcWallType", type = IfcWallType.class),
        @XmlElement(name = "IfcFireSuppressionTerminalType", type = IfcFireSuppressionTerminalType.class),
        @XmlElement(name = "IfcPresentationLayerAssignment", type = IfcPresentationLayerAssignment.class),
        @XmlElement(name = "IfcBuildingElementProxy", type = IfcBuildingElementProxy.class),
        @XmlElement(name = "IfcDistributionPort", type = IfcDistributionPort.class),
        @XmlElement(name = "IfcMaterial", type = IfcMaterial.class),
        @XmlElement(name = "IfcMaterialConstituentSet", type = IfcMaterialConstituentSet.class),
        @XmlElement(name = "IfcDuctSegment", type = IfcDuctSegment.class),
        @XmlElement(name = "IfcAirTerminal", type = IfcAirTerminal.class),
        @XmlElement(name = "IfcLightFixture", type = IfcLightFixture.class),
        @XmlElement(name = "IfcCableCarrierFitting", type = IfcCableCarrierFitting.class),
        @XmlElement(name = "IfcDuctFitting", type = IfcDuctFitting.class),
        @XmlElement(name = "IfcCableCarrierSegment", type = IfcCableCarrierSegment.class),
        @XmlElement(name = "IfcWall", type = IfcWall.class),
        @XmlElement(name = "IfcOpeningElement", type = IfcOpeningElement.class),
        @XmlElement(name = "IfcWindow", type = IfcWindow.class),
        @XmlElement(name = "IfcAlarm", type = IfcAlarm.class),
        @XmlElement(name = "IfcBeam", type = IfcBeam.class),
        @XmlElement(name = "IfcElectricAppliance", type = IfcElectricAppliance.class),
        @XmlElement(name = "IfcFireSuppressionTerminal", type = IfcFireSuppressionTerminal.class),
        @XmlElement(name = "header", type = Ifc.Header.class),
        @XmlElement(name = "units", type = Ifc.Units.class),
        @XmlElement(name = "properties", type = Ifc.Properties.class),
        @XmlElement(name = "quantities", type = Ifc.Quantities.class),
        @XmlElement(name = "types", type = Ifc.Types.class),
        @XmlElement(name = "layers", type = Ifc.Layers.class),
        @XmlElement(name = "groups", type = Ifc.Groups.class),
        @XmlElement(name = "materials", type = Ifc.Materials.class),
        @XmlElement(name = "decomposition", type = Ifc.Decomposition.class)
    })
    protected List<Object> ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength;

    /**
     * Gets the value of the ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfcPropertySetOrIfcElementQuantityOrIfcQuantityLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcPropertySet }
     * {@link IfcElementQuantity }
     * {@link IfcQuantityLength }
     * {@link IfcAlarmType }
     * {@link IfcBuildingElementProxyType }
     * {@link IfcDuctSegmentType }
     * {@link IfcAirTerminalType }
     * {@link IfcDuctFittingType }
     * {@link IfcCableCarrierSegmentType }
     * {@link IfcCableCarrierFittingType }
     * {@link IfcLightFixtureType }
     * {@link IfcBeamType }
     * {@link IfcElectricApplianceType }
     * {@link IfcWindowType }
     * {@link IfcWallType }
     * {@link IfcFireSuppressionTerminalType }
     * {@link IfcPresentationLayerAssignment }
     * {@link IfcBuildingElementProxy }
     * {@link IfcDistributionPort }
     * {@link IfcMaterial }
     * {@link IfcMaterialConstituentSet }
     * {@link IfcDuctSegment }
     * {@link IfcAirTerminal }
     * {@link IfcLightFixture }
     * {@link IfcCableCarrierFitting }
     * {@link IfcDuctFitting }
     * {@link IfcCableCarrierSegment }
     * {@link IfcWall }
     * {@link IfcOpeningElement }
     * {@link IfcWindow }
     * {@link IfcAlarm }
     * {@link IfcBeam }
     * {@link IfcElectricAppliance }
     * {@link IfcFireSuppressionTerminal }
     * {@link Ifc.Header }
     * {@link Ifc.Units }
     * {@link Ifc.Properties }
     * {@link Ifc.Quantities }
     * {@link Ifc.Types }
     * {@link Ifc.Layers }
     * {@link Ifc.Groups }
     * {@link Ifc.Materials }
     * {@link Ifc.Decomposition }
     * 
     * 
     */
    public List<Object> getIfcProperty() {
        if (ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength == null) {
            ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength = new ArrayList<Object>();
        }
        return this.ifcPropertySetOrIfcElementQuantityOrIfcQuantityLength;
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
     *         &lt;element name="IfcProject" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IfcSite" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IfcBuilding" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="IfcBuildingStorey" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RefLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RefLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RefElevation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Phase" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcProject"
    })
    public static class Decomposition {

        @XmlElement(name = "IfcProject")
        protected List<Ifc.Decomposition.IfcProject> ifcProject;

        /**
         * Gets the value of the ifcProject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcProject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcProject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Decomposition.IfcProject }
         * 
         * 
         */
        public List<Ifc.Decomposition.IfcProject> getIfcProject() {
            if (ifcProject == null) {
                ifcProject = new ArrayList<Ifc.Decomposition.IfcProject>();
            }
            return this.ifcProject;
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
         *         &lt;element name="IfcSite" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IfcBuilding" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="IfcBuildingStorey" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RefLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RefLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RefElevation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Phase" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ifcSite"
        })
        public static class IfcProject {

            @XmlElement(name = "IfcSite")
            protected List<Ifc.Decomposition.IfcProject.IfcSite> ifcSite;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "LongName")
            protected String longName;
            @XmlAttribute(name = "Phase")
            protected String phase;

            /**
             * Gets the value of the ifcSite property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcSite property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcSite().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ifc.Decomposition.IfcProject.IfcSite }
             * 
             * 
             */
            public List<Ifc.Decomposition.IfcProject.IfcSite> getIfcSite() {
                if (ifcSite == null) {
                    ifcSite = new ArrayList<Ifc.Decomposition.IfcProject.IfcSite>();
                }
                return this.ifcSite;
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
             * 获取longName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongName() {
                return longName;
            }

            /**
             * 设置longName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongName(String value) {
                this.longName = value;
            }

            /**
             * 获取phase属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhase() {
                return phase;
            }

            /**
             * 设置phase属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhase(String value) {
                this.phase = value;
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
             *         &lt;element name="IfcBuilding" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="IfcBuildingStorey" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RefLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RefLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RefElevation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ifcBuilding",
                "ifcPropertySet"
            })
            public static class IfcSite {

                @XmlElement(name = "IfcBuilding")
                protected List<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding> ifcBuilding;
                @XmlElement(name = "IfcPropertySet")
                protected List<IfcPropertySet> ifcPropertySet;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "ObjectPlacement")
                protected String objectPlacement;
                @XmlAttribute(name = "CompositionType")
                protected String compositionType;
                @XmlAttribute(name = "RefLatitude")
                protected String refLatitude;
                @XmlAttribute(name = "RefLongitude")
                protected String refLongitude;
                @XmlAttribute(name = "RefElevation")
                protected String refElevation;

                /**
                 * Gets the value of the ifcBuilding property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ifcBuilding property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIfcBuilding().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding }
                 * 
                 * 
                 */
                public List<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding> getIfcBuilding() {
                    if (ifcBuilding == null) {
                        ifcBuilding = new ArrayList<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding>();
                    }
                    return this.ifcBuilding;
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
                 * 获取compositionType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompositionType() {
                    return compositionType;
                }

                /**
                 * 设置compositionType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompositionType(String value) {
                    this.compositionType = value;
                }

                /**
                 * 获取refLatitude属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefLatitude() {
                    return refLatitude;
                }

                /**
                 * 设置refLatitude属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefLatitude(String value) {
                    this.refLatitude = value;
                }

                /**
                 * 获取refLongitude属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefLongitude() {
                    return refLongitude;
                }

                /**
                 * 设置refLongitude属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefLongitude(String value) {
                    this.refLongitude = value;
                }

                /**
                 * 获取refElevation属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefElevation() {
                    return refElevation;
                }

                /**
                 * 设置refElevation属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefElevation(String value) {
                    this.refElevation = value;
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
                 *         &lt;element name="IfcBuildingStorey" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "ifcBuildingStorey",
                    "ifcPropertySet"
                })
                public static class IfcBuilding {

                    @XmlElement(name = "IfcBuildingStorey")
                    protected List<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding.IfcBuildingStorey> ifcBuildingStorey;
                    @XmlElement(name = "IfcPropertySet")
                    protected List<IfcPropertySet> ifcPropertySet;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "Name")
                    protected String name;
                    @XmlAttribute(name = "ObjectPlacement")
                    protected String objectPlacement;
                    @XmlAttribute(name = "LongName")
                    protected String longName;
                    @XmlAttribute(name = "CompositionType")
                    protected String compositionType;

                    /**
                     * Gets the value of the ifcBuildingStorey property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ifcBuildingStorey property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIfcBuildingStorey().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding.IfcBuildingStorey }
                     * 
                     * 
                     */
                    public List<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding.IfcBuildingStorey> getIfcBuildingStorey() {
                        if (ifcBuildingStorey == null) {
                            ifcBuildingStorey = new ArrayList<Ifc.Decomposition.IfcProject.IfcSite.IfcBuilding.IfcBuildingStorey>();
                        }
                        return this.ifcBuildingStorey;
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
                     * 获取longName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLongName() {
                        return longName;
                    }

                    /**
                     * 设置longName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLongName(String value) {
                        this.longName = value;
                    }

                    /**
                     * 获取compositionType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCompositionType() {
                        return compositionType;
                    }

                    /**
                     * 设置compositionType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCompositionType(String value) {
                        this.compositionType = value;
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
                     *         &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ObjectPlacement" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CompositionType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Elevation" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "ifcBuildingElementProxy",
                        "ifcDuctSegment",
                        "ifcDuctFitting",
                        "ifcBeam",
                        "ifcPropertySet",
                        "ifcAlarm",
                        "ifcAirTerminal",
                        "ifcCableCarrierSegment",
                        "ifcCableCarrierFitting",
                        "ifcLightFixture",
                        "ifcElectricAppliance",
                        "ifcWindow",
                        "ifcWall",
                        "ifcFireSuppressionTerminal"
                    })
                    public static class IfcBuildingStorey {

                        @XmlElement(name = "IfcBuildingElementProxy")
                        protected List<IfcBuildingElementProxy> ifcBuildingElementProxy;
                        @XmlElement(name = "IfcDuctSegment")
                        protected List<IfcDuctSegment> ifcDuctSegment;
                        @XmlElement(name = "IfcDuctFitting")
                        protected List<IfcDuctFitting> ifcDuctFitting;
                        @XmlElement(name = "IfcBeam")
                        protected List<IfcBeam> ifcBeam;
                        @XmlElement(name = "IfcPropertySet")
                        protected List<IfcPropertySet> ifcPropertySet;
                        @XmlElement(name = "IfcAlarm")
                        protected List<IfcAlarm> ifcAlarm;
                        @XmlElement(name = "IfcAirTerminal")
                        protected List<IfcAirTerminal> ifcAirTerminal;
                        @XmlElement(name = "IfcCableCarrierSegment")
                        protected List<IfcCableCarrierSegment> ifcCableCarrierSegment;
                        @XmlElement(name = "IfcCableCarrierFitting")
                        protected List<IfcCableCarrierFitting> ifcCableCarrierFitting;
                        @XmlElement(name = "IfcLightFixture")
                        protected List<IfcLightFixture> ifcLightFixture;
                        @XmlElement(name = "IfcElectricAppliance")
                        protected List<IfcElectricAppliance> ifcElectricAppliance;
                        @XmlElement(name = "IfcWindow")
                        protected List<IfcWindow> ifcWindow;
                        @XmlElement(name = "IfcWall")
                        protected List<IfcWall> ifcWall;
                        @XmlElement(name = "IfcFireSuppressionTerminal")
                        protected List<IfcFireSuppressionTerminal> ifcFireSuppressionTerminal;
                        @XmlAttribute(name = "id")
                        protected String id;
                        @XmlAttribute(name = "Name")
                        protected String name;
                        @XmlAttribute(name = "ObjectType")
                        protected String objectType;
                        @XmlAttribute(name = "ObjectPlacement")
                        protected String objectPlacement;
                        @XmlAttribute(name = "LongName")
                        protected String longName;
                        @XmlAttribute(name = "CompositionType")
                        protected String compositionType;
                        @XmlAttribute(name = "Elevation")
                        protected String elevation;

                        /**
                         * Gets the value of the ifcBuildingElementProxy property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcBuildingElementProxy property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcBuildingElementProxy().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcBuildingElementProxy }
                         * 
                         * 
                         */
                        public List<IfcBuildingElementProxy> getIfcBuildingElementProxy() {
                            if (ifcBuildingElementProxy == null) {
                                ifcBuildingElementProxy = new ArrayList<IfcBuildingElementProxy>();
                            }
                            return this.ifcBuildingElementProxy;
                        }

                        /**
                         * Gets the value of the ifcDuctSegment property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcDuctSegment property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcDuctSegment().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcDuctSegment }
                         * 
                         * 
                         */
                        public List<IfcDuctSegment> getIfcDuctSegment() {
                            if (ifcDuctSegment == null) {
                                ifcDuctSegment = new ArrayList<IfcDuctSegment>();
                            }
                            return this.ifcDuctSegment;
                        }

                        /**
                         * Gets the value of the ifcDuctFitting property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcDuctFitting property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcDuctFitting().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcDuctFitting }
                         * 
                         * 
                         */
                        public List<IfcDuctFitting> getIfcDuctFitting() {
                            if (ifcDuctFitting == null) {
                                ifcDuctFitting = new ArrayList<IfcDuctFitting>();
                            }
                            return this.ifcDuctFitting;
                        }

                        /**
                         * Gets the value of the ifcBeam property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcBeam property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcBeam().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcBeam }
                         * 
                         * 
                         */
                        public List<IfcBeam> getIfcBeam() {
                            if (ifcBeam == null) {
                                ifcBeam = new ArrayList<IfcBeam>();
                            }
                            return this.ifcBeam;
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
                         * Gets the value of the ifcAlarm property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcAlarm property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcAlarm().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcAlarm }
                         * 
                         * 
                         */
                        public List<IfcAlarm> getIfcAlarm() {
                            if (ifcAlarm == null) {
                                ifcAlarm = new ArrayList<IfcAlarm>();
                            }
                            return this.ifcAlarm;
                        }

                        /**
                         * Gets the value of the ifcAirTerminal property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcAirTerminal property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcAirTerminal().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcAirTerminal }
                         * 
                         * 
                         */
                        public List<IfcAirTerminal> getIfcAirTerminal() {
                            if (ifcAirTerminal == null) {
                                ifcAirTerminal = new ArrayList<IfcAirTerminal>();
                            }
                            return this.ifcAirTerminal;
                        }

                        /**
                         * Gets the value of the ifcCableCarrierSegment property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierSegment property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcCableCarrierSegment().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcCableCarrierSegment }
                         * 
                         * 
                         */
                        public List<IfcCableCarrierSegment> getIfcCableCarrierSegment() {
                            if (ifcCableCarrierSegment == null) {
                                ifcCableCarrierSegment = new ArrayList<IfcCableCarrierSegment>();
                            }
                            return this.ifcCableCarrierSegment;
                        }

                        /**
                         * Gets the value of the ifcCableCarrierFitting property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierFitting property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcCableCarrierFitting().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcCableCarrierFitting }
                         * 
                         * 
                         */
                        public List<IfcCableCarrierFitting> getIfcCableCarrierFitting() {
                            if (ifcCableCarrierFitting == null) {
                                ifcCableCarrierFitting = new ArrayList<IfcCableCarrierFitting>();
                            }
                            return this.ifcCableCarrierFitting;
                        }

                        /**
                         * Gets the value of the ifcLightFixture property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcLightFixture property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcLightFixture().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcLightFixture }
                         * 
                         * 
                         */
                        public List<IfcLightFixture> getIfcLightFixture() {
                            if (ifcLightFixture == null) {
                                ifcLightFixture = new ArrayList<IfcLightFixture>();
                            }
                            return this.ifcLightFixture;
                        }

                        /**
                         * Gets the value of the ifcElectricAppliance property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcElectricAppliance property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcElectricAppliance().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcElectricAppliance }
                         * 
                         * 
                         */
                        public List<IfcElectricAppliance> getIfcElectricAppliance() {
                            if (ifcElectricAppliance == null) {
                                ifcElectricAppliance = new ArrayList<IfcElectricAppliance>();
                            }
                            return this.ifcElectricAppliance;
                        }

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
                         * Gets the value of the ifcWall property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcWall property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcWall().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcWall }
                         * 
                         * 
                         */
                        public List<IfcWall> getIfcWall() {
                            if (ifcWall == null) {
                                ifcWall = new ArrayList<IfcWall>();
                            }
                            return this.ifcWall;
                        }

                        /**
                         * Gets the value of the ifcFireSuppressionTerminal property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ifcFireSuppressionTerminal property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIfcFireSuppressionTerminal().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IfcFireSuppressionTerminal }
                         * 
                         * 
                         */
                        public List<IfcFireSuppressionTerminal> getIfcFireSuppressionTerminal() {
                            if (ifcFireSuppressionTerminal == null) {
                                ifcFireSuppressionTerminal = new ArrayList<IfcFireSuppressionTerminal>();
                            }
                            return this.ifcFireSuppressionTerminal;
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
                         * 获取longName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLongName() {
                            return longName;
                        }

                        /**
                         * 设置longName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLongName(String value) {
                            this.longName = value;
                        }

                        /**
                         * 获取compositionType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompositionType() {
                            return compositionType;
                        }

                        /**
                         * 设置compositionType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompositionType(String value) {
                            this.compositionType = value;
                        }

                        /**
                         * 获取elevation属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getElevation() {
                            return elevation;
                        }

                        /**
                         * 设置elevation属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setElevation(String value) {
                            this.elevation = value;
                        }

                    }

                }

            }

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
     *       &lt;sequence>
     *         &lt;element name="IfcGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcOpeningElement" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IfcSystem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{}IfcDistributionPort" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcGroup",
        "ifcSystem"
    })
    public static class Groups {

        @XmlElement(name = "IfcGroup")
        protected List<Ifc.Groups.IfcGroup> ifcGroup;
        @XmlElement(name = "IfcSystem")
        protected List<Ifc.Groups.IfcSystem> ifcSystem;

        /**
         * Gets the value of the ifcGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Groups.IfcGroup }
         * 
         * 
         */
        public List<Ifc.Groups.IfcGroup> getIfcGroup() {
            if (ifcGroup == null) {
                ifcGroup = new ArrayList<Ifc.Groups.IfcGroup>();
            }
            return this.ifcGroup;
        }

        /**
         * Gets the value of the ifcSystem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcSystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Groups.IfcSystem }
         * 
         * 
         */
        public List<Ifc.Groups.IfcSystem> getIfcSystem() {
            if (ifcSystem == null) {
                ifcSystem = new ArrayList<Ifc.Groups.IfcSystem>();
            }
            return this.ifcSystem;
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
         *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcAirTerminal" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcLightFixture" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcCableCarrierFitting" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcCableCarrierSegment" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcWall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcAlarm" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcOpeningElement" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcBeam" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcElectricAppliance" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcWindow" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcFireSuppressionTerminal" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ifcPropertySet",
            "ifcBuildingElementProxy",
            "ifcDuctSegment",
            "ifcAirTerminal",
            "ifcLightFixture",
            "ifcCableCarrierFitting",
            "ifcDuctFitting",
            "ifcCableCarrierSegment",
            "ifcWall",
            "ifcAlarm",
            "ifcOpeningElement",
            "ifcBeam",
            "ifcElectricAppliance",
            "ifcWindow",
            "ifcFireSuppressionTerminal"
        })
        public static class IfcGroup {

            @XmlElement(name = "IfcPropertySet")
            protected List<IfcPropertySet> ifcPropertySet;
            @XmlElement(name = "IfcBuildingElementProxy")
            protected List<IfcBuildingElementProxy> ifcBuildingElementProxy;
            @XmlElement(name = "IfcDuctSegment")
            protected List<IfcDuctSegment> ifcDuctSegment;
            @XmlElement(name = "IfcAirTerminal")
            protected List<IfcAirTerminal> ifcAirTerminal;
            @XmlElement(name = "IfcLightFixture")
            protected List<IfcLightFixture> ifcLightFixture;
            @XmlElement(name = "IfcCableCarrierFitting")
            protected List<IfcCableCarrierFitting> ifcCableCarrierFitting;
            @XmlElement(name = "IfcDuctFitting")
            protected List<IfcDuctFitting> ifcDuctFitting;
            @XmlElement(name = "IfcCableCarrierSegment")
            protected List<IfcCableCarrierSegment> ifcCableCarrierSegment;
            @XmlElement(name = "IfcWall")
            protected List<IfcWall> ifcWall;
            @XmlElement(name = "IfcAlarm")
            protected List<IfcAlarm> ifcAlarm;
            @XmlElement(name = "IfcOpeningElement")
            protected List<IfcOpeningElement> ifcOpeningElement;
            @XmlElement(name = "IfcBeam")
            protected List<IfcBeam> ifcBeam;
            @XmlElement(name = "IfcElectricAppliance")
            protected List<IfcElectricAppliance> ifcElectricAppliance;
            @XmlElement(name = "IfcWindow")
            protected List<IfcWindow> ifcWindow;
            @XmlElement(name = "IfcFireSuppressionTerminal")
            protected List<IfcFireSuppressionTerminal> ifcFireSuppressionTerminal;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ObjectType")
            protected String objectType;

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
             * Gets the value of the ifcBuildingElementProxy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcBuildingElementProxy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcBuildingElementProxy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcBuildingElementProxy }
             * 
             * 
             */
            public List<IfcBuildingElementProxy> getIfcBuildingElementProxy() {
                if (ifcBuildingElementProxy == null) {
                    ifcBuildingElementProxy = new ArrayList<IfcBuildingElementProxy>();
                }
                return this.ifcBuildingElementProxy;
            }

            /**
             * Gets the value of the ifcDuctSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcDuctSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcDuctSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcDuctSegment }
             * 
             * 
             */
            public List<IfcDuctSegment> getIfcDuctSegment() {
                if (ifcDuctSegment == null) {
                    ifcDuctSegment = new ArrayList<IfcDuctSegment>();
                }
                return this.ifcDuctSegment;
            }

            /**
             * Gets the value of the ifcAirTerminal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcAirTerminal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcAirTerminal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcAirTerminal }
             * 
             * 
             */
            public List<IfcAirTerminal> getIfcAirTerminal() {
                if (ifcAirTerminal == null) {
                    ifcAirTerminal = new ArrayList<IfcAirTerminal>();
                }
                return this.ifcAirTerminal;
            }

            /**
             * Gets the value of the ifcLightFixture property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcLightFixture property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcLightFixture().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcLightFixture }
             * 
             * 
             */
            public List<IfcLightFixture> getIfcLightFixture() {
                if (ifcLightFixture == null) {
                    ifcLightFixture = new ArrayList<IfcLightFixture>();
                }
                return this.ifcLightFixture;
            }

            /**
             * Gets the value of the ifcCableCarrierFitting property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierFitting property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcCableCarrierFitting().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcCableCarrierFitting }
             * 
             * 
             */
            public List<IfcCableCarrierFitting> getIfcCableCarrierFitting() {
                if (ifcCableCarrierFitting == null) {
                    ifcCableCarrierFitting = new ArrayList<IfcCableCarrierFitting>();
                }
                return this.ifcCableCarrierFitting;
            }

            /**
             * Gets the value of the ifcDuctFitting property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcDuctFitting property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcDuctFitting().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcDuctFitting }
             * 
             * 
             */
            public List<IfcDuctFitting> getIfcDuctFitting() {
                if (ifcDuctFitting == null) {
                    ifcDuctFitting = new ArrayList<IfcDuctFitting>();
                }
                return this.ifcDuctFitting;
            }

            /**
             * Gets the value of the ifcCableCarrierSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcCableCarrierSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcCableCarrierSegment }
             * 
             * 
             */
            public List<IfcCableCarrierSegment> getIfcCableCarrierSegment() {
                if (ifcCableCarrierSegment == null) {
                    ifcCableCarrierSegment = new ArrayList<IfcCableCarrierSegment>();
                }
                return this.ifcCableCarrierSegment;
            }

            /**
             * Gets the value of the ifcWall property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcWall property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcWall().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcWall }
             * 
             * 
             */
            public List<IfcWall> getIfcWall() {
                if (ifcWall == null) {
                    ifcWall = new ArrayList<IfcWall>();
                }
                return this.ifcWall;
            }

            /**
             * Gets the value of the ifcAlarm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcAlarm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcAlarm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcAlarm }
             * 
             * 
             */
            public List<IfcAlarm> getIfcAlarm() {
                if (ifcAlarm == null) {
                    ifcAlarm = new ArrayList<IfcAlarm>();
                }
                return this.ifcAlarm;
            }

            /**
             * Gets the value of the ifcOpeningElement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcOpeningElement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcOpeningElement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcOpeningElement }
             * 
             * 
             */
            public List<IfcOpeningElement> getIfcOpeningElement() {
                if (ifcOpeningElement == null) {
                    ifcOpeningElement = new ArrayList<IfcOpeningElement>();
                }
                return this.ifcOpeningElement;
            }

            /**
             * Gets the value of the ifcBeam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcBeam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcBeam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcBeam }
             * 
             * 
             */
            public List<IfcBeam> getIfcBeam() {
                if (ifcBeam == null) {
                    ifcBeam = new ArrayList<IfcBeam>();
                }
                return this.ifcBeam;
            }

            /**
             * Gets the value of the ifcElectricAppliance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcElectricAppliance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcElectricAppliance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcElectricAppliance }
             * 
             * 
             */
            public List<IfcElectricAppliance> getIfcElectricAppliance() {
                if (ifcElectricAppliance == null) {
                    ifcElectricAppliance = new ArrayList<IfcElectricAppliance>();
                }
                return this.ifcElectricAppliance;
            }

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
             * Gets the value of the ifcFireSuppressionTerminal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcFireSuppressionTerminal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcFireSuppressionTerminal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcFireSuppressionTerminal }
             * 
             * 
             */
            public List<IfcFireSuppressionTerminal> getIfcFireSuppressionTerminal() {
                if (ifcFireSuppressionTerminal == null) {
                    ifcFireSuppressionTerminal = new ArrayList<IfcFireSuppressionTerminal>();
                }
                return this.ifcFireSuppressionTerminal;
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
         *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcBuildingElementProxy" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcDuctSegment" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcDuctFitting" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{}IfcDistributionPort" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ifcPropertySet",
            "ifcBuildingElementProxy",
            "ifcDuctSegment",
            "ifcDuctFitting",
            "ifcDistributionPort"
        })
        public static class IfcSystem {

            @XmlElement(name = "IfcPropertySet")
            protected List<IfcPropertySet> ifcPropertySet;
            @XmlElement(name = "IfcBuildingElementProxy")
            protected List<IfcBuildingElementProxy> ifcBuildingElementProxy;
            @XmlElement(name = "IfcDuctSegment")
            protected List<IfcDuctSegment> ifcDuctSegment;
            @XmlElement(name = "IfcDuctFitting")
            protected List<IfcDuctFitting> ifcDuctFitting;
            @XmlElement(name = "IfcDistributionPort")
            protected List<IfcDistributionPort> ifcDistributionPort;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ObjectType")
            protected String objectType;

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
             * Gets the value of the ifcBuildingElementProxy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcBuildingElementProxy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcBuildingElementProxy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcBuildingElementProxy }
             * 
             * 
             */
            public List<IfcBuildingElementProxy> getIfcBuildingElementProxy() {
                if (ifcBuildingElementProxy == null) {
                    ifcBuildingElementProxy = new ArrayList<IfcBuildingElementProxy>();
                }
                return this.ifcBuildingElementProxy;
            }

            /**
             * Gets the value of the ifcDuctSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcDuctSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcDuctSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcDuctSegment }
             * 
             * 
             */
            public List<IfcDuctSegment> getIfcDuctSegment() {
                if (ifcDuctSegment == null) {
                    ifcDuctSegment = new ArrayList<IfcDuctSegment>();
                }
                return this.ifcDuctSegment;
            }

            /**
             * Gets the value of the ifcDuctFitting property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcDuctFitting property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcDuctFitting().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcDuctFitting }
             * 
             * 
             */
            public List<IfcDuctFitting> getIfcDuctFitting() {
                if (ifcDuctFitting == null) {
                    ifcDuctFitting = new ArrayList<IfcDuctFitting>();
                }
                return this.ifcDuctFitting;
            }

            /**
             * Gets the value of the ifcDistributionPort property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ifcDistributionPort property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIfcDistributionPort().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IfcDistributionPort }
             * 
             * 
             */
            public List<IfcDistributionPort> getIfcDistributionPort() {
                if (ifcDistributionPort == null) {
                    ifcDistributionPort = new ArrayList<IfcDistributionPort>();
                }
                return this.ifcDistributionPort;
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
     *       &lt;sequence>
     *         &lt;element name="file_description" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="implementation_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="file_name" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="time_stamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preprocessor_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originating_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="file_schema" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="schema_identifiers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileDescription",
        "fileName",
        "fileSchema"
    })
    public static class Header {

        @XmlElement(name = "file_description")
        protected List<Ifc.Header.FileDescription> fileDescription;
        @XmlElement(name = "file_name")
        protected List<Ifc.Header.FileName> fileName;
        @XmlElement(name = "file_schema")
        protected List<Ifc.Header.FileSchema> fileSchema;

        /**
         * Gets the value of the fileDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fileDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFileDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Header.FileDescription }
         * 
         * 
         */
        public List<Ifc.Header.FileDescription> getFileDescription() {
            if (fileDescription == null) {
                fileDescription = new ArrayList<Ifc.Header.FileDescription>();
            }
            return this.fileDescription;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Header.FileName }
         * 
         * 
         */
        public List<Ifc.Header.FileName> getFileName() {
            if (fileName == null) {
                fileName = new ArrayList<Ifc.Header.FileName>();
            }
            return this.fileName;
        }

        /**
         * Gets the value of the fileSchema property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fileSchema property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFileSchema().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Header.FileSchema }
         * 
         * 
         */
        public List<Ifc.Header.FileSchema> getFileSchema() {
            if (fileSchema == null) {
                fileSchema = new ArrayList<Ifc.Header.FileSchema>();
            }
            return this.fileSchema;
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
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="implementation_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description",
            "implementationLevel"
        })
        public static class FileDescription {

            protected String description;
            @XmlElement(name = "implementation_level")
            protected String implementationLevel;

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
             * 获取implementationLevel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImplementationLevel() {
                return implementationLevel;
            }

            /**
             * 设置implementationLevel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImplementationLevel(String value) {
                this.implementationLevel = value;
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
         *       &lt;sequence>
         *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="time_stamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preprocessor_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originating_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "author",
            "organization",
            "name",
            "timeStamp",
            "preprocessorVersion",
            "originatingSystem",
            "authorization"
        })
        public static class FileName {

            protected String author;
            protected String organization;
            protected String name;
            @XmlElement(name = "time_stamp")
            protected String timeStamp;
            @XmlElement(name = "preprocessor_version")
            protected String preprocessorVersion;
            @XmlElement(name = "originating_system")
            protected String originatingSystem;
            protected String authorization;

            /**
             * 获取author属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthor() {
                return author;
            }

            /**
             * 设置author属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthor(String value) {
                this.author = value;
            }

            /**
             * 获取organization属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganization() {
                return organization;
            }

            /**
             * 设置organization属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganization(String value) {
                this.organization = value;
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
             * 获取timeStamp属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimeStamp() {
                return timeStamp;
            }

            /**
             * 设置timeStamp属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimeStamp(String value) {
                this.timeStamp = value;
            }

            /**
             * 获取preprocessorVersion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreprocessorVersion() {
                return preprocessorVersion;
            }

            /**
             * 设置preprocessorVersion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreprocessorVersion(String value) {
                this.preprocessorVersion = value;
            }

            /**
             * 获取originatingSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginatingSystem() {
                return originatingSystem;
            }

            /**
             * 设置originatingSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginatingSystem(String value) {
                this.originatingSystem = value;
            }

            /**
             * 获取authorization属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorization() {
                return authorization;
            }

            /**
             * 设置authorization属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorization(String value) {
                this.authorization = value;
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
         *       &lt;sequence>
         *         &lt;element name="schema_identifiers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "schemaIdentifiers"
        })
        public static class FileSchema {

            @XmlElement(name = "schema_identifiers")
            protected String schemaIdentifiers;

            /**
             * 获取schemaIdentifiers属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemaIdentifiers() {
                return schemaIdentifiers;
            }

            /**
             * 设置schemaIdentifiers属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemaIdentifiers(String value) {
                this.schemaIdentifiers = value;
            }

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
     *       &lt;sequence>
     *         &lt;element ref="{}IfcPresentationLayerAssignment" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcPresentationLayerAssignment"
    })
    public static class Layers {

        @XmlElement(name = "IfcPresentationLayerAssignment")
        protected List<IfcPresentationLayerAssignment> ifcPresentationLayerAssignment;

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
     *         &lt;element ref="{}IfcMaterialConstituentSet" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcMaterial" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcMaterialConstituentSet",
        "ifcMaterial"
    })
    public static class Materials {

        @XmlElement(name = "IfcMaterialConstituentSet")
        protected List<IfcMaterialConstituentSet> ifcMaterialConstituentSet;
        @XmlElement(name = "IfcMaterial")
        protected List<IfcMaterial> ifcMaterial;

        /**
         * Gets the value of the ifcMaterialConstituentSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcMaterialConstituentSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcMaterialConstituentSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcMaterialConstituentSet }
         * 
         * 
         */
        public List<IfcMaterialConstituentSet> getIfcMaterialConstituentSet() {
            if (ifcMaterialConstituentSet == null) {
                ifcMaterialConstituentSet = new ArrayList<IfcMaterialConstituentSet>();
            }
            return this.ifcMaterialConstituentSet;
        }

        /**
         * Gets the value of the ifcMaterial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcMaterial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcMaterial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcMaterial }
         * 
         * 
         */
        public List<IfcMaterial> getIfcMaterial() {
            if (ifcMaterial == null) {
                ifcMaterial = new ArrayList<IfcMaterial>();
            }
            return this.ifcMaterial;
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
     *       &lt;sequence>
     *         &lt;element ref="{}IfcPropertySet" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcPropertySet"
    })
    public static class Properties {

        @XmlElement(name = "IfcPropertySet")
        protected List<IfcPropertySet> ifcPropertySet;

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
     *         &lt;element ref="{}IfcElementQuantity" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcElementQuantity"
    })
    public static class Quantities {

        @XmlElement(name = "IfcElementQuantity")
        protected List<IfcElementQuantity> ifcElementQuantity;

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
     *         &lt;element ref="{}IfcAlarmType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcBuildingElementProxyType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcDuctSegmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcAirTerminalType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcDuctFittingType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcCableCarrierSegmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcCableCarrierFittingType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcLightFixtureType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcBeamType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcElectricApplianceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcWindowType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcWallType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}IfcFireSuppressionTerminalType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcAlarmType",
        "ifcBuildingElementProxyType",
        "ifcDuctSegmentType",
        "ifcAirTerminalType",
        "ifcDuctFittingType",
        "ifcCableCarrierSegmentType",
        "ifcCableCarrierFittingType",
        "ifcLightFixtureType",
        "ifcBeamType",
        "ifcElectricApplianceType",
        "ifcWindowType",
        "ifcWallType",
        "ifcFireSuppressionTerminalType"
    })
    public static class Types {

        @XmlElement(name = "IfcAlarmType")
        protected List<IfcAlarmType> ifcAlarmType;
        @XmlElement(name = "IfcBuildingElementProxyType")
        protected List<IfcBuildingElementProxyType> ifcBuildingElementProxyType;
        @XmlElement(name = "IfcDuctSegmentType")
        protected List<IfcDuctSegmentType> ifcDuctSegmentType;
        @XmlElement(name = "IfcAirTerminalType")
        protected List<IfcAirTerminalType> ifcAirTerminalType;
        @XmlElement(name = "IfcDuctFittingType")
        protected List<IfcDuctFittingType> ifcDuctFittingType;
        @XmlElement(name = "IfcCableCarrierSegmentType")
        protected List<IfcCableCarrierSegmentType> ifcCableCarrierSegmentType;
        @XmlElement(name = "IfcCableCarrierFittingType")
        protected List<IfcCableCarrierFittingType> ifcCableCarrierFittingType;
        @XmlElement(name = "IfcLightFixtureType")
        protected List<IfcLightFixtureType> ifcLightFixtureType;
        @XmlElement(name = "IfcBeamType")
        protected List<IfcBeamType> ifcBeamType;
        @XmlElement(name = "IfcElectricApplianceType")
        protected List<IfcElectricApplianceType> ifcElectricApplianceType;
        @XmlElement(name = "IfcWindowType")
        protected List<IfcWindowType> ifcWindowType;
        @XmlElement(name = "IfcWallType")
        protected List<IfcWallType> ifcWallType;
        @XmlElement(name = "IfcFireSuppressionTerminalType")
        protected List<IfcFireSuppressionTerminalType> ifcFireSuppressionTerminalType;

        /**
         * Gets the value of the ifcAlarmType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcAlarmType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcAlarmType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcAlarmType }
         * 
         * 
         */
        public List<IfcAlarmType> getIfcAlarmType() {
            if (ifcAlarmType == null) {
                ifcAlarmType = new ArrayList<IfcAlarmType>();
            }
            return this.ifcAlarmType;
        }

        /**
         * Gets the value of the ifcBuildingElementProxyType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcBuildingElementProxyType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcBuildingElementProxyType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcBuildingElementProxyType }
         * 
         * 
         */
        public List<IfcBuildingElementProxyType> getIfcBuildingElementProxyType() {
            if (ifcBuildingElementProxyType == null) {
                ifcBuildingElementProxyType = new ArrayList<IfcBuildingElementProxyType>();
            }
            return this.ifcBuildingElementProxyType;
        }

        /**
         * Gets the value of the ifcDuctSegmentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcDuctSegmentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcDuctSegmentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcDuctSegmentType }
         * 
         * 
         */
        public List<IfcDuctSegmentType> getIfcDuctSegmentType() {
            if (ifcDuctSegmentType == null) {
                ifcDuctSegmentType = new ArrayList<IfcDuctSegmentType>();
            }
            return this.ifcDuctSegmentType;
        }

        /**
         * Gets the value of the ifcAirTerminalType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcAirTerminalType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcAirTerminalType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcAirTerminalType }
         * 
         * 
         */
        public List<IfcAirTerminalType> getIfcAirTerminalType() {
            if (ifcAirTerminalType == null) {
                ifcAirTerminalType = new ArrayList<IfcAirTerminalType>();
            }
            return this.ifcAirTerminalType;
        }

        /**
         * Gets the value of the ifcDuctFittingType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcDuctFittingType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcDuctFittingType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcDuctFittingType }
         * 
         * 
         */
        public List<IfcDuctFittingType> getIfcDuctFittingType() {
            if (ifcDuctFittingType == null) {
                ifcDuctFittingType = new ArrayList<IfcDuctFittingType>();
            }
            return this.ifcDuctFittingType;
        }

        /**
         * Gets the value of the ifcCableCarrierSegmentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierSegmentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcCableCarrierSegmentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcCableCarrierSegmentType }
         * 
         * 
         */
        public List<IfcCableCarrierSegmentType> getIfcCableCarrierSegmentType() {
            if (ifcCableCarrierSegmentType == null) {
                ifcCableCarrierSegmentType = new ArrayList<IfcCableCarrierSegmentType>();
            }
            return this.ifcCableCarrierSegmentType;
        }

        /**
         * Gets the value of the ifcCableCarrierFittingType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcCableCarrierFittingType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcCableCarrierFittingType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcCableCarrierFittingType }
         * 
         * 
         */
        public List<IfcCableCarrierFittingType> getIfcCableCarrierFittingType() {
            if (ifcCableCarrierFittingType == null) {
                ifcCableCarrierFittingType = new ArrayList<IfcCableCarrierFittingType>();
            }
            return this.ifcCableCarrierFittingType;
        }

        /**
         * Gets the value of the ifcLightFixtureType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcLightFixtureType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcLightFixtureType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcLightFixtureType }
         * 
         * 
         */
        public List<IfcLightFixtureType> getIfcLightFixtureType() {
            if (ifcLightFixtureType == null) {
                ifcLightFixtureType = new ArrayList<IfcLightFixtureType>();
            }
            return this.ifcLightFixtureType;
        }

        /**
         * Gets the value of the ifcBeamType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcBeamType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcBeamType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcBeamType }
         * 
         * 
         */
        public List<IfcBeamType> getIfcBeamType() {
            if (ifcBeamType == null) {
                ifcBeamType = new ArrayList<IfcBeamType>();
            }
            return this.ifcBeamType;
        }

        /**
         * Gets the value of the ifcElectricApplianceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcElectricApplianceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcElectricApplianceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcElectricApplianceType }
         * 
         * 
         */
        public List<IfcElectricApplianceType> getIfcElectricApplianceType() {
            if (ifcElectricApplianceType == null) {
                ifcElectricApplianceType = new ArrayList<IfcElectricApplianceType>();
            }
            return this.ifcElectricApplianceType;
        }

        /**
         * Gets the value of the ifcWindowType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcWindowType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcWindowType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcWindowType }
         * 
         * 
         */
        public List<IfcWindowType> getIfcWindowType() {
            if (ifcWindowType == null) {
                ifcWindowType = new ArrayList<IfcWindowType>();
            }
            return this.ifcWindowType;
        }

        /**
         * Gets the value of the ifcWallType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcWallType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcWallType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcWallType }
         * 
         * 
         */
        public List<IfcWallType> getIfcWallType() {
            if (ifcWallType == null) {
                ifcWallType = new ArrayList<IfcWallType>();
            }
            return this.ifcWallType;
        }

        /**
         * Gets the value of the ifcFireSuppressionTerminalType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcFireSuppressionTerminalType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcFireSuppressionTerminalType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcFireSuppressionTerminalType }
         * 
         * 
         */
        public List<IfcFireSuppressionTerminalType> getIfcFireSuppressionTerminalType() {
            if (ifcFireSuppressionTerminalType == null) {
                ifcFireSuppressionTerminalType = new ArrayList<IfcFireSuppressionTerminalType>();
            }
            return this.ifcFireSuppressionTerminalType;
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
     *       &lt;sequence>
     *         &lt;element name="IfcSIUnit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IfcConversionBasedUnit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcSIUnit",
        "ifcConversionBasedUnit"
    })
    public static class Units {

        @XmlElement(name = "IfcSIUnit")
        protected List<Ifc.Units.IfcSIUnit> ifcSIUnit;
        @XmlElement(name = "IfcConversionBasedUnit")
        protected List<Ifc.Units.IfcConversionBasedUnit> ifcConversionBasedUnit;

        /**
         * Gets the value of the ifcSIUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcSIUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcSIUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Units.IfcSIUnit }
         * 
         * 
         */
        public List<Ifc.Units.IfcSIUnit> getIfcSIUnit() {
            if (ifcSIUnit == null) {
                ifcSIUnit = new ArrayList<Ifc.Units.IfcSIUnit>();
            }
            return this.ifcSIUnit;
        }

        /**
         * Gets the value of the ifcConversionBasedUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcConversionBasedUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcConversionBasedUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ifc.Units.IfcConversionBasedUnit }
         * 
         * 
         */
        public List<Ifc.Units.IfcConversionBasedUnit> getIfcConversionBasedUnit() {
            if (ifcConversionBasedUnit == null) {
                ifcConversionBasedUnit = new ArrayList<Ifc.Units.IfcConversionBasedUnit>();
            }
            return this.ifcConversionBasedUnit;
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
         *       &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IfcConversionBasedUnit {

            @XmlAttribute(name = "UnitType")
            protected String unitType;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "SI_equivalent")
            protected String siEquivalent;

            /**
             * 获取unitType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitType() {
                return unitType;
            }

            /**
             * 设置unitType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitType(String value) {
                this.unitType = value;
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
             * 获取siEquivalent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIEquivalent() {
                return siEquivalent;
            }

            /**
             * 设置siEquivalent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIEquivalent(String value) {
                this.siEquivalent = value;
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
         *       &lt;attribute name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SI_equivalent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IfcSIUnit {

            @XmlAttribute(name = "UnitType")
            protected String unitType;
            @XmlAttribute(name = "Prefix")
            protected String prefix;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "SI_equivalent")
            protected String siEquivalent;

            /**
             * 获取unitType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitType() {
                return unitType;
            }

            /**
             * 设置unitType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitType(String value) {
                this.unitType = value;
            }

            /**
             * 获取prefix属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefix() {
                return prefix;
            }

            /**
             * 设置prefix属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefix(String value) {
                this.prefix = value;
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
             * 获取siEquivalent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIEquivalent() {
                return siEquivalent;
            }

            /**
             * 设置siEquivalent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIEquivalent(String value) {
                this.siEquivalent = value;
            }

        }

    }

}
