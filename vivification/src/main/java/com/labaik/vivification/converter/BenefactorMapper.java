package com.labaik.vivification.converter;

import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.dto.BenefactorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface BenefactorMapper {
    BenefactorMapper INSTANCE= Mappers.getMapper(BenefactorMapper.class);
   // @ValueMapping(source = "MALE" , target = "MALE")
     Benefactor benefactorDtoToBenefactor(BenefactorDto benefactorDto);
}
