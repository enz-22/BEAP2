package com.eac.eac.Service;

import com.eac.eac.Entity.Proyecto;
import com.eac.eac.Repository.IProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpProyectoService {
    private final IProyectoRepository iproyectoRepository;

    @Autowired
    public ImpProyectoService(IProyectoRepository iproyectoRepository) {
        this.iproyectoRepository = iproyectoRepository;
    }

    public Proyecto addProyecto(Proyecto proyecto){

        return iproyectoRepository.save(proyecto);
    }

    public List<Proyecto> buscarProyecto(){

        return iproyectoRepository.findAll();
    }

    public Proyecto editarProyecto(Proyecto proyecto){

        return iproyectoRepository.save(proyecto);
    }

    public void borrarProyecto(Long idPro){

        iproyectoRepository.deleteById(idPro);
    }

    public Proyecto buscarIdProyecto(Long idPro){

        return iproyectoRepository.findById(idPro).orElseThrow(null);
    }
}
