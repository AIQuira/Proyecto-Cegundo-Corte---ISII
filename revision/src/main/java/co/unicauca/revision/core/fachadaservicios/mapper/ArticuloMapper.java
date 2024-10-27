package co.unicauca.revision.core.fachadaservicios.mapper;

import co.unicauca.revision.core.accesodatos.modelo.Articulo;
import co.unicauca.revision.core.fachadaservicios.dto.ArticuloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ArticuloMapper {
    ArticuloMapper INSTANCE = Mappers.getMapper(ArticuloMapper.class);

    ArticuloDTO toDto(Articulo articulo);
    Articulo toEntity(ArticuloDTO articuloDTO);
}
