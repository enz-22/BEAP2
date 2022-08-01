package com.eac.eac.Interface;

import com.eac.eac.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    public void saveExperiencia(Experiencia experiencia);
    public void deleteExperiencia (Long idexperiencia);
    public Experiencia FindExperiencia(Long idexperiencia);
}
