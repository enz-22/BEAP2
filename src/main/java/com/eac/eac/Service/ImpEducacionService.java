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
        List<Educacion> listaeducacion = ieducacionRepository.findAll();
        return listaeducacion;
    }
    @Override
    public String saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
        return null;
    }
    @Override
    public String deleteEducacion(Long ideducacion) {
        ieducacionRepository.deleteById(ideducacion);
        return null;
    }
    @Override
    public Educacion FindEducacion(Long ideducacion) {
        Educacion educ = ieducacionRepository.findById(ideducacion).orElse(null);
        return educ;
    }
}
