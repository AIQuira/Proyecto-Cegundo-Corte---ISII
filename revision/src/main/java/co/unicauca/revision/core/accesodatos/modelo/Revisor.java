package co.unicauca.revision.core.accesodatos.modelo;

import co.unicauca.revision.core.accesodatos.modelo.Persona;

public class Revisor extends Persona{
    
    private String tituloUniversitario;
    
    public Revisor(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }
    
}
