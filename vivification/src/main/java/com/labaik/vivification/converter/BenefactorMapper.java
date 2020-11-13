package com.labaik.vivification.converter;

import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.dto.BenefactorDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
public interface BenefactorMapper {
    BenefactorMapper INSTANCE= Mappers.getMapper(BenefactorMapper.class);
   // @ValueMapping(source = "MALE" , target = "MALE")
    /*@ValueMappings({@ValueMapping(source="benefactor.account.role", target = "role"),
            @ValueMapping(source="benefactor.account.email", target = "email"),
            @ValueMapping(source="benefactor.account.password", target = "password")})*/
/*
    @Mappings( {@Mapping(target="account.email", source = "email"),
            @Mapping(target="account.password", source = "password"),
             @Mapping(target = "account.roles",source = "role")})*/
     Benefactor benefactorDtoToBenefactor(BenefactorDto benefactorDto);/*
    @Mappings( {@Mapping(source="benefactor.account.email", target = "email"),
            @Mapping(source="benefactor.account.password", target = "password")})*/
    BenefactorDto benefactorToDto(Benefactor benefactor);
}
