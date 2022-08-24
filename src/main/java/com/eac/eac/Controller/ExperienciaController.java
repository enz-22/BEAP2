package com.eac.eac.Controller;

import com.eac.eac.Entity.Experiencia;
import com.eac.eac.Service.ImpExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://appieac.web.app/")
@RequestMapping("api/experiencia")
public class ExperienciaController {

    private final ImpExperienciaService impExperienciaService;

    public ExperienciaController(ImpExperienciaService impExperienciaService) {
        this.impExperienciaService = impExperienciaService;
    }

    @GetMapping("/id/{idExp}")
    public ResponseEntity<Experiencia> obtenerExperiencia(@PathVariable("idExp") Long idExp){
        Experiencia experiencia=impExperienciaService.buscarIdExperiencia(idExp);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=impExperienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> buscarExperiencia(){
        List<Experiencia> experienciaLista=impExperienciaService.buscarExperiencia();
        return new ResponseEntity<>(experienciaLista, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevoExperiencia=impExperienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevoExperiencia,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idExp}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("idExp") Long idExp){
        impExperienciaService.borrarExperiencia(idExp);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
