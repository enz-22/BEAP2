package com.eac.eac.Controller;

import com.eac.eac.Entity.Skill;
import com.eac.eac.Service.ImpSkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("api/skills")
public class SkillController {

    private final ImpSkillService impSkillService;

    public SkillController(ImpSkillService impSkillService) {
        this.impSkillService = impSkillService;
    }

    @GetMapping("/id/{idSkill}")
    public ResponseEntity<Skill> obtenerSkill(@PathVariable("idSkill") Long idSkill){
        Skill skill=impSkillService.buscarIdSkill(idSkill);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> editarSkill(@RequestBody Skill skill){
        Skill updateSkill=impSkillService.editarSkill(skill);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> buscarSkill(){
        List<Skill> skillLista=impSkillService.buscarSkill();
        return new ResponseEntity<>(skillLista,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill){
        Skill nuevoSkill=impSkillService.addSkill(skill);
        return new ResponseEntity<>(nuevoSkill,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idSkill}")
    public ResponseEntity<?> borrarSkill(@PathVariable("idSkill") Long idSkill){
        impSkillService.borrarSkill(idSkill);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
