package com.eac.eac.Service;

import com.eac.eac.Entity.Persona;
import com.eac.eac.Interface.IPersonaService;
import com.eac.eac.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> listapersona = ipersonaRepository.findAll();
        return listapersona;
        
    }
       
    @Override
    public String savePersona(Persona persona) {

        ipersonaRepository.save(persona);
        return null;
    }

    @Override
    public String deletePersona(Long id) {

        ipersonaRepository.deleteById(id);
        return null;
    }

    @Override
    public Persona FindPersona(Long id) {
        Persona pers = ipersonaRepository.findById(id).orElse(null);
        return pers;
        
    }


    
}
