package com.example.myrestapi.demo;

import javax.persistence.*;

@Entity
@Table(name = "reissu")
public class Trip {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idreissu;

    private String pvm;

    private String paikka;

    private String saa;

    private Integer t_nopeus;

    private String t_suunta;

    private Integer l_ilma;

    private Integer l_vesi;

    private Integer tili_idtili;

    public Integer getIdreissu() {
        return idreissu;
    }

    public void setIdreissu(Integer id) {
        this.idreissu = id;
    }

    public String getPvm() {
        return pvm;
    }

    public void setPvm(String pvm) {
        this.pvm = pvm;
    }

    public String getPaikka() {
        return paikka;
    }

    public void setPaikka(String paikka) {
        this.paikka = paikka;
    }

    public String getSaa() {
        return saa;
    }

    public void setSaa(String saa) {
        this.saa = saa;
    }

    public Integer getT_nopeus() {
        return t_nopeus;
    }

    public void setT_nopeus(Integer t_nopeus) {
        this.t_nopeus = t_nopeus;
    }

    public String getT_suunta() {
        return t_suunta;
    }

    public void setT_suunta(String t_suunta) {
        this.t_suunta = t_suunta;
    }

    public Integer getL_ilma() {
        return l_ilma;
    }

    public void setL_ilma(Integer l_ilma) {
        this.l_ilma = l_ilma;
    }

    public Integer getL_vesi() {
        return l_vesi;
    }

    public void setL_vesi(Integer l_vesi) {
        this.l_vesi = l_vesi;
    }

    public Integer getTili_idtili() {
        return tili_idtili;
    }

    public void setTili_idtili(Integer tili_idtili) {
        this.tili_idtili = tili_idtili;
    }


}
