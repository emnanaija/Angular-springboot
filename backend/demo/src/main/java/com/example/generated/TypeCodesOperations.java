//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 09:40:08 AM GMT+01:00 
//


package com.example.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeCodesOperations.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="TypeCodesOperations"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RS1_000001"/&gt;
 *     &lt;enumeration value="RS1_000002"/&gt;
 *     &lt;enumeration value="RS2_000001"/&gt;
 *     &lt;enumeration value="RS2_000002"/&gt;
 *     &lt;enumeration value="RS2_000003"/&gt;
 *     &lt;enumeration value="RS2_000004"/&gt;
 *     &lt;enumeration value="RS3_000001"/&gt;
 *     &lt;enumeration value="RS3_000003"/&gt;
 *     &lt;enumeration value="RS3_000004"/&gt;
 *     &lt;enumeration value="RS3_000005"/&gt;
 *     &lt;enumeration value="RS4_000001"/&gt;
 *     &lt;enumeration value="RS4_000002"/&gt;
 *     &lt;enumeration value="RS5_000001"/&gt;
 *     &lt;enumeration value="RS5_000002"/&gt;
 *     &lt;enumeration value="RS5_000003"/&gt;
 *     &lt;enumeration value="RS6_000001"/&gt;
 *     &lt;enumeration value="RS6_000002"/&gt;
 *     &lt;enumeration value="RS6_000003"/&gt;
 *     &lt;enumeration value="RS6_000005"/&gt;
 *     &lt;enumeration value="RS7_000001"/&gt;
 *     &lt;enumeration value="RS7_000002"/&gt;
 *     &lt;enumeration value="RS7_000003"/&gt;
 *     &lt;enumeration value="RS7_000004"/&gt;
 *     &lt;enumeration value="RS7_000005"/&gt;
 *     &lt;enumeration value="RS8_000001"/&gt;
 *     &lt;enumeration value="RS8_000002"/&gt;
 *     &lt;enumeration value="RS8_000003"/&gt;
 *     &lt;enumeration value="RS9_000001"/&gt;
 *     &lt;enumeration value="RS9_000002"/&gt;
 *     &lt;enumeration value="RS9_000003"/&gt;
 *     &lt;enumeration value="RS9_000004"/&gt;
 *     &lt;enumeration value="RS9_000005"/&gt;
 *     &lt;enumeration value="RS9_000006"/&gt;
 *     &lt;enumeration value="RS9_000007"/&gt;
 *     &lt;enumeration value="RS9_000008"/&gt;
 *     &lt;enumeration value="RS11_000001"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeCodesOperations")
@XmlEnum
public enum TypeCodesOperations {


    /**
     * Loyers d’hôtels servis aux personnes morales et aux personnes physiques soumises à l’impôt sur le revenu selon le régime réel 
     * 
     */
    @XmlEnumValue("RS1_000001")
    RS_1_000001("RS1_000001"),

    /**
     * Loyers servis à des résidents établis 
     * 
     */
    @XmlEnumValue("RS1_000002")
    RS_1_000002("RS1_000002"),

    /**
     * Honoraires servis aux BNC forfait d’assiette, commissions, courtages, rémunérations des activités non commerciales qu'elle qu'en soit l'appellation servis à des résidents établis. 
     * 
     */
    @XmlEnumValue("RS2_000001")
    RS_2_000001("RS2_000001"),

    /**
     * Honoraires servis aux BNC régime réel résidents établis. 
     * 
     */
    @XmlEnumValue("RS2_000002")
    RS_2_000002("RS2_000002"),

    /**
     * Rémunérations en contrepartie de la performance. 
     * 
     */
    @XmlEnumValue("RS2_000003")
    RS_2_000003("RS2_000003"),

    /**
     * Rémunérations servies aux artistes, aux créateurs soumis à l’impôt sur le revenu selon le régime réel et aux personnes morales au titre de la production, la diffusion et la présentation des œuvres théâtrales, scénique, musicale, littéraire et plastiques et cinématographique, et au titre des rémunérations servies aux titulaires des droits d'auteur et des droits voisins dans le cadre de la gestion collective des droits de la propriété littéraire et artistique 
     * 
     */
    @XmlEnumValue("RS2_000004")
    RS_2_000004("RS2_000004"),

