//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.02 à 10:13:30 PM GMT+01:00 
//


package com.example.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeAnnulerCertificat complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeAnnulerCertificat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ref_certif_chez_declarant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAnnulerCertificat", propOrder = {
    "refCertifChezDeclarant"
})
public class TypeAnnulerCertificat {

    @XmlElement(name = "Ref_certif_chez_declarant", required = true)
    protected String refCertifChezDeclarant;

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

}
