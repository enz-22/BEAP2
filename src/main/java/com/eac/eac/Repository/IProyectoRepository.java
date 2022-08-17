package com.eac.eac.Repository;

import com.eac.eac.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long> {

}
