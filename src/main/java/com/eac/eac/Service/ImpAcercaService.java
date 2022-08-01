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
        List<Acerca> acerca = iacercaRepository.findAll();
        return acerca;
    }

    @Override
    public void saveAcerca(Acerca acerca) {
        iacercaRepository.save(acerca);
    }

    @Override
    public void deleteAcerca(Long idacerca) {
        iacercaRepository.deleteById(idacerca);
    }

    @Override
    public Acerca FindAcerca(Long idacerca) {
        Acerca acerca = iacercaRepository.findById(idacerca).orElse(null);
        return acerca;
    }
    
}
