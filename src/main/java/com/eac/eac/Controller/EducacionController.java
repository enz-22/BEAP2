package com.eac.eac.Controller;

import com.eac.eac.Entity.Educacion;
import com.eac.eac.Service.ImpEducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "https://appieac.web.app")
@RequestMapping("api/educacion")
public class EducacionController {

    private final ImpEducacionService impEducacionService;


    public EducacionController(ImpEducacionService impEducacionService) {
        this.impEducacionService = impEducacionService;
    }

    @GetMapping("/id/{idEdu}")
    public ResponseEntity<Educacion> obtenerEducacion(@PathVariable("idEdu")Long idEdu){
        Educacion educacion=impEducacionService.buscarIdEducacion(idEdu);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=impEducacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> buscarEducacion(){
        List<Educacion> educacionLista=impEducacionService.buscarEducacion();
        return new ResponseEntity<>(educacionLista,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevoEducacion=impEducacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevoEducacion,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idEdu}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("idEdu")Long idEdu){
        impEducacionService.borrarEducacion(idEdu);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
