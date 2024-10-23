package co.unicauca.conferencia.core.accesoDatos.repositories;

import java.util.ArrayList;
import java.util.List;
import co.unicauca.conferencia.core.accesoDatos.model.ConferenceEntity;

import org.springframework.stereotype.Repository;

@Repository
public class ConferenciaRepository {

    private ArrayList<ConferenceEntity> listaConferencias;

    public ConferenciaRepository() {    
        this.listaConferencias = new ArrayList<ConferenceEntity>();
    }

    public List<ConferenceEntity> findAll(){
        System.out.println("Invocando a Listar Clientes");
        return this.listaConferencias;
    }

}
