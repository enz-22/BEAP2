package com.eac.eac.Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Getter @Setter
@Entity
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idskill;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String uno;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String dos;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String tres;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String cuatro;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String cinco;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String seis;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String siete;
    @NotNull
    @Size(min = 1, max = 2, message = "% del 1 - 99")
    private String ocho;


}