    /**
     * Revenus de capitaux mobiliers (autres que les dépôts en devise ou en dinars convertible) servis aux résidents soumi à l'impots (IS ou IRPP). 
     * 
     */
    @XmlEnumValue("RS3_000001")
    RS_3_000001("RS3_000001"),

    /**
     * Revenus de capitaux mobiliers (autres que les dépôts en devise ou en dinars convertible) servis aux non résidents autres que banques 
     * 
     */
    @XmlEnumValue("RS3_000003")
    RS_3_000003("RS3_000003"),

    /**
     * Revenus de capitaux mobiliers servis aux banques non établit 
     * 
     */
    @XmlEnumValue("RS3_000004")
    RS_3_000004("RS3_000004"),

    /**
     * Revenus de capitaux mobiliers servis aux non établit (autres que les banques) et résidents dans un Etat ou un territoire dont le régime fiscal est privilégié 
     * 
     */
    @XmlEnumValue("RS3_000005")
    RS_3_000005("RS3_000005"),

    /**
     * Revenus de valeurs mobilières(cession d’actions, parts sociales et parts des fonds) servis à des personnes morales non résidentes non établis. 
     * 
     */
    @XmlEnumValue("RS4_000001")
    RS_4_000001("RS4_000001"),

    /**
     * Revenus de valeurs mobilières(cession d’actions, parts sociales et parts des fonds) servis à des personnes physiques non résidentes non établis. 
     * 
     */
    @XmlEnumValue("RS4_000002")
    RS_4_000002("RS4_000002"),

    /**
     * Dividendes servies à des personnes physiques résidentes 
     * 
     */
    @XmlEnumValue("RS5_000001")
    RS_5_000001("RS5_000001"),

    /**
     * Dividendes servis à des personnes physiques et personnes morales non résidentes. 
     * 
     */
    @XmlEnumValue("RS5_000002")
    RS_5_000002("RS5_000002"),

    /**
     * Dividendes servis à des personnes physiques et personnes morales résidentes dans un Etat ou un territoire dont le régime fiscal est privilégié 
     * 
     */
    @XmlEnumValue("RS5_000003")
    RS_5_000003("RS5_000003"),

    /**
     * Cession de fonds de commerce par les personnes morales et les personnes physiques résidentes 
     * 
     */
    @XmlEnumValue("RS6_000001")
    RS_6_000001("RS6_000001"),

    /**
     * Cession d’immeubles et des droits sociaux dans les sociétés immobilières par les personnes morales et les personnes physiques résidentes 
     * 
     */
    @XmlEnumValue("RS6_000002")
    RS_6_000002("RS6_000002"),

    /**
     * Cession d’immeubles et des droits sociaux dans les sociétés immobilières par les personnes physiques non residentes 
     * 
     */
    @XmlEnumValue("RS6_000003")
    RS_6_000003("RS6_000003"),

    /**
     * Cession d'immeubles et des droits sociaux dans les sociétés immobilières par les personnes morales non résidentes et non établies en Tunisie. 
     * 
     */
    @XmlEnumValue("RS6_000005")
    RS_6_000005("RS6_000005"),

    /**
     * Montants égaux ou supérieurs à 1.000 D y compris la TVA au titre des acquisitions des marchandises, matériel équipements et de services, auprés des personnes physiques et des peronnes morales soumis à l'IS au taux autres que 15% et 10% 
     * 
     */
    @XmlEnumValue("RS7_000001")
    RS_7_000001("RS7_000001"),

    /**
     * Montants égaux ou supérieurs à 1.000 D y compris la TVA au titre des acquisitions des marchandises, matériel équipements et de services, auprés des personnes physiques et des peronnes morales soumis à l'IS au taux de 15% 
     * 
     */
    @XmlEnumValue("RS7_000002")
    RS_7_000002("RS7_000002"),

