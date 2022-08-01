package com.eac.eac.Controller;

import com.eac.eac.Entity.Persona;
import com.eac.eac.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/personas")
public class PersonaController {
   @Autowired 
   private IPersonaService ipersonaService;
   
  // @GetMapping("/traer")
  // public List<Persona> getPersona(){
  //      return ipersonaService.getPersona();
  // }
   
   @GetMapping("/traer")
   public ResponseEntity<List<Persona>> getPersona(){
    List<Persona> edu=ipersonaService.getPersona();
    return new ResponseEntity<>(edu, HttpStatus.OK);
}
     
   @PostMapping("/crear")
   public String createPersona(@RequestBody Persona persona){
       ipersonaService.savePersona(persona);
       return "La persona fue creada correctamente";
   }
   
   @DeleteMapping("/borrar/{id}")
   public String deletePersona(@PathVariable Long id){
       ipersonaService.deletePersona(id);
       return "La persona fue eliminada correctamente";
   }
   
   @PutMapping("/editar/{id}")
   public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("img") String nuevoImg)
                                {

       Persona persona = ipersonaService.FindPersona(id);
       persona.setNombre(nuevoNombre);
       persona.setApellido(nuevoApellido);
       persona.setImg(nuevoImg);
       
       
       ipersonaService.savePersona(persona);
       return persona;
   }
   
   @GetMapping("/traer/{id}")
   public Persona FindPersona(Long id){
       return ipersonaService.FindPersona((long) id);
   }
   
   
}
