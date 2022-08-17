package com.eac.eac.Controller;


import com.eac.eac.Entity.Persona;
import java.util.List;
import com.eac.eac.Service.ImpPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "https://appieac.web.app")
@RequestMapping("/api/personas")
public class PersonaController {

    private final ImpPersonaService impPersonaService;

    public PersonaController(ImpPersonaService impPersonaService) {
        this.impPersonaService = impPersonaService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona=impPersonaService.buscarIdPersona(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=impPersonaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> buscarPersona(){
        List<Persona> personaLista=impPersonaService.buscarPersona();
        return new ResponseEntity<>(personaLista, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona){
        Persona nuevoPersona=impPersonaService.addPersona(persona);
        return new ResponseEntity<>(nuevoPersona, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idPro}")
    public ResponseEntity<?> borrarPersona(@PathVariable("id") Long id){
        impPersonaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
