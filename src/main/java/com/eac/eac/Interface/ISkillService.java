package com.eac.eac.Interface;

import com.eac.eac.Entity.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> getSkill();
    public String saveSkill(Skill skill);
    public String deleteSkill (Long idskill);
    public Skill FindSkill(Long idskill);
}
