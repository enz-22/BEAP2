package com.eac.eac.Service;

import com.eac.eac.Entity.Persona;
import com.eac.eac.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaService {

    private final IPersonaRepository ipersonaRepository;
    @Autowired
    public ImpPersonaService(IPersonaRepository ipersonaRepository) {
        this.ipersonaRepository = ipersonaRepository;
    }

    public Persona addPersona(Persona persona){

        return ipersonaRepository.save(persona);
    }

    public List<Persona> buscarPersona(){

        return ipersonaRepository.findAll();
    }

    public Persona editarPersona(Persona persona){

        return ipersonaRepository.save(persona);
    }

    public void borrarPersona(Long id){

        ipersonaRepository.deleteById(id);
    }

    public Persona buscarIdPersona(Long id){

        return ipersonaRepository.findById(id).orElseThrow(null);
    }



}
