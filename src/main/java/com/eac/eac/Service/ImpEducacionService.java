package com.eac.eac.Service;

import com.eac.eac.Entity.Educacion;
import com.eac.eac.Repository.IEducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ImpEducacionService {
    private final IEducacionRepository ieducacionRepository;
    @Autowired
    public ImpEducacionService(IEducacionRepository ieducacionRepository) {
        this.ieducacionRepository = ieducacionRepository;
    }

    public Educacion addEducacion(Educacion educacion){
        return ieducacionRepository.save(educacion);
    }
    public List<Educacion> buscarEducacion(){
        return ieducacionRepository.findAll();
    }

    public Educacion editarEducacion(Educacion educacion){
        return ieducacionRepository.save(educacion);
    }

    public void borrarEducacion(Long idEdu){
        ieducacionRepository.deleteById(idEdu);
    }

    public Educacion buscarIdEducacion(Long idEdu){
        return ieducacionRepository.findById(idEdu).orElseThrow(null);
    }
}
