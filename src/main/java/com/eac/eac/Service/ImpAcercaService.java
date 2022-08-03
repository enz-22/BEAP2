package com.eac.eac.Service;

import com.eac.eac.Entity.Acerca;
import com.eac.eac.Interface.IAcercaService;
import com.eac.eac.Repository.IAcercaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAcercaService implements IAcercaService {
    @Autowired IAcercaRepository iacercaRepository;
    @Override
    public List<Acerca> getAcerca() {
        List<Acerca> listaacercas = iacercaRepository.findAll();
        return listaacercas;
    }

    @Override
    public String saveAcerca(Acerca acerca) {
        iacercaRepository.save(acerca);
        return null;
    }

    @Override
    public String deleteAcerca(Long idacerca) {
        iacercaRepository.deleteById(idacerca);
        return null;
    }

    @Override
    public Acerca FindAcerca(Long idacerca) {
        Acerca acer = iacercaRepository.findById(idacerca).orElse(null);
        return acer;
    }
    
}
