package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Entity
@Table(name = "RETENU_FOUR")
@XmlRootElement(name = "retenue_four")
public class Retenue_four {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID1")
    private Long id1;

    @Column(name = "ID")
    private Long id;

    @Column(name = "FRT_MOIS")
    private Integer frtMois;

    @Column(name = "FRT_ANNEE")
    private Integer frtAnnee;

    @Column(name = "FRT_NEMP")
    private String frtNemp;

    @Column(name = "FRT_TYPIDENT")
    private Integer frtTypIdent;

    @Column(name = "FRT_MATCIN")
    private Long frtMatcin;

    @Column(name = "FRT_CLEPAT")
    private String frtClepat;

    @Column(name = "FRT_CODTVA")
    private String frtCodtva;

    @Column(name = "FRT_CATEG")
    private String frtCateg;

    @Column(name = "FRT_CODADM")
    private String frtCodadm;

    @Column(name = "FRT_MTBRUT")
    private BigDecimal frtMtbrut;

    @Column(name = "FRT_MTDEDUC")
    private BigDecimal frtMtdeduc;

    @Column(name = "FRT_MTIMPBLE")
    private BigDecimal frtMtimpble;

    @Column(name = "FRT_RAISOCIAL")
    private String frtRaisocial;

    @Column(name = "FRT_RET1")
    private String frtRet1;

    @Column(name = "FRT_RET2")
    private BigDecimal frtRet2;

    @Column(name = "FRT_RET3")
    private String frtRet3;

    @Column(name = "FRT_RET4")
    private String frtRet4;

    @Column(name = "FRT_RET5")
    private BigDecimal frtRet5;

    @Column(name = "FRT_NETPAYE")
    private String frtNetpaye;

    @Column(name = "FRT_DTEPAYM")
    private String frtDtepaym;

    @Column(name = "FRT_CODBR")
    private Long frtCodbr;

    @Column(name = "FRT_ACTIV")
    private String frtActiv;

    @Column(name = "FRT_ADRESSE")
    private String frtAdresse;

    @Column(name = "FRT_VALID")
    private String frtValid;

    @Column(name = "FRT_RET1PC")
    private BigDecimal frtRet1pc;

    @Column(name = "FRT_RET05")
    private String frtRet05;

    // Getters and Setters with JAXB annotations

    @XmlElement
    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    @XmlElement
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public Integer getFrtMois() {
        return frtMois;
    }

    public void setFrtMois(Integer frtMois) {
        this.frtMois = frtMois;
    }

    @XmlElement
    public Integer getFrtAnnee() {
        return frtAnnee;
    }

    public void setFrtAnnee(Integer frtAnnee) {
        this.frtAnnee = frtAnnee;
    }

    @XmlElement
    public String getFrtNemp() {
        return frtNemp;
    }

    public void setFrtNemp(String frtNemp) {
        this.frtNemp = frtNemp;
    }

    @XmlElement
    public Integer getFrtTypIdent() {
        return frtTypIdent;
    }

    public void setFrtTypIdent(Integer frtTypIdent) {
        this.frtTypIdent = frtTypIdent;
    }

    @XmlElement
    public Long getFrtMatcin() {
        return frtMatcin;
    }

    public void setFrtMatcin(Long frtMatcin) {
        this.frtMatcin = frtMatcin;
    }

    @XmlElement
    public String getFrtClepat() {
        return frtClepat;
    }

    public void setFrtClepat(String frtClepat) {
        this.frtClepat = frtClepat;
    }

    @XmlElement
    public String getFrtCodtva() {
        return frtCodtva;
    }

    public void setFrtCodtva(String frtCodtva) {
        this.frtCodtva = frtCodtva;
    }

    @XmlElement
    public String getFrtCateg() {
        return frtCateg;
    }

    public void setFrtCateg(String frtCateg) {
        this.frtCateg = frtCateg;
    }

    @XmlElement
    public String getFrtCodadm() {
        return frtCodadm;
    }

    public void setFrtCodadm(String frtCodadm) {
        this.frtCodadm = frtCodadm;
    }

    @XmlElement
    public BigDecimal getFrtMtbrut() {
        return frtMtbrut;
    }

    public void setFrtMtbrut(BigDecimal frtMtbrut) {
        this.frtMtbrut = frtMtbrut;
    }

    @XmlElement
    public BigDecimal getFrtMtdeduc() {
        return frtMtdeduc;
    }

    public void setFrtMtdeduc(BigDecimal frtMtdeduc) {
        this.frtMtdeduc = frtMtdeduc;
    }

    @XmlElement
    public BigDecimal getFrtMtimpble() {
        return frtMtimpble;
    }

    public void setFrtMtimpble(BigDecimal frtMtimpble) {
        this.frtMtimpble = frtMtimpble;
    }

    @XmlElement
    public String getFrtRaisocial() {
        return frtRaisocial;
    }

    public void setFrtRaisocial(String frtRaisocial) {
        this.frtRaisocial = frtRaisocial;
    }

    @XmlElement
    public String getFrtRet1() {
        return frtRet1;
    }

    public void setFrtRet1(String frtRet1) {
        this.frtRet1 = frtRet1;
    }

    @XmlElement
    public BigDecimal getFrtRet2() {
        return frtRet2;
    }

    public void setFrtRet2(BigDecimal frtRet2) {
        this.frtRet2 = frtRet2;
    }

    @XmlElement
    public String getFrtRet3() {
        return frtRet3;
    }

    public void setFrtRet3(String frtRet3) {
        this.frtRet3 = frtRet3;
    }

    @XmlElement
    public String getFrtRet4() {
        return frtRet4;
    }

    public void setFrtRet4(String frtRet4) {
        this.frtRet4 = frtRet4;
    }

    @XmlElement
    public BigDecimal getFrtRet5() {
        return frtRet5;
    }

    public void setFrtRet5(BigDecimal frtRet5) {
        this.frtRet5 = frtRet5;
    }

    @XmlElement
    public String getFrtNetpaye() {
        return frtNetpaye;
    }

    public void setFrtNetpaye(String frtNetpaye) {
        this.frtNetpaye = frtNetpaye;
    }

    @XmlElement
    public String getFrtDtepaym() {
        return frtDtepaym;
    }

    public void setFrtDtepaym(String frtDtepaym) {
        this.frtDtepaym = frtDtepaym;
    }

    @XmlElement
    public Long getFrtCodbr() {
        return frtCodbr;
    }

    public void setFrtCodbr(Long frtCodbr) {
        this.frtCodbr = frtCodbr;
    }

    @XmlElement
    public String getFrtActiv() {
        return frtActiv;
    }

    public void setFrtActiv(String frtActiv) {
        this.frtActiv = frtActiv;
    }

    @XmlElement
    public String getFrtAdresse() {
        return frtAdresse;
    }

    public void setFrtAdresse(String frtAdresse) {
        this.frtAdresse = frtAdresse;
    }

    @XmlElement
    public String getFrtValid() {
        return frtValid;
    }

    public void setFrtValid(String frtValid) {
        this.frtValid = frtValid;
    }

    @XmlElement
    public BigDecimal getFrtRet1pc() {
        return frtRet1pc;
    }

    public void setFrtRet1pc(BigDecimal frtRet1pc) {
        this.frtRet1pc = frtRet1pc;
    }

    @XmlElement
    public String getFrtRet05() {
        return frtRet05;
    }

    public void setFrtRet05(String frtRet05) {
        this.frtRet05 = frtRet05;
    }
}
