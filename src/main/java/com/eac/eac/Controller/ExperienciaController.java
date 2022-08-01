package com.eac.eac.Controller;

import com.eac.eac.Entity.Experiencia;
import com.eac.eac.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("/api/experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/api/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "creado correctamente";
    }
    
    @DeleteMapping("/api/experiencias/borrar/{idexperiencia}")
    public String deleteExperiencia(@PathVariable Long idexperiencia){
    iexperienciaService.deleteExperiencia(idexperiencia);
    return "el acerca fue borrado correctamente";
    }
    
    @PutMapping("/api/experiencias/editar/{idexperiencia}")
    public Experiencia editExperiencia(@PathVariable Long idexperiencia,
            @RequestParam("empresaexperiencia") String nuevoEmpresaexperiencia,
            @RequestParam("dateexperiencia") String nuevoDateexperiencia,
            @RequestParam("cargoexperiencia") String nuevoCargoexperiencia,
            @RequestParam("contactoexperiencia") String nuevoContactoexperiencia)
                             
                              {
                                  
      Experiencia experiencia = iexperienciaService.FindExperiencia(idexperiencia);
      experiencia.setEmpresaexperiencia(nuevoEmpresaexperiencia);
      experiencia.setDateexperiencia(nuevoDateexperiencia);
      experiencia.setCargoexperiencia(nuevoCargoexperiencia);
      experiencia.setContactoexperiencia(nuevoContactoexperiencia);
      
      iexperienciaService.saveExperiencia(experiencia);
      return experiencia;
    }
}
