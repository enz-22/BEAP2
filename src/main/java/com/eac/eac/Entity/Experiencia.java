package com.eac.eac.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idexperiencia;
    @NotNull
    @Size(min = 1, max = 50, message = "50 caracteres")
    private String empresaexperiencia;
    @NotNull
    @Size(min = 1, max = 50, message = "50 caracteres")
    private String dateexperiencia;
    @NotNull
    @Size(min = 1, max = 50, message = "50 caracteres")
    private String cargoexperiencia;
    @NotNull
    @Size(min = 1, max = 50, message = "50 caracteres")
    private String contactoexperiencia;
    
}
