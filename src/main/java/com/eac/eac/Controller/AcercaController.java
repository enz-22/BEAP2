package com.eac.eac.Controller;

import com.eac.eac.Entity.Acerca;
import com.eac.eac.Interface.IAcercaService;
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

public class AcercaController {
    @Autowired IAcercaService iacercaService;
    
    @GetMapping("/api/acercas/traer")
    public List<Acerca> getAcerca(){
        return iacercaService.getAcerca();
    }
    
    @PostMapping("/api/acercas/crear")
    public String createAcerca(@RequestBody Acerca acerca){
        iacercaService.saveAcerca(acerca);
        return "El acerca fue creado correctamente";
    }
    
    @DeleteMapping("/api/acercas/borrar/{idacerca}")
    public String deleteAcerca(@PathVariable Long idacerca){
    iacercaService.deleteAcerca(idacerca);
    return "el acerca fue borrado correctamente";
    }
    
    @PutMapping("/api/acercas/editar/{idacerca}")
    public Acerca editAcerca(@PathVariable Long idacerca,
            @RequestParam("nombreacerca") String nuevoNombreacerca,
            @RequestParam("contactoacerca") String nuevoContactoacerca,
            @RequestParam("detalleacerca") String nuevoDetalleacerca,
            @RequestParam("fotoacerca") String nuevoFotoacerca)
                             
                              {
                                  
      Acerca acerca = iacercaService.FindAcerca(idacerca);
      acerca.setNombreacerca(nuevoNombreacerca);
      acerca.setContactoacerca(nuevoContactoacerca);
      acerca.setDetalleacerca(nuevoDetalleacerca);
      acerca.setFotoacerca(nuevoFotoacerca);
      
      iacercaService.saveAcerca(acerca);
      return acerca;
    }
    
    @GetMapping("api/acercas/traer/perfil")
   public Acerca findPersona(){
       return iacercaService.FindAcerca((long) 1);
   }
}
