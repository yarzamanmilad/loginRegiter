package com.labaik.vivification.converter;

import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.dto.PoorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PoorMapper {
    PoorMapper instance= Mappers.getMapper(PoorMapper.class);
    Poor poorDtoToPoor(PoorDto poorDto);
}
