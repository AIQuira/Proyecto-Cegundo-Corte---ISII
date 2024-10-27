package co.unicauca.revision.core.accesodatos.modelo;

import co.unicauca.revision.core.accesodatos.modelo.Articulo;
import co.unicauca.revision.core.accesodatos.modelo.Persona;
import java.util.List;

public class Autor extends Persona{
    
    private List<Articulo> listaArticulos;

    public Autor(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    
}
