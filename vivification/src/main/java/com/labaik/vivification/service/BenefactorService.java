package com.labaik.vivification.service;

import com.labaik.vivification.converter.BenefactorMapperImpls;
import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.dto.BenefactorDto;
import com.labaik.vivification.repository.BenefactorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BenefactorService {
   //private final BenefactorMapper benefactorMapper;
    private final PasswordEncoder encoder;
    private final BenefactorMapperImpls benefactorMapper;
    private final BenefactorRepository benefactorRepository;

    public void register(BenefactorDto benefactorDto){
        System.out.println(benefactorDto);
        Benefactor benefactor=benefactorMapper.benefactorDtoToBenefactor(benefactorDto);
        System.out.println(benefactor.getFirstName());
        benefactor.getAccount().setPassword(encoder.encode(benefactor.getAccount().getPassword()));
        benefactorRepository.save(benefactor);
    }

}
