package com.eac.eac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String nombrePro;
    private String infoPro;
    private String imagenPro;

    public Proyecto() {
    }

    public Proyecto(Long idPro, String nombrePro, String infoPro, String imagenPro) {
        this.idPro = idPro;
        this.nombrePro = nombrePro;
        this.infoPro = infoPro;
        this.imagenPro = imagenPro;
    }

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getInfoPro() {
        return infoPro;
    }

    public void setInfoPro(String infoPro) {
        this.infoPro = infoPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }
}
