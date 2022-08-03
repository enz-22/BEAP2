package com.eac.eac.Controller;

import com.eac.eac.Entity.Acerca;
import com.eac.eac.Interface.IAcercaService;
import java.util.List;
import com.eac.eac.Service.ImpAcercaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api/acercas")
public class AcercaController extends ImpAcercaService {
    @Autowired IAcercaService iacercaService;
    
    @GetMapping("/traer")
    public List<Acerca> getAcerca(){
        return iacercaService.getAcerca();
    }
    
    @PostMapping("/crear")
    public String saveAcerca(@RequestBody Acerca acerca){
        iacercaService.saveAcerca(acerca);
        return "creado correctamente";
    }
    

    @DeleteMapping("/borrar/{idacerca}")
    public String deleteAcerca(@PathVariable Long idacerca){ iacercaService.deleteAcerca(idacerca);
        return "eliminado correctamente";
    }

    
    @PutMapping("/editar/{idacerca}")
    public Acerca editAcerca(@PathVariable Long idacerca,@RequestParam("nombreacerca") String nuevoNombreacerca,@RequestParam("contactoacerca") String nuevoContactoacerca,@RequestParam("detalleacerca") String nuevoDetalleacerca,@RequestParam("fotoacerca") String nuevoFotoacerca){
                                  
      Acerca acerca = iacercaService.FindAcerca(idacerca);
      acerca.setNombreacerca(nuevoNombreacerca);
      acerca.setContactoacerca(nuevoContactoacerca);
      acerca.setDetalleacerca(nuevoDetalleacerca);
      acerca.setFotoacerca(nuevoFotoacerca);
      
      iacercaService.saveAcerca(acerca);
      return acerca;
    }
    
    @GetMapping("/traer/{idacerca}")
   public Acerca findAcerca(Long idacerca){
       return iacercaService.FindAcerca(idacerca);
   }
}
