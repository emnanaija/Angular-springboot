//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.02 à 10:13:30 PM GMT+01:00 
//


package com.example.generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeTaxpayer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeTaxpayer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTaxpayer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="MatriculeFiscal" type="{}TypeMatriculeFiscal"/&gt;
 *                   &lt;element name="CIN" type="{}TypeCIN"/&gt;
 *                   &lt;element name="Passeport" type="{}TypePasseport"/&gt;
 *                   &lt;element name="CarteSejour" type="{}TypeCarteSejour"/&gt;
 *                   &lt;element name="AutreIdentifiantFiscal" type="{}TypeAutreIdentifiant"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Resident" type="{}TypeTorF"/&gt;
 *         &lt;element name="NometprenonOuRaisonsociale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Adresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Activite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfosContact" type="{}TypeAdresseContact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeTaxpayer", propOrder = {
    "idTaxpayer",
    "resident",
    "nometprenonOuRaisonsociale",
    "adresse",
    "activite",
    "infosContact"
})
public class TypeTaxpayer {

    @XmlElement(name = "IdTaxpayer", required = true)
    protected TypeTaxpayer.IdTaxpayer idTaxpayer;
    @XmlElement(name = "Resident", required = true, defaultValue = "1")
    protected BigInteger resident;
    @XmlElement(name = "NometprenonOuRaisonsociale", required = true)
    protected String nometprenonOuRaisonsociale;
    @XmlElement(name = "Adresse", required = true)
    protected String adresse;
    @XmlElement(name = "Activite")
    protected String activite;
    @XmlElement(name = "InfosContact", required = true)
    protected TypeAdresseContact infosContact;

    /**
     * Obtient la valeur de la propriété idTaxpayer.
     * 
     * @return
     *     possible object is
     *     {@link TypeTaxpayer.IdTaxpayer }
     *     
     */
    public TypeTaxpayer.IdTaxpayer getIdTaxpayer() {
        return idTaxpayer;
    }

    /**
     * Définit la valeur de la propriété idTaxpayer.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTaxpayer.IdTaxpayer }
     *     
     */
    public void setIdTaxpayer(TypeTaxpayer.IdTaxpayer value) {
        this.idTaxpayer = value;
    }

    /**
     * Obtient la valeur de la propriété resident.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResident() {
        return resident;
    }

    /**
     * Définit la valeur de la propriété resident.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResident(BigInteger value) {
        this.resident = value;
    }

    /**
     * Obtient la valeur de la propriété nometprenonOuRaisonsociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNometprenonOuRaisonsociale() {
        return nometprenonOuRaisonsociale;
    }

    /**
     * Définit la valeur de la propriété nometprenonOuRaisonsociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNometprenonOuRaisonsociale(String value) {
        this.nometprenonOuRaisonsociale = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété activite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivite() {
        return activite;
    }

    /**
     * Définit la valeur de la propriété activite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivite(String value) {
        this.activite = value;
    }

    /**
     * Obtient la valeur de la propriété infosContact.
     * 
     * @return
     *     possible object is
     *     {@link TypeAdresseContact }
     *     
     */
    public TypeAdresseContact getInfosContact() {
        return infosContact;
    }

    /**
     * Définit la valeur de la propriété infosContact.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAdresseContact }
     *     
     */
    public void setInfosContact(TypeAdresseContact value) {
        this.infosContact = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="MatriculeFiscal" type="{}TypeMatriculeFiscal"/&gt;
     *         &lt;element name="CIN" type="{}TypeCIN"/&gt;
     *         &lt;element name="Passeport" type="{}TypePasseport"/&gt;
     *         &lt;element name="CarteSejour" type="{}TypeCarteSejour"/&gt;
     *         &lt;element name="AutreIdentifiantFiscal" type="{}TypeAutreIdentifiant"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "matriculeFiscal",
        "cin",
        "passeport",
        "carteSejour",
        "autreIdentifiantFiscal"
    })
    public static class IdTaxpayer {

        @XmlElement(name = "MatriculeFiscal")
        protected TypeMatriculeFiscal matriculeFiscal;
        @XmlElement(name = "CIN")
        protected TypeCIN cin;
        @XmlElement(name = "Passeport")
        protected TypePasseport passeport;
        @XmlElement(name = "CarteSejour")
        protected TypeCarteSejour carteSejour;
        @XmlElement(name = "AutreIdentifiantFiscal")
        protected TypeAutreIdentifiant autreIdentifiantFiscal;

        /**
         * Obtient la valeur de la propriété matriculeFiscal.
         * 
         * @return
         *     possible object is
         *     {@link TypeMatriculeFiscal }
         *     
         */
        public TypeMatriculeFiscal getMatriculeFiscal() {
            return matriculeFiscal;
        }

        /**
         * Définit la valeur de la propriété matriculeFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeMatriculeFiscal }
         *     
         */
        public void setMatriculeFiscal(TypeMatriculeFiscal value) {
            this.matriculeFiscal = value;
        }

        /**
         * Obtient la valeur de la propriété cin.
         * 
         * @return
         *     possible object is
         *     {@link TypeCIN }
         *     
         */
        public TypeCIN getCIN() {
            return cin;
        }

        /**
         * Définit la valeur de la propriété cin.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCIN }
         *     
         */
        public void setCIN(TypeCIN value) {
            this.cin = value;
        }

        /**
         * Obtient la valeur de la propriété passeport.
         * 
         * @return
         *     possible object is
         *     {@link TypePasseport }
         *     
         */
        public TypePasseport getPasseport() {
            return passeport;
        }

        /**
         * Définit la valeur de la propriété passeport.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePasseport }
         *     
         */
        public void setPasseport(TypePasseport value) {
            this.passeport = value;
        }

        /**
         * Obtient la valeur de la propriété carteSejour.
         * 
         * @return
         *     possible object is
         *     {@link TypeCarteSejour }
         *     
         */
        public TypeCarteSejour getCarteSejour() {
            return carteSejour;
        }

        /**
         * Définit la valeur de la propriété carteSejour.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeCarteSejour }
         *     
         */
        public void setCarteSejour(TypeCarteSejour value) {
            this.carteSejour = value;
        }

        /**
         * Obtient la valeur de la propriété autreIdentifiantFiscal.
         * 
         * @return
         *     possible object is
         *     {@link TypeAutreIdentifiant }
         *     
         */
        public TypeAutreIdentifiant getAutreIdentifiantFiscal() {
            return autreIdentifiantFiscal;
        }

        /**
         * Définit la valeur de la propriété autreIdentifiantFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeAutreIdentifiant }
         *     
         */
        public void setAutreIdentifiantFiscal(TypeAutreIdentifiant value) {
            this.autreIdentifiantFiscal = value;
        }

    }

}
