package com.eac.eac.Interface;

import com.eac.eac.Entity.Persona;
import java.util.List;



public interface IPersonaService {
   
  //traer una lista de objetos
  public List<Persona> getPersona();

  //Guardar un objeto de tipo persona
  public void savePersona(Persona persona);

  //eliminar un objeto por id
  public void deletePersona (Long id);
     
  //buscar una objeto por id
  
  public Persona FindPersona(Long id);


}
