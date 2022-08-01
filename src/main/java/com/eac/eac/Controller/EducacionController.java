package com.eac.eac.Controller;

import com.eac.eac.Entity.Educacion;
import com.eac.eac.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired 
    public IEducacionService iEducacionService;
    
    @GetMapping("/api/educaciones/traer")
    public List<Educacion> getEducacion(){
        return iEducacionService.getEducacion();
    }
    
    @PostMapping("/api/educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        iEducacionService.saveEducacion(educacion);
        return "creado correctamente";
    }
    
    @DeleteMapping("/api/educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable Long ideducacion){
    iEducacionService.deleteEducacion(ideducacion);
    return "borrado correctamente";
    }
    
    @PutMapping("/api/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long ideducacion,
            @RequestParam("educacion1") String nuevoEducacion1,
            @RequestParam("educacion2") String nuevoEducacion2,
            @RequestParam("educacion3") String nuevoEducacion3,
            @RequestParam("educacion4") String nuevoEducacion4)
                             
                              {
                                  
      Educacion educacion = iEducacionService.FindEducacion(ideducacion);
      educacion.setEducacion1(nuevoEducacion1);
      educacion.setEducacion2(nuevoEducacion2);
      educacion.setEducacion3(nuevoEducacion3);
      educacion.setEducacion4(nuevoEducacion4);
      
      iEducacionService.saveEducacion(educacion);
      return educacion;
    }
    
   
}
