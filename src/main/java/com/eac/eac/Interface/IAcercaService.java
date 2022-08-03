package com.eac.eac.Interface;

import com.eac.eac.Entity.Acerca;
import java.util.List;

public interface IAcercaService {
    List<Acerca> getAcerca();
    String saveAcerca(Acerca acerca);
    String deleteAcerca (Long idacerca);
    Acerca FindAcerca(Long idacerca);
}
