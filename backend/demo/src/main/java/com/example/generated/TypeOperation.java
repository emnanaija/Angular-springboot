//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.02 à 10:13:30 PM GMT+01:00 
//


package com.example.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnneeFacturation"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[2][0][0-9]{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNPC" type="{}TypeTorF"/&gt;
 *         &lt;element name="P_Charge" type="{}TypeTorF"/&gt;
 *         &lt;element name="MontantHT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TauxRS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="100"/&gt;
 *               &lt;totalDigits value="5"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TauxTVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="100"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *               &lt;totalDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontantTVA" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MontantTTC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MontantRS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;pattern value="[\-+]?[0-9]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxeAdditionnelle" type="{}taxeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MontantNetServi" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Devise" type="{}TypeMontantDevise" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IdTypeOperation" use="required" type="{}TypeCodesOperations" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOperation", propOrder = {
    "anneeFacturation",
    "cnpc",
    "pCharge",
    "montantHT",
    "tauxRS",
    "tauxTVA",
    "montantTVA",
    "montantTTC",
    "montantRS",
    "taxeAdditionnelle",
    "montantNetServi",
    "devise"
})
public class TypeOperation {

    @XmlElement(name = "AnneeFacturation", required = true)
    protected String anneeFacturation;
    @XmlElement(name = "CNPC", required = true)
    protected BigInteger cnpc;
    @XmlElement(name = "P_Charge", required = true)
    protected BigInteger pCharge;
    @XmlElement(name = "MontantHT", required = true)
    protected BigInteger montantHT;
    @XmlElement(name = "TauxRS", required = true)
    protected BigDecimal tauxRS;
    @XmlElement(name = "TauxTVA")
    protected BigDecimal tauxTVA;
    @XmlElement(name = "MontantTVA")
    protected BigInteger montantTVA;
    @XmlElement(name = "MontantTTC", required = true)
    protected BigInteger montantTTC;
    @XmlElement(name = "MontantRS", required = true)
    protected BigInteger montantRS;
    @XmlElement(name = "TaxeAdditionnelle")
    protected List<TaxeType> taxeAdditionnelle;
    @XmlElement(name = "MontantNetServi", required = true)
    protected BigInteger montantNetServi;
    @XmlElement(name = "Devise")
    protected TypeMontantDevise devise;
    @XmlAttribute(name = "IdTypeOperation", required = true)
    protected TypeCodesOperations idTypeOperation;

    /**
     * Obtient la valeur de la propriété anneeFacturation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeFacturation() {
        return anneeFacturation;
    }

    /**
     * Définit la valeur de la propriété anneeFacturation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeFacturation(String value) {
        this.anneeFacturation = value;
    }

    /**
     * Obtient la valeur de la propriété cnpc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCNPC() {
        return cnpc;
    }

    /**
     * Définit la valeur de la propriété cnpc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCNPC(BigInteger value) {
        this.cnpc = value;
    }

    /**
     * Obtient la valeur de la propriété pCharge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPCharge() {
        return pCharge;
    }

    /**
     * Définit la valeur de la propriété pCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPCharge(BigInteger value) {
        this.pCharge = value;
    }

    /**
     * Obtient la valeur de la propriété montantHT.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMontantHT() {
        return montantHT;
    }

    /**
     * Définit la valeur de la propriété montantHT.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMontantHT(BigInteger value) {
        this.montantHT = value;
    }

    /**
     * Obtient la valeur de la propriété tauxRS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTauxRS() {
        return tauxRS;
    }

    /**
     * Définit la valeur de la propriété tauxRS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTauxRS(BigDecimal value) {
        this.tauxRS = value;
    }

    /**
     * Obtient la valeur de la propriété tauxTVA.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTauxTVA() {
        return tauxTVA;
    }

    /**
     * Définit la valeur de la propriété tauxTVA.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTauxTVA(BigDecimal value) {
        this.tauxTVA = value;
    }

    /**
     * Obtient la valeur de la propriété montantTVA.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMontantTVA() {
        return montantTVA;
    }

    /**
     * Définit la valeur de la propriété montantTVA.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMontantTVA(BigInteger value) {
        this.montantTVA = value;
    }

    /**
     * Obtient la valeur de la propriété montantTTC.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMontantTTC() {
        return montantTTC;
    }

    /**
     * Définit la valeur de la propriété montantTTC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMontantTTC(BigInteger value) {
        this.montantTTC = value;
    }

    /**
     * Obtient la valeur de la propriété montantRS.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMontantRS() {
        return montantRS;
    }

    /**
     * Définit la valeur de la propriété montantRS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMontantRS(BigInteger value) {
        this.montantRS = value;
    }

    /**
     * Gets the value of the taxeAdditionnelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxeAdditionnelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxeAdditionnelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxeType }
     * 
     * 
     */
    public List<TaxeType> getTaxeAdditionnelle() {
        if (taxeAdditionnelle == null) {
            taxeAdditionnelle = new ArrayList<TaxeType>();
        }
        return this.taxeAdditionnelle;
    }

    /**
     * Obtient la valeur de la propriété montantNetServi.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMontantNetServi() {
        return montantNetServi;
    }

    /**
     * Définit la valeur de la propriété montantNetServi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMontantNetServi(BigInteger value) {
        this.montantNetServi = value;
    }

    /**
     * Obtient la valeur de la propriété devise.
     * 
     * @return
     *     possible object is
     *     {@link TypeMontantDevise }
     *     
     */
    public TypeMontantDevise getDevise() {
        return devise;
    }

    /**
     * Définit la valeur de la propriété devise.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMontantDevise }
     *     
     */
    public void setDevise(TypeMontantDevise value) {
        this.devise = value;
    }

    /**
     * Obtient la valeur de la propriété idTypeOperation.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodesOperations }
     *     
     */
    public TypeCodesOperations getIdTypeOperation() {
        return idTypeOperation;
    }

    /**
     * Définit la valeur de la propriété idTypeOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodesOperations }
     *     
     */
    public void setIdTypeOperation(TypeCodesOperations value) {
        this.idTypeOperation = value;
    }

}
