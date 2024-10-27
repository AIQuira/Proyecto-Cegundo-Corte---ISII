package co.unicauca.revision.core.accesodatos.repositorios;

import co.unicauca.revision.core.accesodatos.modelo.Revisor;
import java.util.List;

public interface InterfaceRepositorioRevisor {
    public boolean almacenarRevisores(Revisor objRevisor);
    public List<Revisor> listarRevisores();
}
