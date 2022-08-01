package com.eac.eac.Repository;

import com.eac.eac.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISkillRepository extends JpaRepository<Skill, Long> {
    
}
