package com.labaik.vivification.converter;

import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.dto.BenefactorDto;
import com.labaik.vivification.dto.PoorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PoorMapper {
    PoorMapper instance= Mappers.getMapper(PoorMapper.class);

/*
    @Mappings( {@Mapping(target="account.email", source = "email"),
            @Mapping(target="account.password", source = "password"),
            @Mapping(target = "account.roles",source = "role")})*/
    Poor poorDtoToPoor(PoorDto poorDto);
    /*
    @Mappings( {@Mapping(source="poor.account.email", target = "email"),
            @Mapping(source="poor.account.password", target = "password")})*/
    PoorDto poorToDto(Poor poor);
}
