package com.eac.eac.Controller;

import com.eac.eac.Entity.Educacion;
import com.eac.eac.Interface.IEducacionService;
import java.util.List;
import com.eac.eac.Service.ImpEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/educaciones")
public class EducacionController extends ImpEducacionService {
    @Autowired 
    public IEducacionService iEducacionService;
    
    @GetMapping("/traer")
    public List<Educacion> getEducacion(){

        return iEducacionService.getEducacion();
    }


    @PostMapping("/crear")
    public String saveEducacion(@RequestBody Educacion educ){
        iEducacionService.saveEducacion(educ);
        return "creado correctamente";
    }
    
    @DeleteMapping("/borrar/{ideducacion}")
    public String deleteEducacion(@PathVariable Long ideducacion){
        iEducacionService.deleteEducacion(ideducacion);
        return null;
    }
    
    @PutMapping("/editar/{ideducacion}")
    public Educacion editEducacion(@PathVariable Long ideducacion,@RequestParam("educacion1") String nuevoEducacion1,@RequestParam("educacion2") String nuevoEducacion2,@RequestParam("educacion3") String nuevoEducacion3,@RequestParam("educacion4") String nuevoEducacion4) {
                                  
      Educacion educacion = iEducacionService.FindEducacion(ideducacion);
      educacion.setEducacion1(nuevoEducacion1);
      educacion.setEducacion2(nuevoEducacion2);
      educacion.setEducacion3(nuevoEducacion3);
      educacion.setEducacion4(nuevoEducacion4);
      
      iEducacionService.saveEducacion(educacion);
      return educacion;
    }
    @GetMapping("/traer/{ideducacion}")
    public Educacion FindEducacion(Long ideducacion){return iEducacionService.FindEducacion(ideducacion);
    }
   
}
