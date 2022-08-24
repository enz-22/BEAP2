package com.eac.eac.Service;

import com.eac.eac.Entity.Experiencia;
import com.eac.eac.Repository.IExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpExperienciaService {
    private final IExperienciaRepository iexperienciaRepository;

    @Autowired
    public ImpExperienciaService(IExperienciaRepository iexperienciaRepository) {
        this.iexperienciaRepository = iexperienciaRepository;
    }

    public Experiencia addExperiencia(Experiencia experiencia){

        return iexperienciaRepository.save(experiencia);
    }

    public List<Experiencia> buscarExperiencia(){

        return iexperienciaRepository.findAll();
    }

    public Experiencia editarExperiencia(Experiencia experiencia){

        return iexperienciaRepository.save(experiencia);
    }

    public void borrarExperiencia(Long idExp){

        iexperienciaRepository.deleteById(idExp);
    }

    public Experiencia buscarIdExperiencia(Long idExp){
        return iexperienciaRepository.findById(idExp).orElseThrow(null);
    }
}
