package co.unicauca.revision.core.servicios;

import co.unicauca.revision.core.accesodatos.modelo.Articulo;
import co.unicauca.revision.core.accesodatos.modelo.Autor;
import co.unicauca.revision.core.accesodatos.modelo.Revisor;
import co.unicauca.revision.core.fachadaservicios.dto.ArticuloDTO;
import co.unicauca.revision.core.fachadaservicios.mapper.ArticuloMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloServiceImpl {
    private final List<Articulo> articulos = new ArrayList<>();
    private final Revisor revisor;

    public ArticuloServiceImpl(Revisor revisor) {
        this.revisor = revisor;
    }

    public ArticuloDTO enviarArticulo(Autor autor, ArticuloDTO articuloDTO) {
        Articulo articulo = ArticuloMapper.INSTANCE.toEntity(articuloDTO);
        articulos.add(articulo);
        autor.getListaArticulos().add(articulo); // Asocia el artículo con el autor
        return ArticuloMapper.INSTANCE.toDto(articulo);
    }

    public void calificarArticulo(int indice, int calTitulo, int calDescripcion, int calResumen, int calKeyword) {
        if (indice >= 0 && indice < articulos.size()) {
            Articulo articulo = articulos.get(indice);
            revisor.calificarArticulo(articulo, calTitulo, calDescripcion, calResumen, calKeyword);
        } else {
            throw new IllegalArgumentException("Índice de artículo inválido.");
        }
    }

    public List<ArticuloDTO> listarArticulos() {
        List<ArticuloDTO> listaDto = new ArrayList<>();
        for (Articulo articulo : articulos) {
            listaDto.add(ArticuloMapper.INSTANCE.toDto(articulo));
        }
        return listaDto;
    }
}
