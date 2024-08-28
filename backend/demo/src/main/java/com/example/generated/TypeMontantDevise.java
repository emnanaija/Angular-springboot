//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeMontantDevise complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeMontantDevise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeDevise" type="{}TypeCodeDevise"/&gt;
 *         &lt;element name="TauxChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MontantRSDevise" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MontantTTCDevise" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MontantNetServiDevise" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeMontantDevise", propOrder = {
    "codeDevise",
    "tauxChange",
    "montantRSDevise",
    "montantTTCDevise",
    "montantNetServiDevise"
})
public class TypeMontantDevise {

    @XmlElement(name = "CodeDevise", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCodeDevise codeDevise;
    @XmlElement(name = "TauxChange", required = true)
    protected BigDecimal tauxChange;
    @XmlElement(name = "MontantRSDevise", required = true)
    protected BigDecimal montantRSDevise;
    @XmlElement(name = "MontantTTCDevise", required = true)
    protected BigDecimal montantTTCDevise;
    @XmlElement(name = "MontantNetServiDevise", required = true)
    protected BigDecimal montantNetServiDevise;

    /**
     * Obtient la valeur de la propriété codeDevise.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeDevise }
     *     
     */
    public TypeCodeDevise getCodeDevise() {
        return codeDevise;
    }

    /**
     * Définit la valeur de la propriété codeDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeDevise }
     *     
     */
    public void setCodeDevise(TypeCodeDevise value) {
        this.codeDevise = value;
    }

    /**
     * Obtient la valeur de la propriété tauxChange.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTauxChange() {
        return tauxChange;
    }

    /**
     * Définit la valeur de la propriété tauxChange.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTauxChange(BigDecimal value) {
        this.tauxChange = value;
    }

    /**
     * Obtient la valeur de la propriété montantRSDevise.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontantRSDevise() {
        return montantRSDevise;
    }

    /**
     * Définit la valeur de la propriété montantRSDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontantRSDevise(BigDecimal value) {
        this.montantRSDevise = value;
    }

    /**
     * Obtient la valeur de la propriété montantTTCDevise.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontantTTCDevise() {
        return montantTTCDevise;
    }

    /**
     * Définit la valeur de la propriété montantTTCDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontantTTCDevise(BigDecimal value) {
        this.montantTTCDevise = value;
    }

    /**
     * Obtient la valeur de la propriété montantNetServiDevise.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontantNetServiDevise() {
        return montantNetServiDevise;
    }

    /**
     * Définit la valeur de la propriété montantNetServiDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontantNetServiDevise(BigDecimal value) {
        this.montantNetServiDevise = value;
    }

}
