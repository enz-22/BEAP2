package com.eac.eac.Repository;

import com.eac.eac.Entity.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcercaRepository extends JpaRepository <Acerca,Long>{
    
}
