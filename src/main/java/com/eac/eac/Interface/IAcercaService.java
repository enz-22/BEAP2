package com.eac.eac.Interface;

import com.eac.eac.Entity.Acerca;
import java.util.List;

public interface IAcercaService {
    public List<Acerca> getAcerca();
    public void saveAcerca(Acerca acerca);
    public void deleteAcerca (Long idacerca);
    public Acerca FindAcerca(Long idacerca);
}
