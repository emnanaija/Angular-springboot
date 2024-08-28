//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour totalMntDeviseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="totalMntDeviseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalMontantDevise" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalMontantRS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TotalMontantTTC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TotalMontantNetServi" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Code" use="required" type="{}TypeCodeDevise" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalMntDeviseType", propOrder = {
    "totalMontantDevise"
})
public class TotalMntDeviseType {

    @XmlElement(name = "TotalMontantDevise")
    protected List<TotalMntDeviseType.TotalMontantDevise> totalMontantDevise;

    /**
     * Gets the value of the totalMontantDevise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the totalMontantDevise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalMontantDevise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalMntDeviseType.TotalMontantDevise }
     * 
     * 
     */
    public List<TotalMntDeviseType.TotalMontantDevise> getTotalMontantDevise() {
        if (totalMontantDevise == null) {
            totalMontantDevise = new ArrayList<TotalMntDeviseType.TotalMontantDevise>();
        }
        return this.totalMontantDevise;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TotalMontantRS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TotalMontantTTC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TotalMontantNetServi" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Code" use="required" type="{}TypeCodeDevise" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalMontantRS",
        "totalMontantTTC",
        "totalMontantNetServi"
    })
    public static class TotalMontantDevise {

        @XmlElement(name = "TotalMontantRS", required = true)
        protected BigDecimal totalMontantRS;
        @XmlElement(name = "TotalMontantTTC", required = true)
        protected BigDecimal totalMontantTTC;
        @XmlElement(name = "TotalMontantNetServi", required = true)
        protected BigDecimal totalMontantNetServi;
        @XmlAttribute(name = "Code", required = true)
        protected TypeCodeDevise code;

        /**
         * Obtient la valeur de la propriété totalMontantRS.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMontantRS() {
            return totalMontantRS;
        }

        /**
         * Définit la valeur de la propriété totalMontantRS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMontantRS(BigDecimal value) {
            this.totalMontantRS = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantTTC.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMontantTTC() {
            return totalMontantTTC;
        }

        /**
         * Définit la valeur de la propriété totalMontantTTC.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMontantTTC(BigDecimal value) {
            this.totalMontantTTC = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantNetServi.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMontantNetServi() {
            return totalMontantNetServi;
        }

        /**
         * Définit la valeur de la propriété totalMontantNetServi.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMontantNetServi(BigDecimal value) {
            this.totalMontantNetServi = value;
        }

        /**
         * Obtient la valeur de la propriété code.
         * 
         * @return
         *     possible object is
         *     {@link TypeCodeDevise }
         *     
         */
        public TypeCodeDevise getCode() {
            return code;
        }

        /**
         * Définit la valeur de la propriété code.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCodeDevise }
         *     
         */
        public void setCode(TypeCodeDevise value) {
            this.code = value;
        }

    }

}
