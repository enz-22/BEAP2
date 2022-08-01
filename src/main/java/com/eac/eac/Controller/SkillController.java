package com.eac.eac.Controller;

import com.eac.eac.Entity.Skill;
import com.eac.eac.Interface.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    @Autowired ISkillService iskillService;
    
    @GetMapping("/api/skills/traer")
    public List<Skill> getSkill(){
        return iskillService.getSkill();
    }
    
    @PostMapping("/api/skills/crear")
    public String createSkill(@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return "creado correctamente";
    }
    
    @DeleteMapping("/api/skills/borrar/{idskill}")
    public String deleteSkill(@PathVariable Long idskill){
    iskillService.deleteSkill(idskill);
    return "borrado correctamente";
    }
    
    @PutMapping("/api/skills/editar/{idskill}")
    public Skill editSkill(@PathVariable Long idskill,
            @RequestParam("uno") String nuevoUno,
            @RequestParam("dos") String nuevoDos,
            @RequestParam("tres") String nuevoTres,
            @RequestParam("cuatro") String nuevoCuatro,
            @RequestParam("cinco") String nuevoCinco,
            @RequestParam("seis") String nuevoSeis,
            @RequestParam("siete") String nuevoSiete,
            @RequestParam("ocho") String nuevoOcho)
                             
                              {
                                  
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
}
