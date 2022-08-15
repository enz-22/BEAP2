package com.eac.eac.Service;

import com.eac.eac.Entity.Acerca;
import com.eac.eac.Repository.IAcercaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpAcercaService {
    public final IAcercaRepository iacercaRepository;

    @Autowired
    public ImpAcercaService(IAcercaRepository iacercaRepository) {
        this.iacercaRepository = iacercaRepository;
    }

    public Acerca addAcerca(Acerca acerca){
        return iacercaRepository.save(acerca);
    }

    public List<Acerca> buscarAcerca(){
        return iacercaRepository.findAll();
    }

    public Acerca editarAcerca(Acerca acerca){
        return iacercaRepository.save(acerca);
    }

    public void borrarAcerca(Long idacerca){
        iacercaRepository.deleteById(idacerca);
    }

    public Acerca buscarIdAcerca(Long idacerca){
        return iacercaRepository.findById(idacerca).orElseThrow(null);
    }
}
