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
public class Acerca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idacerca;
    @NotNull
    @Size(min = 1, max = 50, message = "50 caracteres")
    private String nombreacerca;
    @NotNull
    @Size(min = 1, max = 500, message = "500 caracteres")
    private String contactoacerca;
    @NotNull
    @Size(min = 1, max = 500, message = "500 caracteres")
    private String detalleacerca;
    @NotNull
    @Size(min = 1, max = 250, message = "250 caracteres")
    private String fotoacerca;
    
}
