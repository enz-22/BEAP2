package com.eac.eac.Controller;

import com.eac.eac.Entity.Skill;
import com.eac.eac.Interface.ISkillService;
import java.util.List;
import com.eac.eac.Service.ImpSkillService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api/skills")
public class SkillController extends ImpSkillService {
    @Autowired ISkillService iskillService;
    
    @GetMapping("/traer")
    public List<Skill> getSkill(){

        return iskillService.getSkill();
    }

    @PostMapping("/crear")
    public String saveSkill(@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return "creado correctamente";
    }

    @DeleteMapping("/borrar/{idskill}")
    public String deleteSkill(@PathVariable Long idskill){
    iskillService.deleteSkill(idskill);
    return "borrado correctamente";
    }
    
    @PutMapping("/editar/{idskill}")
    public Skill editSkill(@PathVariable Long idskill,
            @RequestParam("uno") String nuevoUno,@RequestParam("dos") String nuevoDos,@RequestParam("tres") String nuevoTres,@RequestParam("cuatro") String nuevoCuatro,@RequestParam("cinco") String nuevoCinco,@RequestParam("seis") String nuevoSeis,@RequestParam("siete") String nuevoSiete,@RequestParam("ocho") String nuevoOcho){
                                  
      Skill skill = iskillService.FindSkill(idskill);
      skill.setUno(nuevoUno);
      skill.setDos(nuevoDos);
      skill.setTres(nuevoTres);
      skill.setCuatro(nuevoCuatro);
      skill.setCinco(nuevoCinco);
      skill.setSeis(nuevoSeis);
      skill.setSiete(nuevoSiete);
      skill.setOcho(nuevoOcho);
      
      iskillService.saveSkill(skill);
      return skill;
    }

    @GetMapping("/traer/{idskill}")
    public Skill findSkill(Long idskill){
        return iskillService.FindSkill(idskill);
    }
}
