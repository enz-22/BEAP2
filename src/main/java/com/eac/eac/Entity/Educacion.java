package com.eac.eac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String educacion1;
    private String educacion2;
    private String educacion3;
    private String educacion4;

    public Educacion() {
    }

    public Educacion(Long idEdu, String educacion1, String educacion2, String educacion3, String educacion4) {
        this.idEdu = idEdu;
        this.educacion1 = educacion1;
        this.educacion2 = educacion2;
        this.educacion3 = educacion3;
        this.educacion4 = educacion4;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getEducacion1() {
        return educacion1;
    }

    public void setEducacion1(String educacion1) {
        this.educacion1 = educacion1;
    }

    public String getEducacion2() {
        return educacion2;
    }

    public void setEducacion2(String educacion2) {
        this.educacion2 = educacion2;
    }

    public String getEducacion3() {
        return educacion3;
    }

    public void setEducacion3(String educacion3) {
        this.educacion3 = educacion3;
    }

    public String getEducacion4() {
        return educacion4;
    }

    public void setEducacion4(String educacion4) {
        this.educacion4 = educacion4;
    }
}
