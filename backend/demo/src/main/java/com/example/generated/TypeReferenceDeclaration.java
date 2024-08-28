//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Références de dépôt du fichier XML composée du code acte et de la période à déclarer
 * 
 * <p>Classe Java pour TypeReferenceDeclaration complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeReferenceDeclaration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActeDepot" type="{}TypeActeDepot"/&gt;
 *         &lt;element name="AnneeDepot"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[2][0][0-9]{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MoisDepot" type="{}TypePeriodes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeReferenceDeclaration", propOrder = {
    "acteDepot",
    "anneeDepot",
    "moisDepot"
})
public class TypeReferenceDeclaration {

    @XmlElement(name = "ActeDepot", required = true)
    protected String acteDepot;
    @XmlElement(name = "AnneeDepot", required = true)
    protected String anneeDepot;
    @XmlElement(name = "MoisDepot", required = true)
    protected String moisDepot;

    /**
     * Obtient la valeur de la propriété acteDepot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActeDepot() {
        return acteDepot;
    }

    /**
     * Définit la valeur de la propriété acteDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActeDepot(String value) {
        this.acteDepot = value;
    }

    /**
     * Obtient la valeur de la propriété anneeDepot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeDepot() {
        return anneeDepot;
    }

    /**
     * Définit la valeur de la propriété anneeDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeDepot(String value) {
        this.anneeDepot = value;
    }

    /**
     * Obtient la valeur de la propriété moisDepot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoisDepot() {
        return moisDepot;
    }

    /**
     * Définit la valeur de la propriété moisDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoisDepot(String value) {
        this.moisDepot = value;
    }

}
