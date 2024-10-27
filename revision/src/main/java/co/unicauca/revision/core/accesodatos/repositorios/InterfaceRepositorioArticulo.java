package co.unicauca.revision.core.accesodatos.repositorios;

import co.unicauca.revision.core.accesodatos.modelo.Articulo;
import java.util.List;

public interface InterfaceRepositorioArticulo {
    public boolean almacenarArticulo(Articulo objArticulo);
    public List<Articulo> listarArticulos();
    public boolean eliminarArticulo(int idArticulo);
    public Articulo consultarArticulo(int idArticulo);
    public boolean actualizarArticulo(Articulo objArticulo);
}
