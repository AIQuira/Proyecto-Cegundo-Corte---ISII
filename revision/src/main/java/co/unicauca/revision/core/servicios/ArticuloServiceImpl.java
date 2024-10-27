package co.unicauca.revision.core.servicios;

import co.unicauca.revision.core.fachadaservicios.DTO.InterfaceRepositorioArticulo;
import co.unicauca.revision.core.accesodatos.modelo.Articulo;
import java.util.List;


public class ArticuloServiceImpl {
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;
    
    public ArticuloServiceImpl(InterfaceRepositorioArticulo referenciaRepositorioArticulo)
    {
        this.referenciaRepositorioArticulo=referenciaRepositorioArticulo;
    }
    
    public boolean almacenarArticulo(Articulo objArticulo)
    {
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }
      
    public List<Articulo> listarArticulos()
    {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }
    
    public boolean eliminarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }
    
    public Articulo consultarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }
    
    public boolean actualizarArticulo(Articulo objArticulo)
    {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }
}
