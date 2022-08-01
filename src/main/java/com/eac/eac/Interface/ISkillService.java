package com.eac.eac.Interface;

import com.eac.eac.Entity.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> getSkill();
    public void saveSkill(Skill skill);
    public void deleteSkill (Long idskill);
    public Skill FindSkill(Long idskill);
}
