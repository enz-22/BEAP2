package com.eac.eac.Service;

import com.eac.eac.Entity.Educacion;
import com.eac.eac.Repository.IEducacionRepository;
import com.eac.eac.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ImpEducacionService implements IEducacionService {
    @Autowired IEducacionRepository ieducacionRepository;
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }
    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }
    @Override
    public void deleteEducacion(Long ideducacion) {
        ieducacionRepository.deleteById(ideducacion);
    }
    @Override
    public Educacion FindEducacion(Long ideducacion) {
        Educacion educacion = ieducacionRepository.findById(ideducacion).orElse(null);
        return educacion;
    }
}
