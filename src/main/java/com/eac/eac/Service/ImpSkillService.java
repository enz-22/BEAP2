package com.eac.eac.Service;

import com.eac.eac.Entity.Skill;
import com.eac.eac.Repository.ISkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpSkillService {

    private final ISkillRepository iSkillRepository;
    @Autowired
    public ImpSkillService(ISkillRepository iSkillRepository) {
        this.iSkillRepository = iSkillRepository;
    }


    public Skill addSkill(Skill skill){

        return iSkillRepository.save(skill);
    }

    public List<Skill> buscarSkill(){

        return iSkillRepository.findAll();
    }

    public Skill editarSkill(Skill skill){

        return iSkillRepository.save(skill);
    }

    public void borrarSkill(Long idSkill){

        iSkillRepository.deleteById(idSkill);
    }

    public Skill buscarIdSkill(Long idSkill){

        return iSkillRepository.findById(idSkill).orElseThrow(null);
    }
}
