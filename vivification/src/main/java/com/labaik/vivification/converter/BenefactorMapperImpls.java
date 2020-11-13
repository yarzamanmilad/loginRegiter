package com.labaik.vivification.converter;

import com.labaik.vivification.domain.Account;
import com.labaik.vivification.domain.enums.Gender;
import com.labaik.vivification.domain.enums.Roles;
import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.dto.BenefactorDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BenefactorMapperImpls implements BenefactorMapper {
    @Override
    public Benefactor benefactorDtoToBenefactor(BenefactorDto benefactorDto) {
        Benefactor benefactor=new Benefactor();
        benefactor.setFirstName(benefactorDto.getFirstName())
                .setLastName(benefactorDto.getLastName())
                .setNationality(benefactorDto.getNationality())
                .setPhoneSubscriber(benefactorDto.getPhoneSubscriber())
        .setGender(Gender.valueOf(benefactorDto.getGender()));

        List<Roles> roles=new ArrayList<>();
        roles.add(Roles.valueOf(benefactorDto.getRole()));
        Account account=new Account();
        account.setRoles(roles);
        account.setEmail(benefactorDto.getEmail());
        account.setPassword(benefactorDto.getPassword());
        benefactor.setAccount(account);
        return benefactor;
    }

    @Override
    public BenefactorDto benefactorToDto(Benefactor benefactor) {
        return null;
    }
}
