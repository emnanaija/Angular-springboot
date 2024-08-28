//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Declarant" type="{}TypeMatriculeFiscal"/&gt;
 *         &lt;element name="ReferenceDeclaration" type="{}TypeReferenceDeclaration"/&gt;
 *         &lt;element name="AjouterCertificats" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Certificat" type="{}TypeCertificat"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ModifierCertificats" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Certificat" type="{}TypeCertificat"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AnnulerCertificats" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Certificat" type="{}TypeAnnulerCertificat"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VersionSchema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "declarant",
    "referenceDeclaration",
    "ajouterCertificats",
    "modifierCertificats",
    "annulerCertificats"
})
@XmlRootElement(name = "DeclarationsRS")
public class DeclarationsRS {

    @XmlElement(name = "Declarant", required = true)
    protected TypeMatriculeFiscal declarant;
    @XmlElement(name = "ReferenceDeclaration", required = true)
    protected TypeReferenceDeclaration referenceDeclaration;
    @XmlElement(name = "AjouterCertificats")
    protected DeclarationsRS.AjouterCertificats ajouterCertificats;
    @XmlElement(name = "ModifierCertificats")
    protected DeclarationsRS.ModifierCertificats modifierCertificats;
    @XmlElement(name = "AnnulerCertificats")
    protected DeclarationsRS.AnnulerCertificats annulerCertificats;
    @XmlAttribute(name = "VersionSchema", required = true)
    protected String versionSchema;

    /**
     * Obtient la valeur de la propriété declarant.
     * 
     * @return
     *     possible object is
     *     {@link TypeMatriculeFiscal }
     *     
     */
    public TypeMatriculeFiscal getDeclarant() {
        return declarant;
    }

    /**
     * Définit la valeur de la propriété declarant.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMatriculeFiscal }
     *     
     */
    public void setDeclarant(TypeMatriculeFiscal value) {
        this.declarant = value;
    }

    /**
     * Obtient la valeur de la propriété referenceDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferenceDeclaration }
     *     
     */
    public TypeReferenceDeclaration getReferenceDeclaration() {
        return referenceDeclaration;
    }

    /**
     * Définit la valeur de la propriété referenceDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferenceDeclaration }
     *     
     */
    public void setReferenceDeclaration(TypeReferenceDeclaration value) {
        this.referenceDeclaration = value;
    }

    /**
     * Obtient la valeur de la propriété ajouterCertificats.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationsRS.AjouterCertificats }
     *     
     */
    public DeclarationsRS.AjouterCertificats getAjouterCertificats() {
        return ajouterCertificats;
    }

    /**
     * Définit la valeur de la propriété ajouterCertificats.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationsRS.AjouterCertificats }
     *     
     */
    public void setAjouterCertificats(DeclarationsRS.AjouterCertificats value) {
        this.ajouterCertificats = value;
    }

    /**
     * Obtient la valeur de la propriété modifierCertificats.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationsRS.ModifierCertificats }
     *     
     */
    public DeclarationsRS.ModifierCertificats getModifierCertificats() {
        return modifierCertificats;
    }

    /**
     * Définit la valeur de la propriété modifierCertificats.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationsRS.ModifierCertificats }
     *     
     */
    public void setModifierCertificats(DeclarationsRS.ModifierCertificats value) {
        this.modifierCertificats = value;
    }

    /**
     * Obtient la valeur de la propriété annulerCertificats.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationsRS.AnnulerCertificats }
     *     
     */
    public DeclarationsRS.AnnulerCertificats getAnnulerCertificats() {
        return annulerCertificats;
    }

    /**
     * Définit la valeur de la propriété annulerCertificats.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationsRS.AnnulerCertificats }
     *     
     */
    public void setAnnulerCertificats(DeclarationsRS.AnnulerCertificats value) {
        this.annulerCertificats = value;
    }

    /**
     * Obtient la valeur de la propriété versionSchema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionSchema() {
        if (versionSchema == null) {
            return "1.0";
        } else {
            return versionSchema;
        }
    }

    /**
     * Définit la valeur de la propriété versionSchema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionSchema(String value) {
        this.versionSchema = value;
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
     *         &lt;element name="Certificat" type="{}TypeCertificat"/&gt;
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
        "certificat"
    })
    public static class AjouterCertificats {

        @XmlElement(name = "Certificat", required = true)
        protected List<TypeCertificat> certificat;

        /**
         * Gets the value of the certificat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the certificat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeCertificat }
         * 
         * 
         */
        public List<TypeCertificat> getCertificat() {
            if (certificat == null) {
                certificat = new ArrayList<TypeCertificat>();
            }
            return this.certificat;
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
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Certificat" type="{}TypeAnnulerCertificat"/&gt;
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
        "certificat"
    })
    public static class AnnulerCertificats {

        @XmlElement(name = "Certificat", required = true)
        protected List<TypeAnnulerCertificat> certificat;

        /**
         * Gets the value of the certificat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the certificat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeAnnulerCertificat }
         * 
         * 
         */
        public List<TypeAnnulerCertificat> getCertificat() {
            if (certificat == null) {
                certificat = new ArrayList<TypeAnnulerCertificat>();
            }
            return this.certificat;
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
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Certificat" type="{}TypeCertificat"/&gt;
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
        "certificat"
    })
    public static class ModifierCertificats {

        @XmlElement(name = "Certificat", required = true)
        protected List<TypeCertificat> certificat;

        /**
         * Gets the value of the certificat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the certificat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeCertificat }
         * 
         * 
         */
        public List<TypeCertificat> getCertificat() {
            if (certificat == null) {
                certificat = new ArrayList<TypeCertificat>();
            }
            return this.certificat;
        }

    }

}
