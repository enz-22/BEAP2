package com.eac.eac.Service;

import com.eac.eac.Entity.Skill;
import com.eac.eac.Interface.ISkillService;
import com.eac.eac.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillService implements ISkillService {
    @Autowired ISkillRepository iskillRepository;
    @Override
    public List<Skill> getSkill() {
        List<Skill> listaskill = iskillRepository.findAll();
        return listaskill;
    }

    @Override
    public String saveSkill(Skill skill) {
        iskillRepository.save(skill);
        return null;
    }

    @Override 
    public String deleteSkill(Long idskill) {
        iskillRepository.deleteById(idskill);
        return null;
    }

    @Override
    public Skill FindSkill(Long idskill) {
        Skill skil = iskillRepository.findById(idskill).orElse(null);
        return skil;
    }
}
