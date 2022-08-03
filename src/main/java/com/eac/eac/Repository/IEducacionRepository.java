package com.eac.eac.Repository;

import com.eac.eac.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducacionRepository extends JpaRepository <Educacion, Long> {
    
}
