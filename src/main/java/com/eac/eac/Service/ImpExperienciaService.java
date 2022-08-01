package com.eac.eac.Service;

import com.eac.eac.Entity.Experiencia;
import com.eac.eac.Interface.IExperienciaService;
import com.eac.eac.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService {
    @Autowired IExperienciaRepository iexperienciaRepository;
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override 
    public void deleteExperiencia(Long idexperiencia) {
        iexperienciaRepository.deleteById(idexperiencia);
    }

    @Override
    public Experiencia FindExperiencia(Long idexperiencia) {
        Experiencia experiencia = iexperienciaRepository.findById(idexperiencia).orElse(null);
        return experiencia;
    }

    

    
    
}
