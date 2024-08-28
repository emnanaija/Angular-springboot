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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeAutreIdentifiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeAutreIdentifiant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeIdentifiant" type="{}TypeIDTaxpayer"/&gt;
 *         &lt;element name="Identifiant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pays" type="{}TypeCodesPays"/&gt;
 *         &lt;element name="CategorieContribuable" type="{}TypeCategoriePersonne"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAutreIdentifiant", propOrder = {
    "typeIdentifiant",
    "identifiant",
    "pays",
    "categorieContribuable"
})
public class TypeAutreIdentifiant {

    @XmlElement(name = "TypeIdentifiant", required = true)
    protected String typeIdentifiant;
    @XmlElement(name = "Identifiant", required = true)
    protected String identifiant;
    @XmlElement(name = "Pays", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCodesPays pays;
    @XmlElement(name = "CategorieContribuable", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCategoriePersonne categorieContribuable;

    /**
     * Obtient la valeur de la propriété typeIdentifiant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeIdentifiant() {
        return typeIdentifiant;
    }

    /**
     * Définit la valeur de la propriété typeIdentifiant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeIdentifiant(String value) {
        this.typeIdentifiant = value;
    }

    /**
     * Obtient la valeur de la propriété identifiant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * Définit la valeur de la propriété identifiant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiant(String value) {
        this.identifiant = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodesPays }
     *     
     */
    public TypeCodesPays getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodesPays }
     *     
     */
    public void setPays(TypeCodesPays value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété categorieContribuable.
     * 
     * @return
     *     possible object is
     *     {@link TypeCategoriePersonne }
     *     
     */
    public TypeCategoriePersonne getCategorieContribuable() {
        return categorieContribuable;
    }

    /**
     * Définit la valeur de la propriété categorieContribuable.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCategoriePersonne }
     *     
     */
    public void setCategorieContribuable(TypeCategoriePersonne value) {
        this.categorieContribuable = value;
    }

}
