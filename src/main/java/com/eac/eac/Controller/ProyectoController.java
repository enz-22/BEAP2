package com.eac.eac.Controller;

import com.eac.eac.Entity.Proyecto;
import com.eac.eac.Service.ImpProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "https://appi2206.herokuapp.com/")
@RequestMapping("api/proyecto")
public class ProyectoController {
    private final ImpProyectoService impProyectoService;

    public ProyectoController(ImpProyectoService impProyectoService) {

        this.impProyectoService = impProyectoService;
    }

    @GetMapping("/id/{idPro}")
        public ResponseEntity<Proyecto> obtenerProyecto(@PathVariable("idPro") Long idPro){
        Proyecto proyecto=impProyectoService.buscarIdProyecto(idPro);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
        }

    @PutMapping("/update")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto){
        Proyecto updateProyecto=impProyectoService.editarProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto,HttpStatus.OK);
        }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> buscarProyecto(){
        List<Proyecto> proyectoLista=impProyectoService.buscarProyecto();
        return new ResponseEntity<>(proyectoLista, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
        Proyecto nuevoProyecto=impProyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idPro}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("idPro") Long idPro){
        impProyectoService.borrarProyecto(idPro);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
