package com.eac.eac.Interface;

import com.eac.eac.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion educacion);
    
    public void deleteEducacion (Long ideducacion);
    
    public Educacion FindEducacion(Long ideducacion);
    
}
