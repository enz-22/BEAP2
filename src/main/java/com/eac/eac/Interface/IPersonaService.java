package com.eac.eac.Interface;

import com.eac.eac.Entity.Persona;
import java.util.List;

public interface IPersonaService {
  // ver objetos
  List<Persona> getPersona();
  // guardar objeto
  String savePersona(Persona persona);
  // eliminar objeto
  String deletePersona (Long id);
  // ver objeto
  Persona FindPersona(Long id);


}
