/*******************************************************************************
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Martin Vojtek - 2.6.0 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.perf.largexml.bigpo.common_aggregate_components;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.common_basic_components.DurationMeasureType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.common_basic_components.EndDateTimeType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.common_basic_components.StartDateTimeType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.unspecialized_data_types.CodeType;


/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Period. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;information directly relating to a period, a length of time between two known date/time points.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Period&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 *
 *
 * <p>Java class for PeriodType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0}StartDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0}EndDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0}DurationMeasure" minOccurs="0"/>
 *         &lt;element name="DescriptionCode" type="{urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodType", propOrder = {
    "startDateTime",
    "endDateTime",
    "durationMeasure",
    "descriptionCode"
})
public class PeriodType {

    @XmlElement(name = "StartDateTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0")
    protected StartDateTimeType startDateTime;
    @XmlElement(name = "EndDateTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0")
    protected EndDateTimeType endDateTime;
    @XmlElement(name = "DurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0")
    protected DurationMeasureType durationMeasure;
    @XmlElement(name = "DescriptionCode")
    protected List<CodeType> descriptionCode;

    /**
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Period. Start Date Time. Date Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;specifies the first point in date/time for a period.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Period&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Start Date Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link StartDateTimeType }
     *
     */
    public StartDateTimeType getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link StartDateTimeType }
     *
     */
    public void setStartDateTime(StartDateTimeType value) {
        this.startDateTime = value;
    }

    /**
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Period. End Date Time. Date Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;specifies the last point in date/time of a period.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Period&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;End Date Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link EndDateTimeType }
     *
     */
    public EndDateTimeType getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link EndDateTimeType }
     *
     */
    public void setEndDateTime(EndDateTimeType value) {
        this.endDateTime = value;
    }

    /**
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Period. Duration. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A duration of time expressed as a formal code. The Measure. Code inside the Measure. Type should be ISO 8601.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Period&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Duration&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link DurationMeasureType }
     *
     */
    public DurationMeasureType getDurationMeasure() {
        return durationMeasure;
    }

    /**
     * Sets the value of the durationMeasure property.
     *
     * @param value
     *     allowed object is
     *     {@link DurationMeasureType }
     *
     */
    public void setDurationMeasure(DurationMeasureType value) {
        this.durationMeasure = value;
    }

    /**
     * Gets the value of the descriptionCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     *
     *
     */
    public List<CodeType> getDescriptionCode() {
        if (descriptionCode == null) {
            descriptionCode = new ArrayList<CodeType>();
        }
        return this.descriptionCode;
    }

}
