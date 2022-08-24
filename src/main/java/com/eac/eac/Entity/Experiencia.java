package com.eac.eac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String empresaExp;
    private String dateExp;
    private String cargoExp;
    private String contactoExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String empresaExp, String dateExp, String cargoExp, String contactoExp) {
        this.idExp = idExp;
        this.empresaExp = empresaExp;
        this.dateExp = dateExp;
        this.cargoExp = cargoExp;
        this.contactoExp = contactoExp;
    }

    public Long getIdExp() {

        return idExp;
    }

    public void setIdExp(Long idExp) {

        this.idExp = idExp;
    }

    public String getEmpresaExp() {

        return empresaExp;
    }

    public void setEmpresaExp(String empresaExp) {

        this.empresaExp = empresaExp;
    }

    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {

        this.dateExp = dateExp;
    }

    public String getCargoExp() {

        return cargoExp;
    }

    public void setCargoExp(String cargoExp) {

        this.cargoExp = cargoExp;
    }

    public String getContactoExp() {

        return contactoExp;
    }

    public void setContactoExp(String contactoExp) {

        this.contactoExp = contactoExp;
    }
}
