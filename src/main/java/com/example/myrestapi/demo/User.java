package com.example.myrestapi.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tili")
public class User {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idtili;

    @NotNull
    @Size(max=45)
    private String etunimi;

    @NotNull
    @Size(max=45)
    private String sukunimi;

    @NotNull
    @Size(max=255)
    private String kayttajatunnus;

    @NotNull
    @Size(max=45)
    private String salasana;

    public Integer getIdtili() {
        return idtili;
    }

    public void setIdtili(Integer idtili) {
        this.idtili = idtili;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getKayttajatunnus() {
        return kayttajatunnus;
    }

    public void setKayttajatunnus(String kayttajatunnus) {
        this.kayttajatunnus = kayttajatunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }
}
