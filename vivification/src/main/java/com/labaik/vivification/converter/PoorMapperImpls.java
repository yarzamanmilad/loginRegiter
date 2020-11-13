package com.labaik.vivification.converter;

import com.labaik.vivification.domain.Account;
import com.labaik.vivification.domain.enums.*;
import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.dto.PoorDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PoorMapperImpls implements PoorMapper {
    @Override
    public Poor poorDtoToPoor(PoorDto poorDto) {
        Poor poor=new Poor();
        poor.setFirstName(poorDto.getFirstName())
                .setLastName(poorDto.getLastName())
                .setNationality(poorDto.getNationality())
                .setState(States.valueOf(poorDto.getState()))
                .setCity(Citys.valueOf(poorDto.getCity()))
                .setPhoneSubscriber(poorDto.getPhoneSubscriber())
                 .setAddressDetails(poorDto.getAddressDetails())
                  .setCreditCardNumber(poorDto.getCreditCardNumber())
                  .setNumberOfChildren(poorDto.getNumberOfChildren())
                  .setNumberOfDisabledChildren(poorDto.getNumberOfDisabledChildren())
        .setGender(Gender.valueOf(poorDto.getGender()))
        .setMaritalStatus(MaritalStatus.valueOf(poorDto.getMaritalStatus()))
        .setMinimumWage(MinimumWage.valueOf(poorDto.getMinimumWage()))
        .setRequestedAmount(poorDto.getRequestedAmount())
                   ;
        List<Roles> roles=new ArrayList<>();
                    roles.add(Roles.valueOf(poorDto.getRole()));
        Account account=new Account();
        account.setRoles(roles);
        account.setEmail(poorDto.getEmail());
        account.setPassword(poorDto.getPassword());
        poor.setAccount(account);





        return poor;
    }

    @Override
    public PoorDto poorToDto(Poor poor) {
        return null;
    }
}
