//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour TypeCertificat complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeCertificat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beneficiaire" type="{}TypeTaxpayer"/&gt;
 *         &lt;element name="DatePayement"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;pattern value="((31/(0[13578]|1[02])/((19|20)\d{2}))|((0[1-9]|[12]\d|30)/(0[13456789]|1[012])/((19|20)\d{2}))|((0[1-9]|1\d|2[0-8])/02/((19|20)\d{2}))|(29/02/(19|20)((0[048]|[2468][048]|[13579][26]))))"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ref_certif_chez_declarant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListeOperations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Operation" type="{}TypeOperation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalPayement"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalMontantHT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TotalMontantTVA" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TotalMontantTTC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TotalMontantRS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TotalTaxes" type="{}TotalMontantTaxeType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMontantNetServi" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TotalDevise" type="{}totalMntDeviseType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "TypeCertificat", propOrder = {
    "beneficiaire",
    "datePayement",
    "refCertifChezDeclarant",
    "listeOperations",
    "totalPayement"
})
public class TypeCertificat {

    @XmlElement(name = "Beneficiaire", required = true)
    protected TypeTaxpayer beneficiaire;
    @XmlElement(name = "DatePayement", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datePayement;
    @XmlElement(name = "Ref_certif_chez_declarant", required = true)
    protected String refCertifChezDeclarant;
    @XmlElement(name = "ListeOperations", required = true)
    protected TypeCertificat.ListeOperations listeOperations;
    @XmlElement(name = "TotalPayement", required = true)
    protected TypeCertificat.TotalPayement totalPayement;

    /**
     * Obtient la valeur de la propriété beneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link TypeTaxpayer }
     *     
     */
    public TypeTaxpayer getBeneficiaire() {
        return beneficiaire;
    }

    /**
     * Définit la valeur de la propriété beneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTaxpayer }
     *     
     */
    public void setBeneficiaire(TypeTaxpayer value) {
        this.beneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété datePayement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePayement() {
        return datePayement;
    }

    /**
     * Définit la valeur de la propriété datePayement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePayement(String value) {
        this.datePayement = value;
    }

    /**
     * Obtient la valeur de la propriété refCertifChezDeclarant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCertifChezDeclarant() {
        return refCertifChezDeclarant;
    }

    /**
     * Définit la valeur de la propriété refCertifChezDeclarant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCertifChezDeclarant(String value) {
        this.refCertifChezDeclarant = value;
    }

    /**
     * Obtient la valeur de la propriété listeOperations.
     * 
     * @return
     *     possible object is
     *     {@link TypeCertificat.ListeOperations }
     *     
     */
    public TypeCertificat.ListeOperations getListeOperations() {
        return listeOperations;
    }

    /**
     * Définit la valeur de la propriété listeOperations.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCertificat.ListeOperations }
     *     
     */
    public void setListeOperations(TypeCertificat.ListeOperations value) {
        this.listeOperations = value;
    }

    /**
     * Obtient la valeur de la propriété totalPayement.
     * 
     * @return
     *     possible object is
     *     {@link TypeCertificat.TotalPayement }
     *     
     */
    public TypeCertificat.TotalPayement getTotalPayement() {
        return totalPayement;
    }

    /**
     * Définit la valeur de la propriété totalPayement.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCertificat.TotalPayement }
     *     
     */
    public void setTotalPayement(TypeCertificat.TotalPayement value) {
        this.totalPayement = value;
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
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Operation" type="{}TypeOperation"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operation"
    })
    public static class ListeOperations {

        @XmlElement(name = "Operation", required = true)
        protected List<TypeOperation> operation;

        /**
         * Gets the value of the operation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the operation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeOperation }
         * 
         * 
         */
        public List<TypeOperation> getOperation() {
            if (operation == null) {
                operation = new ArrayList<TypeOperation>();
            }
            return this.operation;
        }

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
     *         &lt;element name="TotalMontantHT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TotalMontantTVA" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TotalMontantTTC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TotalMontantRS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TotalTaxes" type="{}TotalMontantTaxeType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMontantNetServi" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TotalDevise" type="{}totalMntDeviseType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalMontantHT",
        "totalMontantTVA",
        "totalMontantTTC",
        "totalMontantRS",
        "totalTaxes",
        "totalMontantNetServi",
        "totalDevise"
    })
    public static class TotalPayement {

        @XmlElement(name = "TotalMontantHT", required = true)
        protected BigInteger totalMontantHT;
        @XmlElement(name = "TotalMontantTVA", required = true)
        protected BigInteger totalMontantTVA;
        @XmlElement(name = "TotalMontantTTC", required = true)
        protected BigInteger totalMontantTTC;
        @XmlElement(name = "TotalMontantRS", required = true)
        protected BigInteger totalMontantRS;
        @XmlElement(name = "TotalTaxes")
        protected TotalMontantTaxeType totalTaxes;
        @XmlElement(name = "TotalMontantNetServi", required = true)
        protected BigInteger totalMontantNetServi;
        @XmlElement(name = "TotalDevise")
        protected TotalMntDeviseType totalDevise;

        /**
         * Obtient la valeur de la propriété totalMontantHT.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalMontantHT() {
            return totalMontantHT;
        }

        /**
         * Définit la valeur de la propriété totalMontantHT.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalMontantHT(BigInteger value) {
            this.totalMontantHT = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantTVA.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalMontantTVA() {
            return totalMontantTVA;
        }

        /**
         * Définit la valeur de la propriété totalMontantTVA.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalMontantTVA(BigInteger value) {
            this.totalMontantTVA = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantTTC.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalMontantTTC() {
            return totalMontantTTC;
        }

        /**
         * Définit la valeur de la propriété totalMontantTTC.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalMontantTTC(BigInteger value) {
            this.totalMontantTTC = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantRS.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalMontantRS() {
            return totalMontantRS;
        }

        /**
         * Définit la valeur de la propriété totalMontantRS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalMontantRS(BigInteger value) {
            this.totalMontantRS = value;
        }

        /**
         * Obtient la valeur de la propriété totalTaxes.
         * 
         * @return
         *     possible object is
         *     {@link TotalMontantTaxeType }
         *     
         */
        public TotalMontantTaxeType getTotalTaxes() {
            return totalTaxes;
        }

        /**
         * Définit la valeur de la propriété totalTaxes.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalMontantTaxeType }
         *     
         */
        public void setTotalTaxes(TotalMontantTaxeType value) {
            this.totalTaxes = value;
        }

        /**
         * Obtient la valeur de la propriété totalMontantNetServi.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalMontantNetServi() {
            return totalMontantNetServi;
        }

        /**
         * Définit la valeur de la propriété totalMontantNetServi.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalMontantNetServi(BigInteger value) {
            this.totalMontantNetServi = value;
        }

        /**
         * Obtient la valeur de la propriété totalDevise.
         * 
         * @return
         *     possible object is
         *     {@link TotalMntDeviseType }
         *     
         */
        public TotalMntDeviseType getTotalDevise() {
            return totalDevise;
        }

        /**
         * Définit la valeur de la propriété totalDevise.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalMntDeviseType }
         *     
         */
        public void setTotalDevise(TotalMntDeviseType value) {
            this.totalDevise = value;
        }

    }

}