    /**
     * Montants égaux ou supérieurs à 1.000 D y compris la TVA au titre des acquisitions des marchandises, matériel équipements et de servicesauprés des personnes physiques bénéfiçiant de la déduction de 2/3 et des peronnes morales soumois à l'IS au taux de 10% 
     * 
     */
    @XmlEnumValue("RS7_000003")
    RS_7_000003("RS7_000003"),

    /**
     * Le montant de la commission revenant aux distributeurs agréés des opérateurs de réseaux des télécommunications(personne physique). 
     * 
     */
    @XmlEnumValue("RS7_000004")
    RS_7_000004("RS7_000004"),

    /**
     * Le montant de la commission revenant aux distributeurs agréés des opérateurs de réseaux des télécommunications( personne morale). 
     * 
     */
    @XmlEnumValue("RS7_000005")
    RS_7_000005("RS7_000005"),

    /**
     * Rémunérations et primes servies aux membres des conseils, des directoires et des comités des sociétés anonymes payes aux résidents. 
     * 
     */
    @XmlEnumValue("RS8_000001")
    RS_8_000001("RS8_000001"),

    /**
     * Rémunérations et primes servies aux membres des conseils, des directoires et des comités des sociétés anonymes payes aux non résidents. 
     * 
     */
    @XmlEnumValue("RS8_000002")
    RS_8_000002("RS8_000002"),

    /**
     * Rémunérations et primes servies aux membres des conseils, des directoires et des comités des sociétés anonymes payes aux résidents dans ans un Etat ou un territoire dont le régime fiscal est privilégié 
     * 
     */
    @XmlEnumValue("RS8_000003")
    RS_8_000003("RS8_000003"),

    /**
     * Rémunérations servies à des non-résidents non établis en Tunisie. 
     * 
     */
    @XmlEnumValue("RS9_000001")
    RS_9_000001("RS9_000001"),

    /**
     * Redevances (Rémunérations servies à des non-résidents non établis en Tunisie.) 
     * 
     */
    @XmlEnumValue("RS9_000002")
    RS_9_000002("RS9_000002"),

    /**
     * Rémunérations payées aux nresidents dans un Etat ou un territoire dont le régime fiscal est privilégié 
     * 
     */
    @XmlEnumValue("RS9_000003")
    RS_9_000003("RS9_000003"),

    /**
     * Rémunérations payées aux non-résidents et établis en Tunisie pour une période n’excédant pas 6 mois au titre : des travaux de construction 
     * 
     */
    @XmlEnumValue("RS9_000004")
    RS_9_000004("RS9_000004"),

    /**
     * Rémunérations payées aux non-résidents et établis en Tunisie pour une période n’excédant pas 6 mois au titre : des opérations de montage 
     * 
     */
    @XmlEnumValue("RS9_000005")
    RS_9_000005("RS9_000005"),

    /**
     * Rémunérations payées aux non-résidents et établis en Tunisie pour une période n’excédant pas 6 mois au titre : des autres services 
     * 
     */
    @XmlEnumValue("RS9_000006")
    RS_9_000006("RS9_000006"),

    /**
     * Les rémunérations payées aux non résidents établis en Tunisie qui ne procèdent pas au dépôt de la déclaration d'existence autre qu’établissement stable d'une spersonne physique ou morale residente dans un Etat ou un territoire dont le régime fiscal est privilégié 
     * 
     */
    @XmlEnumValue("RS9_000007")
    RS_9_000007("RS9_000007"),

    /**
     * Les rémunérations payées aux non résidents établis en Tunisie et residents dans un Etat ou un territoire dont le régime fiscal est privilégié qui ne procèdent pas au dépôt de la déclaration d'existence 
     * 
     */
    @XmlEnumValue("RS9_000008")
    RS_9_000008("RS9_000008"),

    /**
     * Jeux de pari et loterie autres que les paris mutuels sur les courses de chevaux et des concours de pronostics sportifs et les gains en nature des jeux de pari, de hasard et de loterie. 
     * 
     */
    @XmlEnumValue("RS11_000001")
    RS_11_000001("RS11_000001");
    private final String value;

    TypeCodesOperations(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCodesOperations fromValue(String v) {
        for (TypeCodesOperations c: TypeCodesOperations.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
