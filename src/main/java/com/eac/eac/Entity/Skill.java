package com.eac.eac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;

    private String uno;
    private String imagenUno;


    public Skill() {
    }

    public Skill(Long idSkill, String uno, String imagenUno) {
        this.idSkill = idSkill;
        this.uno = uno;
        this.imagenUno = imagenUno;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getImagenUno() {
        return imagenUno;
    }

    public void setImagenUno(String imagenUno) {
        this.imagenUno = imagenUno;
    }
}
