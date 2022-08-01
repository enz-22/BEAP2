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
        List<Skill> skill = iskillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRepository.save(skill);
    }

    @Override 
    public void deleteSkill(Long idskill) {
        iskillRepository.deleteById(idskill);
    }

    @Override
    public Skill FindSkill(Long idskill) {
        Skill skill = iskillRepository.findById(idskill).orElse(null);
        return skill;
    }
}
