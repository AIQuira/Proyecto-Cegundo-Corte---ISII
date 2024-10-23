package co.unicauca.conferencia.core.accesoDatos.repositories;

import java.util.ArrayList;
import java.util.List;
import co.unicauca.conferencia.core.accesoDatos.model.ConferenceEntity;

import org.springframework.stereotype.Repository;

@Repository
public class ConferenceRepository {

    private ArrayList<ConferenceEntity> listaConferencias;

    public ConferenceRepository() {    
        this.listaConferencias = new ArrayList<ConferenceEntity>();
    }

    /**
     * Constructor que inicializa la lista de conferencias
     */
    public List<ConferenceEntity> findAll(){
        System.out.println("Invocando a Listar Clientes");
        return this.listaConferencias;
    }

    /**
     * Busca una conferencia por su Id
     * @param id
     * @return
     */
    public ConferenceEntity findById(Integer id){
        System.out.println("Invocando a buscar Cliente por Id");
        ConferenceEntity objConference = null;

        for (ConferenceEntity conference : listaConferencias) {
            if (conference.getId().equals(id)) {
                objConference = conference;
                break;
            }
        }

        return objConference;
    }

    /**
     * Guarda una conferencia
     * @param conference
     * @return
     */
    public ConferenceEntity save(ConferenceEntity conference){
        System.out.println("Invocando a guardar Cliente");
        ConferenceEntity objConference = null;

        if(this.listaConferencias.add(conference)){
            objConference = conference;
        }

        return objConference;
    }

    /**
     * Modifica una conferencia por su Id
     * @param id
     * @param conference
     * @return
     */
    public ConferenceEntity update(Integer id, ConferenceEntity conference)
    {
        System.out.println("Invocando a actualizar Conferencia");
        ConferenceEntity objConference = null;

        for(int i=0; i < this.listaConferencias.size(); i++)
        {
            if(this.listaConferencias.get(i).getId() == id)
            {
                this.listaConferencias.set(i, conference);
                objConference = conference;
                break;
            }
        }
        return objConference;
    }

    /**
     * Elimina una conferencia por su Id
     * @param id
     * @return
     */
    public boolean delete(Integer id){
        System.out.println("Invocando a eliminar Conferencia");
        boolean bandera = false;

        for (ConferenceEntity conference : listaConferencias) {
            if (conference.getId().equals(id)) {
                bandera = this.listaConferencias.remove(conference);
                break;
            }
        }

        return bandera;
    }
}
