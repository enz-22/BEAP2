package com.eac.eac.Controller;

import com.eac.eac.Entity.Persona;
import com.eac.eac.Interface.IPersonaService;
import java.util.List;
import com.eac.eac.Service.ImpPersonaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api/personas")
public class PersonaController extends ImpPersonaService {
   @Autowired
   public IPersonaService ipersonaService;
   
  @GetMapping("/traer")
  public List<Persona> getPersona(){ return ipersonaService.getPersona();
  }
   

   @PostMapping("/crear")
   public String savePersona(@RequestBody Persona persona){ ipersonaService.savePersona(persona);
       return "creado correctamente";
   }
   
   @DeleteMapping("/borrar/{id}")
   public String deletePersona(@PathVariable Long id){ ipersonaService.deletePersona(id);
       return "eliminado correctamente";
   }


    @PutMapping("/editar/{id}")
   public Persona editPersona(@PathVariable Long id,@RequestParam("nombre") String nuevoNombre,@RequestParam("apellido") String nuevoApellido,@RequestParam("img") String nuevoImg){
        Persona persona = ipersonaService.FindPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
       ipersonaService.savePersona(persona);
       return persona;
   }
   
   @GetMapping("/traer/perfil")
   public Persona FindPersona(Long id){return ipersonaService.FindPersona(id);
   }
   
   
}
