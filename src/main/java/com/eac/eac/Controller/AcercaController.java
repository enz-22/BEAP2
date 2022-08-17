package com.eac.eac.Controller;

import com.eac.eac.Entity.Acerca;
import com.eac.eac.Service.ImpAcercaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "https://appi2206.herokuapp.com/")
@RequestMapping("api/acerca")
public class AcercaController {

    private final ImpAcercaService impAcercaService;

    public AcercaController(ImpAcercaService impAcercaService) {
        this.impAcercaService = impAcercaService;
    }

    @GetMapping("/id/{idacerca}")
    public ResponseEntity<Acerca> obtenerAcerca(@PathVariable("idacerca") Long idacerca){
        Acerca acerca=impAcercaService.buscarIdAcerca(idacerca);
        return new ResponseEntity<>(acerca, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Acerca> editarAcerca(@RequestBody Acerca acerca){
        Acerca updateAcerca=impAcercaService.editarAcerca(acerca);
        return new ResponseEntity<>(updateAcerca,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Acerca>> buscarAcerca(){
        List<Acerca> acercaLista=impAcercaService.buscarAcerca();
        return new ResponseEntity<>(acercaLista,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Acerca> crearAcerca(@RequestBody Acerca acerca){
        Acerca nuevoAcerca=impAcercaService.addAcerca(acerca);
        return new ResponseEntity<>(nuevoAcerca,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idacerca}")
    public ResponseEntity<?> borrarAcerca(@PathVariable("idacerca") Long idacerca){
        impAcercaService.borrarAcerca(idacerca);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
