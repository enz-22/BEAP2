package com.eac.eac.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Acerca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idacerca;
    private String nombreacerca;
    private String contactoacerca;
    private String detalleacerca;
    private String fotoacerca;

    public Acerca() {
    }

    public Acerca(Long idacerca, String nombreacerca, String contactoacerca, String detalleacerca, String fotoacerca) {
        this.idacerca = idacerca;
        this.nombreacerca = nombreacerca;
        this.contactoacerca = contactoacerca;
        this.detalleacerca = detalleacerca;
        this.fotoacerca = fotoacerca;
    }

    public Long getIdacerca() {
        return idacerca;
    }

    public void setIdacerca(Long idacerca) {
        this.idacerca = idacerca;
    }

    public String getNombreacerca() {
        return nombreacerca;
    }

    public void setNombreacerca(String nombreacerca) {
        this.nombreacerca = nombreacerca;
    }

    public String getContactoacerca() {
        return contactoacerca;
    }

    public void setContactoacerca(String contactoacerca) {
        this.contactoacerca = contactoacerca;
    }

    public String getDetalleacerca() {
        return detalleacerca;
    }

    public void setDetalleacerca(String detalleacerca) {
        this.detalleacerca = detalleacerca;
    }

    public String getFotoacerca() {
        return fotoacerca;
    }

    public void setFotoacerca(String fotoacerca) {
        this.fotoacerca = fotoacerca;
    }
}
