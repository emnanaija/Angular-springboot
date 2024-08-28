//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeCategoriePersonne.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="TypeCategoriePersonne"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PP"/&gt;
 *     &lt;enumeration value="PM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeCategoriePersonne")
@XmlEnum
public enum TypeCategoriePersonne {

    PP,
    PM;

    public String value() {
        return name();
    }

    public static TypeCategoriePersonne fromValue(String v) {
        return valueOf(v);
    }

}
