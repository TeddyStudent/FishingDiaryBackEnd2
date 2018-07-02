package com.example.myrestapi.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "kalat")
public class Catch {

    @Id
    private Integer idkalat;

    @Size(max=45)
    private String laji;

    private Integer paino;

    private Integer pituus;

    @Size(max=45)
    private String pyyntitapa;

    @Size(max=45)
    private String viehe;

    @Size(max=45)
    private String viehe_vari;

    private String saantiaika;

    @NotNull
    private Integer reissu_idreissu;

    @NotNull
    private Integer reissu_tili_idtili;

    public Integer getIdkalat() {
        return idkalat;
    }

    public void setIdkalat(Integer idkalat) {
        this.idkalat = idkalat;
    }

    public String getLaji() {
        return laji;
    }

    public void setLaji(String laji) {
        this.laji = laji;
    }

    public Integer getPaino() {
        return paino;
    }

    public void setPaino(Integer paino) {
        this.paino = paino;
    }

    public Integer getPituus() {
        return pituus;
    }

    public void setPituus(Integer pituus) {
        this.pituus = pituus;
    }

    public String getPyyntitapa() {
        return pyyntitapa;
    }

    public void setPyyntitapa(String pyyntitapa) {
        this.pyyntitapa = pyyntitapa;
    }

    public String getViehe() {
        return viehe;
    }

    public void setViehe(String viehe) {
        this.viehe = viehe;
    }

    public String getViehe_vari() {
        return viehe_vari;
    }

    public void setViehe_vari(String viehe_vari) {
        this.viehe_vari = viehe_vari;
    }

    public String getSaantiaika() {
        return saantiaika;
    }

    public void setSaantiaika(String saantiaika) {
        this.saantiaika = saantiaika;
    }

    public Integer getReissu_idreissu() {
        return reissu_idreissu;
    }

    public void setReissu_idreissu(Integer reissu_idreissu) {
        this.reissu_idreissu = reissu_idreissu;
    }

    public Integer getReissu_tili_idtili() {
        return reissu_tili_idtili;
    }

    public void setReissu_tili_idtili(Integer reissu_tili_idtili) {
        this.reissu_tili_idtili = reissu_tili_idtili;
    }
}
