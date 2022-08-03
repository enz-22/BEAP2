package com.eac.eac.Interface;

import com.eac.eac.Entity.Educacion;

import java.util.List;

public interface IEducacionService {
    List<Educacion> getEducacion();
    
    String saveEducacion(Educacion educacion);
    
    String deleteEducacion (Long ideducacion);
    
    Educacion FindEducacion(Long ideducacion);
    
}
