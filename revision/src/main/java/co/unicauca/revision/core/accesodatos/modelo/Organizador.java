package co.unicauca.revision.core.accesodatos.modelo;

import co.unicauca.revision.core.accesodatos.modelo.Persona;

public class Organizador extends Persona{

    private String areaEspecializada;

    public Organizador(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public String getAreaEspecializada() {
        return areaEspecializada;
    }

    public void setAreaEspecializada(String areaEspecializada) {
        this.areaEspecializada = areaEspecializada;
    }
    
}
